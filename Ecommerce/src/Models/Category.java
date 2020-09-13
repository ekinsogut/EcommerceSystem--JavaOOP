
package Models;
import Patterns.Strategy;
import Operations.DatabaseOperations;
import Patterns.Facade;
import Patterns.AdvancedAddOperation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Category implements Strategy,Facade,AdvancedAddOperation{
     
    private int category_id;
    private String name;
    
    //Singleton
    DatabaseOperations databaseOperations = DatabaseOperations.getDatabaseOperations();
    
    public Category(int category_id, String name) {
        this.category_id = category_id;
        this.name = name;
    }

    //Strategy
    public Category() {
    }

    //add
    public Category(String name) {
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
       
        databaseOperations.categoryDelete(id);
        
    }

    //Facade
    @Override
    public ArrayList bring() {
        
        return databaseOperations.categoryBring();
    
    }
    
    //Adaptor
    @Override
    public void sellerAdd(String content) {
        
        //nothing
    
    }

    //Adaptor
    @Override
    public void categoryAdd(String content) {
         
            Category categoryinfo = new Category(content);
            databaseOperations.categoryAdd(categoryinfo);
            
        
    
    }

}
