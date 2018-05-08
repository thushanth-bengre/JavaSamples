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
 * 
 * Aircraft objects are created in Fleet instead of Aircraft Test as it makes more sense logically. 
 * we add and set parameters for aircraft inside a single block. 
 */
public class AircraftTest {
    Fleet fleet ;
    Aircraft a;
    //constructor

    public AircraftTest() {
        fleet = new Fleet();
        a= new Aircraft();
    }
    
    private void run(){
        int i = 1;
                String quitCommand = null;
                Scanner sc=new Scanner(System.in);
                do{  
                    System.out.println("Please Enter details for Aircraft" + i);
                    System.out.println("Aircraft Tail No:");
                    String tailNo = sc.next();
                    System.out.println("Aircraft weight(Kg):");
                    int aircraftWgt = sc.nextInt();
                    System.out.println("Aircraft maximum weight to take off:");
                    int takeoffWeight = sc.nextInt();
                    
                    if(takeoffWeight < aircraftWgt){
                        System.err.println("Aircraft Weight should be less than take off weight");
                        continue;
                    }
                    else
                    {
                        fleet.addAircraft(tailNo, aircraftWgt, takeoffWeight);
                    }
                    
                    System.out.println("Do you want to add another Airplane?(Y/N)");
                    quitCommand = sc.next();
                    i++;                                       
                }while (!"N".equals(quitCommand));
              
                fleet.displayAircrafts();
                
                String command;                
                do{
                    System.out.println("Please Enter the Operation you want to perform.(1 or 2) \n 1. Search Aircraft \n 2. Delete Aircraft" );
                    int k = sc.nextInt();
                    if(k==1){
                        System.out.println("Please Enter the Tail Number of the aircraft you want to view" );
                        String tailNo = sc.next();
                        Aircraft a =fleet.getAircraft(tailNo);
                        if(a != null){
                        System.out.println("Aircraft Tail Number: " + a.getTailNo());
                        System.out.println("Aircraft Weight: " + a.getAircraftWght());
                        System.out.println("Aircraft Maximum Weight: " + a.getTakeoffWeight());
                        System.out.println("Aircraft Cargo weight allowed: " + a.getCargoWght());
                        }
                        else
                            System.out.println("Aircraft not found" );
                    }else if(k==2){
                        System.out.println("Please Enter the Tail Number of the aircraft you want to delete" );
                        String tailNo = sc.next();
                        Aircraft a =fleet.getAircraft(tailNo);
                        if(a !=  null){
                        fleet.removeAircraft(a, tailNo);
                        fleet.displayAircrafts();
                        }else
                          System.out.println("Aircraft not found" );  
                    }
                    else
                        System.err.println("Please Enter the correct option number" );
                    System.out.println("Do you want to continue operation?(Y/N)");
                    command = sc.next();                                       
                }while(!"N".equals(command));
        
    }
    
    
    public static void main(String[] args){
        AircraftTest at = new AircraftTest();
        at.run();
    }
    
}
