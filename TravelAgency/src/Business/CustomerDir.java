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

    public CustomerDir() {
       listOfCustomers = new ArrayList();
       }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public void setListOfCustomers(ArrayList<Customer> listOfCustomers) {
        this.listOfCustomers = listOfCustomers;
    }
    
    public Customer addCustomer(String flightId , String firstName, String lastName, int age, String passportNo,String seatNo){
       Customer c = new Customer();
       listOfCustomers.add(c);
       c.setFlightId(flightId);
       c.setFirstName(firstName);
       c.setLastName(lastName);
       c.setAge(age);
       c.setPassportNo(passportNo);
       c.setSeatNo(seatNo);
       return c;
    }
    
    public void removeCustomer(Customer c){
        listOfCustomers.remove(c); 
    }
    
    public ArrayList getChart(String flightId){
        ArrayList<Customer> chart = new ArrayList();
        for(Customer c: listOfCustomers){
            if(flightId.equals(c.getFlightId()))
                chart.add(c);
        }
        return chart;
    }
    
    public void deleteFlightCustomers(String flightId){
        for(Customer c: listOfCustomers){
            if(flightId.equals(c.getFlightId()))
                removeCustomer(c);
    }  
    }
    
}
