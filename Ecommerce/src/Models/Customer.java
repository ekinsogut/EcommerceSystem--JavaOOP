
package Models;
import Operations.DatabaseOperations;
import Patterns.Factory;

public class Customer extends Users implements Factory{
    
    //Singleton
    DatabaseOperations databaseOperations = DatabaseOperations.getDatabaseOperations();
    
    private int customer_id;

    
    //For customer register
    public Customer(String name, String surname, int passwordCus, String gender, int age, String address, String phone, String tcno, String mail, int credit) { 
        super(name, surname, passwordCus, gender, age, address, phone, tcno, mail, credit);
    }
    
    //For customer login
    public Customer(String mail , int passwordCus) {
        super(mail, passwordCus);
    }
    
    public Customer() {
    
        
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

    //Factory
    @Override
    public boolean operationLogin(String mail, String password) {
        
        int passwordIn = Integer.parseInt(password);
        
        Customer customerinfo = new Customer(mail, passwordIn);
        
        return databaseOperations.customerLoginOperation(customerinfo);
        
        
    
    } 

}
