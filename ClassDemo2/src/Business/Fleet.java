/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Thushanth Devananda Bengre
 * NUID: 001826722
 */
public class Fleet {
    ArrayList<Aircraft> listOfAircraft;
    HashMap<String, Aircraft> hashOfAircraft;
    
    public Fleet() {
        listOfAircraft = new ArrayList();
        hashOfAircraft = new HashMap();
    }

    public ArrayList<Aircraft> getListOfAircraft() {
        return listOfAircraft;
    }

    public void setListOfAircraft(ArrayList<Aircraft> listOfAircraft) {
        this.listOfAircraft = listOfAircraft;
    }

    public HashMap<String, Aircraft> getHashOfAircraft() {
        return hashOfAircraft;
    }

    public void setHashOfAircraft(HashMap<String, Aircraft> hashOfAircraft) {
        this.hashOfAircraft = hashOfAircraft;
    }
    
    public Aircraft addAircraft(String tailNo, int aircraftWgt,int takeoffWeight){
        Aircraft a = new Aircraft();
        listOfAircraft.add(a);
        hashOfAircraft.put(tailNo, a);
        a.setAircraftWght(aircraftWgt);
        a.setTakeoffWeight(takeoffWeight);
        a.setTailNo(tailNo);
        return a;
    }
    
    public void removeAircraft(Aircraft a, String tailNo){
        listOfAircraft.remove(a);
        hashOfAircraft.remove(tailNo);
    }

    public void displayAircrafts() {
        int i=1;
        for(Aircraft a: listOfAircraft){
            System.out.println("Information Aircraft " + i);
            System.out.println("Aircraft Tail Number: " + a.getTailNo());
            System.out.println("Aircraft Weight: " + a.getAircraftWght());
            System.out.println("Aircraft Maximum Weight: " + a.getTakeoffWeight());
            System.out.println("Aircraft Cargo weight allowed: " + a.getCargoWght());
             System.out.println("-------------------------------------------------------");
            i++;
        }
    }
    
    public Aircraft getAircraft(String tailNo){
        Aircraft a = hashOfAircraft.get(tailNo);
        if(a != null)
        return a;
        else return null;
    }
    
}
