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
 */

//we are not setting anything in constructor. we will use methods to get and set attributes.
//Model and serial no is made dynamic and not hardcoded. input for all attrubutes taken from user
public class Aircrafts {
    
        private int crewNum;
	private int fuelCap;	// gallons
	private double cruiseSpeed; // Kilometers/hr
        private String vendor;
        private String modelNo;
        private int maxWeight; //Kilograms
        private String serialNo;
	
	/**
	 * Aircraft class constructor
	 */
	public Aircrafts() {
	
	}
        
        //method to calculate range
        //assumption: aircraft give range of 10km/gallon
        public int getrange(int fuelCap)
        {
            int range = fuelCap *10;
            return range;
        }

    public void setCrewNum(int crewNum) {
        this.crewNum = crewNum;
    }

    public void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    public void setCruiseSpeed(double cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public int getCrewNum() {
        return crewNum;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public double getCruiseSpeed() {
        return cruiseSpeed;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModelNo() {
        return modelNo;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public String getSerialNo() {
        return serialNo;
    }
    
      
}