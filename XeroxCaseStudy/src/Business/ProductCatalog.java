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
public class ProductCatalog {
    //declaration
    private ArrayList<Product> listofProducts;

    
    //constructor
    public ProductCatalog() {
        listofProducts = new ArrayList();
    }
    
    //setters and getters

    public ArrayList<Product> getListofProducts() {
        return listofProducts;
    }
    
    //addproduct    
    public Product addProduct(){
        Product p = new Product();
        listofProducts.add(p);
        return p;
    }
    
    //remove product
    public void removeProduct(Product p){
        listofProducts.remove(p);
                        
    }
    
    //search product
    public Product getProduct(int prodId){
        for(Product p: listofProducts){
            if(prodId == p.getProdId())
                return p;
        }
        return null;
    }
    
    public Product searchProduct(String name){
        for(Product p: listofProducts){
            if(name == p.getName())
                return p;
        }
        return null;
    }
    
    
}
