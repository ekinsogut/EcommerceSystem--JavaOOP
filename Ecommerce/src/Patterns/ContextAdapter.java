
package Patterns;

import Models.Category;
import Models.Seller;


public class ContextAdapter implements AddOperation{
    
    
    AdvancedAddOperation advancedAddOperation;

    public ContextAdapter(String type) {
        
        if (type.equalsIgnoreCase("seller")) {
            
            advancedAddOperation = new Seller();
            
        } else if (type.equalsIgnoreCase("category")) {
        
        
            advancedAddOperation = new Category();
            
        }
    }

    @Override
    public void add(String type, String content) {
        
        if (type.equalsIgnoreCase("sellerAdd")) {
            
            advancedAddOperation.sellerAdd(content);
            
        } else if (type.equalsIgnoreCase("categoryAdd")) {
        
            advancedAddOperation.categoryAdd(content);
        
        } else {
        
            System.out.println("Model is not selected!");
        
        }
    
    }
    
    
    
}
