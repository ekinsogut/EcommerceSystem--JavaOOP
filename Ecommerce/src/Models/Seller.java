
package Models;
import Patterns.Strategy;
import Operations.DatabaseOperations;
import Patterns.Facade;
import Patterns.AdvancedAddOperation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Seller implements Strategy , Facade , AdvancedAddOperation{
    
    private int seller_id;
    private String name;
    
    //Singleton
    DatabaseOperations databaseOperations = DatabaseOperations.getDatabaseOperations();
    
    
    public Seller (int seller_id,String name) {
        
        this.seller_id = seller_id;
        this.name = name;
    }

    //add
    public Seller(String name) {
        this.name = name;
    }
    

    //Strategy
    public Seller() { 
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
    
    //Strategy
    @Override
    public void operationDelete(int id) {
        
        databaseOperations.sellerDelete(id);
    
    } 

    //Facade
    @Override
    public ArrayList bring() {
        
        return databaseOperations.sellerBring();
    
    }

    //Adaptor
    @Override
    public void sellerAdd(String content) {
            
            Seller sellerinfo = new Seller(content);
            databaseOperations.sellerAdd(sellerinfo);
    
    }

    //Adaptor
    @Override
    public void categoryAdd(String content) {
        
        //nothing
    
    }

        
}

