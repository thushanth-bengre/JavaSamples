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
public class Market {
    //declaration
    private String name;
    private int totRevenue;
    private int aboveTarget;
    private int belowTarget;
    private int onTarget;
    private int targetPrice;    
    
    //constructor
    public Market(){
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
    
    public void addRevenue(int revenue){
        totRevenue += revenue;
    }
    
    public void belowSalesCount(){
        belowTarget++;
    }
    
    public void aboveSalesCount(){
        aboveTarget++;
    }
    
    public void onTargetCount(){
        onTarget++;
    }
    
    public void addTargetPrice(int price){
        targetPrice += price;
    }
    
    public int getTotRevenue() {
        return totRevenue;
    }

    public int getOnTarget() {
        return onTarget;
    }

    public int getAboveTarget() {
        return aboveTarget;
    }

    public int getBelowTarget() {
        return belowTarget;
    }

    public int getTagertSales() {
        return targetPrice;
    }    

    
    @Override
    public String toString(){
        return name;
    }
    
}
