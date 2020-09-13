
package Models;
import Operations.DatabaseOperations;
import Patterns.Facade;
import Patterns.Strategy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class Sales implements Strategy{
    
    private int sales_id;
    private int customer_id;
    private int product_id;
    private int total_price;
    private String name;
    private int piece;
    
    //Singleton
    DatabaseOperations databaseOperations = DatabaseOperations.getDatabaseOperations();
    
    
    public Sales(int sales_id, int customer_id, int product_id, int total_price, String name, int piece) {
        this.sales_id = sales_id;
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.total_price = total_price;
        this.name = name;
        this.piece = piece;
    }
    
    //add
    public Sales(int customer_id, int product_id, int total_price, String name, int piece) {
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.total_price = total_price;
        this.name = name;
        this.piece = piece;
    }
    
    //Strategy
    public Sales() {  
    }
    

    /**
     * @return the sales_id
     */
    public int getSales_id() {
        return sales_id;
    }

    /**
     * @param sales_id the sales_id to set
     */
    public void setSales_id(int sales_id) {
        this.sales_id = sales_id;
    }

    /**
     * @return the customer_id
     */
    public int getCustomer_id() {
        return customer_id;
    }

    /**
     * @param customer_id the customer_id to set
     */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
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
     * @return the total_price
     */
    public int getTotal_price() {
        return total_price;
    }

    /**
     * @param total_price the total_price to set
     */
    public void setTotal_price(int total_price) {
        this.total_price = total_price;
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
     * @return the piece
     */
    public int getPiece() {
        return piece;
    }

    /**
     * @param piece the piece to set
     */
    public void setPiece(int piece) {
        this.piece = piece;
    }

    //Strategy
    @Override
    public void operationDelete(int id) {
        
        databaseOperations.salesDelete(id);
   
    }

    
}
