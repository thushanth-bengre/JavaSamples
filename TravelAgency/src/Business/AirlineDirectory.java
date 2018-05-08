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
public class AirlineDirectory {

    private ArrayList<Airlines> listofAirlines;
            
    public AirlineDirectory() {
        listofAirlines = new ArrayList();
    }

    public ArrayList<Airlines> getListofAirlines() {
        return listofAirlines;
    }

    public void setListofAirlines(ArrayList<Airlines> listofAirlines) {
        this.listofAirlines = listofAirlines;
    }
    
    public Airlines addAirlines(String name){
        Airlines a = new Airlines();
        listofAirlines.add(a);
        a.setName(name);
        return a;
    }
    
    public void removeAirlines(Airlines a){
        listofAirlines.remove(a);
    }
    
    public Airlines searchAirline(String name){
        for(Airlines a:listofAirlines){
            if(a.getName().equals(name)){
                return a;
            }               
        }
        return null;            
    }
    
}
