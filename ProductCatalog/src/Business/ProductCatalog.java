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
    
    private ArrayList<Product> productList;
    
    //constructor
    public ProductCatalog(){
        productList = new ArrayList<Product>();
    }
    
    //getters and setters

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addProduct(){
        Product product = new Product();
        productList.add(product);
        return product ;
    }
    
    //method to remove objects from arrayList
    public void removeProduct(Product p){
        productList.remove(p);
    }
    
    
}
