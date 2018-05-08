/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.aircraft;

import edu.neu.csye6200.aircraft.Aircraft;
import edu.neu.csye6200.aircraft.CargoAircraft;
import edu.neu.csye6200.aircraft.Fleet;
import java.io.File;
//import com.sun.corba.se.spi.transport.CorbaAcceptor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.apache.logging.log4j.*;

/**
 *
 * @author Thushanth Devananda Bengre
 * NUID: 001826722
 * We are assuming that all aircrafts are cargo Aircrafts. 
 * If other types are added we need to insert If conditions to check the instance of Aircrafts.
 */
public class AircraftTest {
    private Fleet fleet ;
    private Aircraft a;
    private static final Logger log = Logger.getLogger(AircraftTest.class.getName());    
    private String logDirPath = "LogFiles";    
    private File logDirFile = new File(logDirPath);
    private String sep = File.separator; 

    //constructor

    public AircraftTest() {
        fleet = Fleet.getInstance();
        a= new Aircraft(); 
        log.info("In AircraftTest Constructor!!");
        if (!logDirFile.exists())  logDirFile.mkdirs();
    }
    
    //Aircraft Input
    private void inputs(){
         int i = 1;
                String quitCommand = null;
                Scanner sc=new Scanner(System.in);
                do{  
                    System.out.println("Please Enter details for Aircraft" + i);                                   
                    System.out.println("Aircraft Tail No:");
                    String tailNo = sc.next();
                    System.out.println("Aircraft weight(Kg):");
                    int aircraftWgt = sc.nextInt();
                    System.out.println("Aircraft maximum weight to take off(Kg):");
                    int takeoffWeight = sc.nextInt();
                    int height,width,length;
                    System.out.println("Aircraft cargo height(m):");
                    height = sc.nextInt();
                    System.out.println("Aircraft cargo length(m):");
                    length = sc.nextInt();
                    System.out.println("Aircraft cargo width(m):");
                    width = sc.nextInt();
                    
                    
                    if(takeoffWeight < aircraftWgt){
                        System.err.println("Aircraft Weight should be less than take off weight");
                        continue;
                    }
                    else
                    {
                       Aircraft a = fleet.addAircraft();
                       CargoAircraft c = (CargoAircraft)a;
                       c.setTailNo(tailNo);
                       c.setTakeoffWeight(takeoffWeight);
                       c.setAircraftWght(aircraftWgt);
                       c.setHeight(height);
                       c.setWidth(width);
                       c.setLength(length);
                    }
                    
                    System.out.println("Do you want to add another Airplane?(Y/N)");
                    quitCommand = sc.next();
                    i++;                                       
                }while (!"N".equals(quitCommand));
                
    }
    
    //prints Arraylist into output screen
    private void print(List<Aircraft> listOfAircrafts){
        for(Aircraft a:listOfAircrafts){
                 CargoAircraft c  = (CargoAircraft) a;
                 String print = c.printCargoInfo(); 
                 System.out.println(print);
        }
    }
        
    private void loadBack(String fileName){
            Scanner scannerc;
        try {
            scannerc = new Scanner(new FileReader(fileName));
            log.info("Reading from file");
            while(scannerc.hasNextLine()){
            String line = scannerc.nextLine();
            String[] splits = line.split(":");
            Aircraft a = fleet.addAircraft();
            CargoAircraft c = (CargoAircraft)a;
            c.setTailNo(splits[1]);
            c.setAircraftWght(Integer.parseInt(splits[3]));
            c.setTakeoffWeight(Integer.parseInt(splits[5]));
            c.setHeight(Integer.parseInt(splits[9]));
            c.setLength(Integer.parseInt(splits[11]));
            c.setWidth(Integer.parseInt(splits[13]));
            }
        }catch (FileNotFoundException ex) {
            System.err.println("IO ERROR received: "+ ex.getMessage());
            ex.printStackTrace();
            log.severe("In Read Catch block. Error received");
        }
    }
    
    private List sort(List<Aircraft> listOfAircrafts){
        log.info("Sorting the list");
        listOfAircrafts.sort(Comparator.comparing(Aircraft::getTailNo));
        return listOfAircrafts;
    }
    
    
    private void run(){
       Scanner sc=new Scanner(System.in);       
        try {
            Handler handler = new FileHandler(logDirPath + sep + "server.log");
            Logger.getLogger("").addHandler(handler);

        } catch (IOException ex) {
            Logger.getLogger(AircraftTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(AircraftTest.class.getName()).log(Level.SEVERE, null, ex);
        }       
       //inputs();
       //print();
       String filename = "AircraftList.txt";
       //ArrayList<Aircraft> list = (ArrayList<Aircraft>) fleet.listOfAircraft;
       //fleet.load(list, filename);
       //System.out.println("Data loaded into file!!!");
       System.out.println("Press any key to load unsorted data and print it.. ");
       String anyKey = sc.next();
       //fleet.clearlist(list);
       //System.out.println("List cleared!!");
       loadBack(filename);
       System.out.println("Unsorted Arraylist");
       List<Aircraft> listOfAircraft = fleet.listOfAircraft;
       print(listOfAircraft);
       List<Aircraft> sortedList = sort(listOfAircraft);
       System.out.println("Sorted Arraylist");
       print(sortedList);    
       
       
    }    
    
    public static void main(String[] args){
        AircraftTest at = new AircraftTest();
        at.run();
    }
}
