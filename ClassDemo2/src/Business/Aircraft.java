/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Thushanth Devananda Bengre
 * NUID: 001826722
 * Let us assume the fuel weight for all the aircrafts is 1000 kg
 */
public class Aircraft {
    private String tailNo;
    private int aircraftWght;
    private int takeoffWeight;
    private int cargoWght;
    private int fuelWght;
 
    public Aircraft(){
        aircraftWght=0;
        takeoffWeight = 0;
        cargoWght = 0;
        fuelWght = 1000;
    }

    public String getTailNo() {
        return tailNo;
    }

    public void setTailNo(String tailNo) {
        this.tailNo = tailNo;
    }

    public int getAircraftWght() {
        return aircraftWght;
    }

    public void setAircraftWght(int aircraftWght) {
        this.aircraftWght = aircraftWght;
    }

    public int getTakeoffWeight() {
        return takeoffWeight;
    }

    public void setTakeoffWeight(int takeoffWeight) {
        this.takeoffWeight = takeoffWeight;
    }

    public int getCargoWght() {
        cargoWght = takeoffWeight - (fuelWght + aircraftWght);
        return cargoWght;
    } 
}
