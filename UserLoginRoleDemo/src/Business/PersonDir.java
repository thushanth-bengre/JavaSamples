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
public class PersonDir {

    private ArrayList<Person> listOfPerson ;
    public PersonDir() {
        listOfPerson = new ArrayList();
    }

    public ArrayList<Person> getListOfPerson() {
        return listOfPerson;
    }

    public void setListOfPerson(ArrayList<Person> listOfPerson) {
        this.listOfPerson = listOfPerson;
    }
    
    public Person addPerson(String firstName, String lastName, int age, String ssn){
        Person p = new Person();
        listOfPerson.add(p);
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setSsn(ssn);
        p.setAge(age);
        return p;
    }
    
    public String findPerson(User u){
        String name = null;
        for(Person p:listOfPerson){
            for(User us:p.getUserList()){
                if(us.equals(u)){
                    name = p.getFirstName() + p.getLastName();
                }
            }
        }
        return name;
    }
    
    public Person findPersonBySSN(String ssn){
        Person per = null;
        for(Person p:listOfPerson){
            if(p.getSsn().equals(ssn))
                per = p;
        }
        return per;
    }
    
    
    public void removePerson(Person p){
        listOfPerson.remove(p);
    }
}
