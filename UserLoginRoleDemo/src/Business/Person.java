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
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private ArrayList<User> userList;
    public Person() {
        userList = new ArrayList();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    public void addUser(User u){
        userList.add(u);              
    }
    
    public void removeUsers(){
        for(User u: userList){
                userList.remove(u);
        }
    }
           
        
    @Override
    public String toString(){
        return firstName;
    }
}
