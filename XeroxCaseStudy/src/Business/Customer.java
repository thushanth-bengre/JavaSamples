/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bengre
 */
public class Customer {
    private static int count =0;
    private int custId;
    private String name;   
    private String contactNum;
    private String email;
    private String address;
    private Market m;
    
    //constructor
    public Customer(){
        count++;
        custId = count;
    }

    public int getCustId() {
        return custId;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Market getM() {
        return m;
    }

    public void setM(Market m) {
        this.m = m;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
