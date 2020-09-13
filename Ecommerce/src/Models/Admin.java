
package Models;
import Patterns.Factory;
import Operations.DatabaseOperations;


public class Admin extends Users implements Factory {
    
    //Singleton
    DatabaseOperations databaseOperations = DatabaseOperations.getDatabaseOperations();
    
    //For admin login
    public Admin(String mail, String passwordAd) {
        super(mail, passwordAd);
       
    }
    
    public Admin() {

    }

    //Factory
    @Override
    public boolean operationLogin(String mail, String password) {
        
        Admin admininfo = new Admin(mail, password);
        
        return databaseOperations.adminLoginOperation(admininfo);

    }
}
