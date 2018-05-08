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
public class SupplierDir {
    //declatation
    private ArrayList<Supplier> listOfSuppliers;
    
    //constructor
    public SupplierDir(){
        listOfSuppliers = new ArrayList();
    }

    //getters and setters
    public ArrayList<Supplier> getListOfSuppliers() {
        return listOfSuppliers;
    }
    
    //add Supplier
    public Supplier addSupplier(){
        Supplier s = new Supplier();
        listOfSuppliers.add(s);
        return s;
    }
    
    //remove Supplier   
    public void removeSupplier(Supplier s){
        listOfSuppliers.remove(s);        
    }
    
    //search supplier
    public Supplier getSupplier(String name){
        for(Supplier s:listOfSuppliers){
            if(name.equals(s.getName()))
                return s;
        }
        return null;
    }
    
}
