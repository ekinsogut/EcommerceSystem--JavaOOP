package Operations;
import Patterns.Strategy;
import Models.Category;
import Models.Customer;
import Models.Database;
import Models.Admin;
import Models.Product;
import Models.Sales;
import Models.Seller;
import Models.Users;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseOperations {
    
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    //Singleton
    private static DatabaseOperations databaseOperations = new DatabaseOperations();
    
    
    //Db connection
    private DatabaseOperations() {
        
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_name+ "?useUnicode=true&characterEncoding=utf8";
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
              
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found!");
        }
        
        try {
            con = DriverManager.getConnection(url, Database.username, Database.password);
            System.out.println("Connection succesful...");
            
        } catch (SQLException ex) {
            System.out.println("Connection failed...");
            //ex.printStackTrace();
        }  
    } 
    
    //Singleton
    public static DatabaseOperations getDatabaseOperations(){
        
        return databaseOperations;
    }
    
    //Factory
    public boolean adminLoginOperation(Admin admininfo) {
 
        String query = "Select * From admin where username = ? and password = ?";
        try {
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, admininfo.getMail());
            preparedStatement.setString(2, admininfo.getPasswordAd());
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
               
        } catch (SQLException ex) {
            
            ex.printStackTrace();
            return false;
        }
    }
    
    //Factory
    public boolean customerLoginOperation(Customer customerinfo) {
        
        String query = "Select * From customer where mail = ? and password = ?";
        
        try {
            
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, customerinfo.getMail());
            preparedStatement.setInt(2, customerinfo.getPasswordCus());
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
               
        } catch (SQLException ex) {
            
            ex.printStackTrace();
            return false;
        } 
    }

    
   //Facade
    public ArrayList<Seller> sellerBring() {
        
        ArrayList<Seller> list = new ArrayList<Seller>();
        
        try {
            statement = con.createStatement();
            
            String query = "Select * From seller";
        
            ResultSet rs = statement.executeQuery(query);
        
            while(rs.next()) {
                
                int id = rs.getInt("seller_id");
                String name = rs.getString("name");
                
                list.add(new Seller(id , name)); 
            }   
            
            return list;
   
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    //Facade
    public ArrayList<Category> categoryBring() {
        
        ArrayList<Category> list = new ArrayList<Category>();
        
        try {
            statement = con.createStatement();
            
            String query = "Select * From category";
        
            ResultSet rs = statement.executeQuery(query);
        
            while(rs.next()) {
                
                int id = rs.getInt("category_id");
                String name = rs.getString("name");
                
                list.add(new Category(id, name)); 
            }   
            
            return list;
   
        } catch (SQLException ex) {
             ex.printStackTrace();
            return null;
        }
    }
    
    //Facade
    public ArrayList<Product> productBring() {
        
        ArrayList<Product> list = new ArrayList<Product>();
        
        try {
            statement = con.createStatement();
            
            String query = "Select * From product";
        
            ResultSet rs = statement.executeQuery(query);
        
            while(rs.next()) {
                
                int product_id = rs.getInt("product_id");
                String name = rs.getString("name");
                int category_id = rs.getInt("category_id");
                int stock = rs.getInt("stock");
                int price = rs.getInt("price");
                int seller_id = rs.getInt("seller_id");
                
                list.add(new Product(product_id, name, category_id, stock, price, seller_id)); 
            }   
            
            return list;
   
        } catch (SQLException ex) {
             ex.printStackTrace();
            return null;
        }
    }
    
    
    public ArrayList<Sales> salesBring(int id) {
        
        ArrayList<Sales> list = new ArrayList<Sales>();
        
        String query = "Select * From sales where customer_id = ?";
        
        try {
            
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
        
            while(rs.next()) {
                
                int sales_id = rs.getInt("sales_id");
                int customer_id = rs.getInt("customer_id");
                int product_id = rs.getInt("product_id");
                int total_price = rs.getInt("total_price");
                String name = rs.getString("name");
                int piece = rs.getInt("piece");
                
                list.add(new Sales(sales_id, customer_id, product_id, total_price, name ,piece)); 
            }   
            
            return list;
   
        } catch (SQLException ex) {
             ex.printStackTrace();
            return null;
        }
    }
     
    //Adapter
    public void sellerAdd(Seller sellerinfo) {
        
        String query = "Insert Into seller (name) VALUES(?)";
         
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, sellerinfo.getName());

            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
             ex.printStackTrace();
        }  
    }
    
    public void sellerUpdate(Seller sellerinfo) {
        
        String query = "Update seller set name = ? where seller_id = ? ";
        
        try {
            
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1,sellerinfo.getName());
            preparedStatement.setInt(2, sellerinfo.getSeller_id());
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
             ex.printStackTrace();   
        }
    }
    
    //Adapter
    public void categoryAdd(Category categoryinfo) {
        
        String query = "Insert Into category (name) VALUES(?)";
         
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, categoryinfo.getName());

            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
             ex.printStackTrace();
        }  
    }
    
     
    public void categoryUpdate(Category categoryinfo) {
        
        String query = "Update category set name = ? where category_id = ? ";
        
        try {
            
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1,categoryinfo.getName());
            preparedStatement.setInt(2, categoryinfo.getCategory_id());
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
             ex.printStackTrace();;  
        }
    }
     
    public void productAdd(Product productinfo) {
        
        String query = "Insert Into product (name,category_id,stock,price,seller_id) VALUES(?,?,?,?,?)";
         
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, productinfo.getName());
            preparedStatement.setInt(2, productinfo.getCategory_id());
            preparedStatement.setInt(3, productinfo.getStock());
            preparedStatement.setInt(4, productinfo.getPrice());
            preparedStatement.setInt(5, productinfo.getSeller_id());

            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
             ex.printStackTrace();
        }  
    }
     
    public void productUpdate(Product productinfo) {
        
        String query = "Update product set name = ? , category_id = ? , stock = ? , price = ? , seller_id = ?  where product_id = ? ";
        
        try {
            
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1,productinfo.getName());
            preparedStatement.setInt(2,productinfo.getCategory_id());
            preparedStatement.setInt(3,productinfo.getStock());
            preparedStatement.setInt(4,productinfo.getPrice());
            preparedStatement.setInt(5,productinfo.getSeller_id());
            preparedStatement.setInt(6, productinfo.getProduct_id());
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
             ex.printStackTrace();   
        }
    }
    
    public void customerAdd(Customer customerinfo) {
        
        String query = "Insert Into customer (name,surname,password,gender,age,address,phone,tcno,mail,credit) VALUES(?,?,?,?,?,?,?,?,?,?)";
         
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, customerinfo.getName());
            preparedStatement.setString(2, customerinfo.getSurname());
            preparedStatement.setInt(3, customerinfo.getPasswordCus());
            preparedStatement.setString(4, customerinfo.getGender());
            preparedStatement.setInt(5, customerinfo.getAge());
            preparedStatement.setString(6, customerinfo.getAddress());
            preparedStatement.setString(7, customerinfo.getPhone());
            preparedStatement.setString(8, customerinfo.getTcno());
            preparedStatement.setString(9, customerinfo.getMail());
            preparedStatement.setInt(10, customerinfo.getCredit());

            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
             ex.printStackTrace();
        }  
    }
    
    public void salesAdd(Sales salesinfo) {
        
        String query = "Insert Into sales (customer_id,product_id,total_price,name,piece) VALUES(?,?,?,?,?)";
         
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, salesinfo.getCustomer_id());
            preparedStatement.setInt(2, salesinfo.getProduct_id());
            preparedStatement.setInt(3, salesinfo.getTotal_price());
            preparedStatement.setString(4, salesinfo.getName());
            preparedStatement.setInt(5, salesinfo.getPiece());

            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
             ex.printStackTrace();
        }  
    }
    
    //Updating the stock of the product after the sale is made
    public void newStock(int stock , int product_id) {
        
        String query = "Update product set stock = ? where product_id = ? ";
        
        try {
        
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, stock);
            preparedStatement.setInt(2, product_id);
            
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
        
            ex.printStackTrace();
        
        }
    }
    
    //Updating the user's credit after the sale is made
    public void newCredit(int id , int new_credit) {
        
        String query = "Update customer set credit = ? where customer_id = ? ";
        
        try {
            
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1,new_credit);
            preparedStatement.setInt(2, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
             ex.printStackTrace();;  
        }
    }
     
    //Obtaining the credit and id information of the registered user 
    public ArrayList<Integer> getCustomerProductInfo(String email , String password){
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        String query = "Select customer_id , credit From customer where mail = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()) {
                
                int customer_id = rs.getInt("customer_id");
                int credit = rs.getInt("credit");
                
                list.add(customer_id);
                list.add(credit);
            }
            
            return list;
             
        } catch (SQLException ex) {
             ex.printStackTrace();
             return null;
        }
    }
    
    //Obtaining the address and id information of the registered user
    public ArrayList<String> getCustomerSalesInfo(int customer_id){
        
        ArrayList<String> list = new ArrayList<String>();
        
        String query = "Select address , customer_id From customer where customer_id = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, customer_id);
;
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()) {
                
                String address = rs.getString("address");
                int id = rs.getInt("customer_id");
                
                String idSt = String.valueOf(id);
                
                list.add(address);
                list.add(idSt);
                
            }
            
            return list;
             
        } catch (SQLException ex) {
             ex.printStackTrace();
             return null;
        }
    }
    
   
    //Strategy
    public void categoryDelete(int id) {
        
        String query = "Delete from category where category_id = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    //Strategy
    public void productDelete(int id) {
        
        String query = "Delete from product where product_id = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }   
    
    //Strategy
    public void sellerDelete(int id) {
        
        String query = "Delete from seller where seller_id = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    //Strategy
    public void salesDelete(int id) {
        
        String query = "Delete from sales where sales_id = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
}
