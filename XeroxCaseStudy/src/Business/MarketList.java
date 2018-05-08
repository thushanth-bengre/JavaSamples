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
public class MarketList {
    //declation
    private ArrayList<Market> listOfMarket;
    
    //constructor
    public MarketList(){
        listOfMarket = new ArrayList();
    }
    
    //getters and setters

    public ArrayList<Market> getListOfMarket() {
        return listOfMarket;
    }
    
    public Market addMarket(){
        Market m = new Market();
        listOfMarket.add(m);
        return m;        
    }
    
    public Market getMarket(String name){
        for(Market m:listOfMarket){
            if(name.equals(m.getName()))
                return m;
        }
        return null;
    }
    
    public void removeMarket(Market m){
        listOfMarket.remove(m);
    }
            
}
