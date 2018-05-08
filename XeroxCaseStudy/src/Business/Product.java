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
public class Product {
    //declaration
    private int prodId;
    private static int count =0;
    private String name;
    private int supplierPrice;
    private String description;
    private int availability;    
    private int totRevenue;
    private int aboveTarget;
    private int belowTarget;
    private int onTarget;
    private int targetPrice; 
    
    
    //constructor
    public Product() {
        count++;
        prodId = count;        
        totRevenue =0 ;
        aboveTarget =0 ;
        belowTarget =0 ;
        targetPrice =0 ;
        onTarget = 0;

    }
    
    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getProdId() {
        return prodId;
    }

    public int getSupplierPrice() {
        return supplierPrice;
    }

    public void setSupplierPrice(int supplierPrice) {
        this.supplierPrice = supplierPrice;
    }
    
      
        
    public void addRevenue(int revenue){
        totRevenue += revenue;
    }
    
    public void belowSalesCount(){
        belowTarget++;
    }
    
    public void onTargetCount(){
        onTarget++;
    }
    
    public void aboveSalesCount(){
        aboveTarget++;
    }
    
    public void addTargetPrice(int price){
        targetPrice += price;
    }
    
    public int getTotRevenue() {
        return totRevenue;
    }

    public int getAboveTarget() {
        return aboveTarget;
    }

    public int getOnTarget() {
        return onTarget;
    }

    public int getTargetPrice() {
        return targetPrice;
    }
    
    

    public int getBelowTarget() {
        return belowTarget;
    }

    public int getTagertSales() {
        return targetPrice;
    }
    
    //toString
    @Override
    public String toString(){
        return name;
    }
    
}
