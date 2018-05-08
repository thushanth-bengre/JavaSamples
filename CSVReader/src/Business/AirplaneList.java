/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AirplaneList {

    ArrayList<Airplane> airplaneList;

   
    public ArrayList<Airplane> getAirplaneList() {
        return airplaneList;
    }

    public void setAirplaneList(ArrayList<Airplane> airplaneList) {
        this.airplaneList = airplaneList;
    }

    public AirplaneList() {
        this.airplaneList = new ArrayList<>();
    }

    public Airplane addAirplane() {
       Airplane airplane = new Airplane();
        airplaneList.add(airplane);
        return airplane; //To change body of generated methods, choose Tools | Templates.
    }
}
