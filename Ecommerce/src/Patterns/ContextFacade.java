
package Patterns;

import Models.Category;
import Models.Product;
import Models.Seller;
import java.util.ArrayList;


public class ContextFacade {
    
    private Facade seller;
    private Facade category;
    private Facade product;

    public ContextFacade() {
        seller = new Seller();
        category = new Category();
        product = new Product();
    }
    
    public ArrayList bringSeller() {
    
        return seller.bring();
        
    }
    
    public ArrayList bringCategory() {
    
        return category.bring();
        
    }
    
    public ArrayList bringProduct() {
    
        return product.bring();
        
    } 
}
