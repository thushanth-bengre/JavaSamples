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
public class MarketOffer {
    //declaration
    private String name;
    private int floor;
    private int target;
    private int ceiling;
    private Market m;
    private Product p;
    
    //constructor
    public MarketOffer(){
        
    }
    
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getCeiling() {
        return ceiling;
    }

    public void setCeiling(int ceiling) {
        this.ceiling = ceiling;
    }

    public Market getM() {
        return m;
    }

    public void setM(Market m) {
        this.m = m;
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }
    
    @Override
    public String toString(){
        return p.getName();
    }
    
    
}
