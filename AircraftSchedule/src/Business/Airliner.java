/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author Bengre
 */
public class Airliner {
    private String airlinerName;
    private ArrayList<Airplanes> airplaneList;
    private ArrayList<Manufacturer> manuList;
    private long catLstUpd;
    
    public Airliner(){
        airlinerName = "Emirates";
        airplaneList = new ArrayList<Airplanes>();
        manuList = new ArrayList<Manufacturer>();
    }

    public ArrayList<Manufacturer> getManuList() {
        return manuList;
    }

    public void setManuList(ArrayList<Manufacturer> manuList) {
        this.manuList = manuList;
    }

    public long getCatLstUpd() {
        return catLstUpd;
    }

    public void setCatLstUpd(long catLstUpd) {
        this.catLstUpd = catLstUpd;
    }   
    

    public ArrayList<Airplanes> getAirplaneList() {
        return airplaneList;
    }

    public void setAirplaneList(ArrayList<Airplanes> airplaneList) {
        this.airplaneList = airplaneList;
    }
    
    public Airplanes addAirplane(){
        Airplanes airplane = new Airplanes();
        airplaneList.add(airplane);
        return airplane ;
    }
    
    //method to remove objects from arrayList
    public void removeAirplanes(Airplanes a){
        airplaneList.remove(a);
    }
    
    public Manufacturer addManufacturer(){
        Manufacturer manufacturer = new Manufacturer();
        manuList.add(manufacturer);
        return manufacturer ;
    }
    
    //method to remove objects from arrayList
    public void removeManufacturer(Manufacturer m){
        manuList.remove(m);
}
}