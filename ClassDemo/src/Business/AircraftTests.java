/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thushanth Devananda Bengre
 * NUID: 001826722
 */

//we are using arraylist to store object aircraft. 
//This will give us flexibility to add as many number of airplanes as we want.
public class AircraftTests {
    
       private ArrayList<Aircraft> aircraftlist ;  
       private Aircraft a;
	/**
	 * AircraftTest constructor
	 */
	public AircraftTests() {
            aircraftlist = new ArrayList();
            a= new Aircraft();
        }

	/**
	 * Print the aircraft to the console
	 */
	public void printAircraft() {
	  // Display all aircraft that we know about - loop through our list and print them
	}
        
        public Aircraft addAircraft(){
            Aircraft aircraft = new Aircraft();
            aircraftlist.add(aircraft);
            return aircraft;
        }
        
        public ArrayList<Aircraft> getAircraftList() {
        return aircraftlist;
    }
        
        
        
	
	/**
	 * This is where we start (just like a C/C++ program)
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1;
                String quitCommand = null;
                Scanner sc=new Scanner(System.in);
                int range;
                ArrayList<Aircraft> aircraftlist = new ArrayList();
                do{
                    Aircraft a = new Aircraft();
                    aircraftlist.add(a);
                    System.out.println("Please Enter details for Aircraft" + i);
                    System.out.println("Aircraft Serial No:");
                    a.setSerialNo(sc.next());
                    System.out.println("Aircraft Fuel Capacity(Gallons):");
                    a.setFuelCap(sc.nextInt());
                    System.out.println("Aircraft Crew size:");
                    a.setCrewNum(sc.nextInt());
                    System.out.println("Aircraft Cruice Speed(kmph):");
                    a.setCruiseSpeed(sc.nextDouble());
                    System.out.println("Aircraft Vendor:");
                    a.setVendor(sc.next());                    
                    System.out.println("Aircraft Model No:");
                    a.setModelNo(sc.next());
                    System.out.println("Aircraft Maximum Weight(kg):");
                    a.setMaxWeight(sc.nextInt());
                    System.out.println("Do you want to add another Airplane?(Y/N)");
                    quitCommand = sc.next();
                    i++;
                }while (!"N".equals(quitCommand));
                
                for(int j=0;j<aircraftlist.size(); j++){
                    Aircraft ac = aircraftlist.get(j);
                    System.out.println("Here is the details for Airplane" + (j+1)); 
                    System.out.println("Aircraft Serial No:" + ac.getSerialNo());
                    System.out.println("Aircraft Crew Size:" + ac.getCrewNum());
                    System.out.println("Aircraft Fuel Size:" + ac.getFuelCap());
                    System.out.println("Aircraft Cruise Speed:" + ac.getCruiseSpeed());
                    System.out.println("Aircraft Vendor:" + ac.getVendor());
                    System.out.println("Aircraft Model No:" + ac.getModelNo());
                    System.out.println("Aircraft Max Weight:" + ac.getMaxWeight());
                    System.out.println("Aircraft Range:" + ac.getrange(ac.getFuelCap()));
                    System.out.println("---------------------------------------------------------------");                   
                    
                }
                        
	}
}
