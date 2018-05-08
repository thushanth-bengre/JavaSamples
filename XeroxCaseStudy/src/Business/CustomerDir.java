/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Bengre
 */
public class CustomerDir {
    private ArrayList<Customer> listOfCustomers;
    
    //constructor
    public CustomerDir(){
        listOfCustomers = new ArrayList();
    }

    //getters and setters
    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }
   
    
    //add Supplier
    public Customer addCustomer(){
        Customer c = new Customer();
        listOfCustomers.add(c);
        return c;
    }
    
    //remove Supplier   
    public void removeCustomer(Customer c){
        listOfCustomers.remove(c);        
    }
    
    //search supplier
    public Customer getCustomer(String name){
        for(Customer c:listOfCustomers){
            if(name.equals(c.getName()))
                return c;
        }
        return null;
    }
}
