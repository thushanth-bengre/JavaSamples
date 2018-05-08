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
public class Supplier {
     //declaration
    private String name;
    private ProductCatalog pc;
    
    //constructor
    public Supplier(){
        pc = new ProductCatalog();
    }

    //setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ProductCatalog getPc() {
        return pc;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
