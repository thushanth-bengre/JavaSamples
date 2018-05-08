/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author Bengre
 */
public class MasterOrderList {
    private ArrayList<Order> listOfOrders;
    
    //constructor
    public MasterOrderList(){
        listOfOrders = new ArrayList();                
    }

    public ArrayList<Order> getListOfOrders() {
        return listOfOrders;
    }
    
    public Order addOrder(){
        Order o = new Order();
        listOfOrders.add(o);
        return o;
    }
    
    public Order getOrder(int id){
        for(Order o:listOfOrders){
            if(id == o.getOrderId())
                return o;
        }
        return null;
    }
    
    public int aboveTargetCount(){
        int count =0;
        for(Order o:listOfOrders){
            count += o.aboveTargetCount();
        }
        return count;
    }
    
    public int belowTargetCount(){
        int count =0;
        for(Order o:listOfOrders){
            count += o.belowTargetCount();
        }
        return count;
    }
    
    public int onTargetCount(){
        int count =0;
        for(Order o:listOfOrders){
            count += o.onTargetCount();
        }
        return count;
    }
    
    public int totalRevenue(){
        int revenue =0;
        for(Order o:listOfOrders){
            revenue += o.totalRevenue();
        }
        return revenue;
    }
    
    public int expectedRevenue(){
        int revenue =0;
        for(Order o:listOfOrders){
            revenue += o.expectedRevenue();
        }
        return revenue;
    }
    
    
}
