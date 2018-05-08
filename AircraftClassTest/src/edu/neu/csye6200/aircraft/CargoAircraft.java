/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.aircraft;

/**
 *
 * @author Bengre
 */
public class CargoAircraft extends Aircraft {
    private int height;
    private int length;
    private int width;
    
    public CargoAircraft(){
                        
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int cargoArea(){
        return length*height*width;
    }
    
    public String printCargoInfo(){
        String aircraftInfo = super.aircraftInfo();
        String printInfo = aircraftInfo + "Cargo Height :" + height + ": Cargo length :" + length + ": Cargo width:" + width + ": Cargo Area :" + String.valueOf(cargoArea());
        return printInfo;
    }
}
