package Models;
import Operations.DatabaseOperations;
import Patterns.Facade;
import Patterns.Strategy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class Product implements Strategy , Facade{
    
    private int product_id;
    private String name;
    private int category_id;
    private int stock;
    private int price;
    private int seller_id;

    
    //Singleton
    DatabaseOperations databaseOperations = DatabaseOperations.getDatabaseOperations();

    public Product(int product_id, String name, int category_id, int stock, int price, int seller_id) {
        this.product_id = product_id;
        this.name = name;
        this.category_id = category_id;
        this.stock = stock;
        this.price = price;
        this.seller_id = seller_id;
        
    }
    
    //add
    public Product(String name, int category_id, int stock, int price, int seller_id) {
        this.name = name;
        this.category_id = category_id;
        this.stock = stock;
        this.price = price;
        this.seller_id = seller_id;

    }
    
    
    //Strategy
    public Product() {   
    }
    
    /**
     * @return the product_id
     */
    public int getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the category_id
     */
    public int getCategory_id() {
        return category_id;
    }

    /**
     * @param category_id the category_id to set
     */
    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the seller_id
     */
    public int getSeller_id() {
        return seller_id;
    }

    /**
     * @param seller_id the seller_id to set
     */
    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }
    
   
    //Strategy
    @Override
    public void operationDelete(int id) {
        
        databaseOperations.productDelete(id);

    }

    //Facade
    @Override
    public ArrayList bring() {
        
        return databaseOperations.productBring();
    
    }

    

}
