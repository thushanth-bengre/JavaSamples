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
public class Order {
    private int orderId;
    private static int orderCount =0;
    private Person p;
    private Market m;
    private Customer c;
    private ArrayList<OrderItem> listOfOrderItems;
    
    //constructor
    public Order(){
        orderCount++;
        orderId = orderCount;
        listOfOrderItems = new ArrayList();
    }
    
    //getters and setters

    public int getOrderId() {
        return orderId;
    }
    

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public Market getM() {
        return m;
    }

    public void setM(Market m) {
        this.m = m;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }
    
    public OrderItem addOderItem(){
        OrderItem oi = new OrderItem();
        listOfOrderItems.add(oi);
        return oi;
    }
    
    public int aboveTargetCount(){
        int count =0;
        for(OrderItem oi:listOfOrderItems){
            if(oi.isAboveTarget())
                count++;
        }
        return count;
    }
    
    public int belowTargetCount(){
        int count =0;
        for(OrderItem oi:listOfOrderItems){
            if(oi.isBelowTarget())
                count++;
        }
        return count;
    }
    
    public int onTargetCount(){
        int count =0;
        for(OrderItem oi:listOfOrderItems){
            if(oi.isOnTarget())
                count++;
        }
        return count;
    }
    
    public int totalRevenue(){
        int revenue =0;
        for(OrderItem oi:listOfOrderItems){
            revenue += oi.getSalesPrice();
        }
        return revenue;
    }
    
    public double totalComission(){
        double commission =0;
        for(OrderItem oi:listOfOrderItems){
            commission += oi.getCommission();
        }
        return commission;
    }
    
    public int expectedRevenue(){
        int revenue=0;
        for(OrderItem oi:listOfOrderItems){
            revenue += oi.getTargetPrice();
        }
        return revenue;
    }
    
    public String toString(){
        return String.valueOf(orderId);
    }
    
    
    
}
