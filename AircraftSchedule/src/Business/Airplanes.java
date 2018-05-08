/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Bengre
 */
public class Airplanes {
    
    private String serialNo;
    private String manuYear;
    private int noOfSeats;
    private String availability;
    private String mainExpDate;
    private String airliner;
    private String modelName;
    private String manuName;
    private Schedule schedule;
    
    public Airplanes(){
        
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getManuYear() {
        return manuYear;
    }

    public void setManuYear(String manuYear) {
        this.manuYear = manuYear;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String isAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getMainExpDate() {
        return mainExpDate;
    }

    public void setMainExpDate(String mainExpDate) {
        this.mainExpDate = mainExpDate;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner() {
        this.airliner = "Emirates";
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManuName() {
        return manuName;
    }

    public void setManuName(String manuName) {
        this.manuName = manuName;
    }
    
    public void addSchedule(String serialNo, String source, String dest, String deptTime){
        Schedule schedule = new Schedule(serialNo);
        schedule.setSrcAirport(source);
        schedule.setDestAirpport(dest);
        schedule.setDeptTime(deptTime);
        this.schedule = schedule;
    }
    
    public Schedule getSchedule(){
        return this.schedule;
    }
    
    public String toString(){
        return this.serialNo;
    }
    }
    
    

