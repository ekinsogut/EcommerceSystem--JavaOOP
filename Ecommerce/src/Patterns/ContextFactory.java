
package Patterns;

import Models.Admin;
import Models.Customer;

public class ContextFactory {
    
    public Factory getFactory(String usersType) {
    
        if (usersType == null) {
            
            return null;
            
        }
        if (usersType.equalsIgnoreCase("ADMIN")) {
            
            return new Admin();
            
        } else if (usersType.equalsIgnoreCase("CUSTOMER")) {
        
            return new Customer();
        }

        return null;
    
    }
}
