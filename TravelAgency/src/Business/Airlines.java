/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bengre
 */
public class Airlines {
    private String name;
    private int noOfFlights;
    private ArrayList<Flights> schedule;
    

    public Airlines() {
        noOfFlights = 0;
        schedule = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Flights> getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<Flights> schedule) {
        this.schedule = schedule;
    }
    
    public Flights addFlight(String flightId, String srcAirport, String destAirport, String deptTime){
        Flights f= new Flights();
        schedule.add(f);
        f.setFlightId(flightId);
        f.setSrcAirport(srcAirport);
        f.setDestAirport(destAirport);
        f.setDeptTime(deptTime);
        return f;
    }
    
    public void removeFight(Flights f){
        schedule.remove(f);
    }

    public int getNoOfFlights() {
        noOfFlights = schedule.size();
        return noOfFlights;
    }
    
    public String toString(){
        return name;
    }
    
}
