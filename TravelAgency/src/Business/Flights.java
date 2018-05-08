/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bengre
 */
public class Flights {
    private String flightId;
    private String srcAirport;
    private String destAirport;
    private String deptTime;
    private char alpha;
    private int num;
    private String seatNo;
    private ArrayList<Seats> bookedSeats;
        

    public Flights() {
        bookedSeats = new ArrayList();
        alpha = 'A';
        num = 1;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getSrcAirport() {
        return srcAirport;
    }

    public void setSrcAirport(String srcAirport) {
        this.srcAirport = srcAirport;
    }

    public String getDestAirport() {
        return destAirport;
    }

    public void setDestAirport(String destAirport) {
        this.destAirport = destAirport;
    }

    public String getDeptTime() {
        return deptTime;
    }

    public void setDeptTime(String deptTime) {
        this.deptTime = deptTime;
    }
    
    public String getQuarter(){
        Date date;
        date = stringToDate();        
        return getdateTime(date);
    }
    
    private Date stringToDate(){
        DateFormat format = new SimpleDateFormat("h:mm a", Locale.ENGLISH);
        try {
            return format.parse(deptTime);
        } catch (ParseException ex) {
            Logger.getLogger(Flights.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    private String getdateTime(Date date){
        int hours = date.getHours();
        if (hours >= 1 || hours <= 12) {
            return "Morning";
        } else if(hours >= 12 || hours <= 16){
            return "Afternoon";
        } else if(hours >= 16 || hours <= 21){
            return "Evening";
        } else if(hours >= 21 || hours <= 24){
            return "Night";
    }else return null;
    }
    
    public Seats bookSeats(){
       if(alpha <= 'Z'){
        Seats s = new Seats();
        bookedSeats.add(s);
        seatNo = String.valueOf(alpha) + String.valueOf(num);
        s.setSeatNo(seatNo);
        num++;
        if(num >6) {
            alpha++;
            num = 1;
        }      
        return s;
       }else{
           return null;
       }
    }

    @Override
    public String toString(){
        return flightId;
    }

       
      
}
