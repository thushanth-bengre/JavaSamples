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
    private ArrayList<Person> listOfPerson;
    
    //constructor
    public PersonDir(){
        listOfPerson = new ArrayList();
    }
    
    //getters and setters

    public ArrayList<Person> getListOfPerson() {
        return listOfPerson;
    }
    
    public Person addPerson(){
        Person p = new Person();
        listOfPerson.add(p);
        return p;
    }
    
    public Person getPerson(String name){
        for(Person p:listOfPerson){
            if(p.getFirstName().equals(name))
                return p;
        }
        return null;
    }
    
    public void removePerson(Person p){
        listOfPerson.remove(p);
    }    
}
