/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Timestamp;



/**
 *
 * @author Bengre
 */
public class Schedule {
    private String srcAirport;
    private String destAirpport;
    private String deptTime;
    private String serialNo;
    
    public Schedule(String SerialNo){
        this.serialNo = SerialNo ;
    }

    public String getSrcAirport() {
        return srcAirport;
    }

    public void setSrcAirport(String srcAirport) {
        this.srcAirport = srcAirport;
    }

    public String getDestAirpport() {
        return destAirpport;
    }

    public void setDestAirpport(String destAirpport) {
        this.destAirpport = destAirpport;
    }

    public String getDeptTime() {
        return deptTime;
    }

    public void setDeptTime(String deptTime) {
        this.deptTime = deptTime;
    }

    public String getSerialNo() {
        return serialNo;
    }
}
