/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.aircraft;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


/**
 *
 * @author Thushanth Devananda Bengre
 * NUID: 001826722
 */
public class Fleet {
    List<Aircraft> listOfAircraft;
    private static final Fleet INSTANCE = new Fleet();
    private static final Logger log = Logger.getLogger(Fleet.class.getName());
    
    
    private Fleet() {
        listOfAircraft = new ArrayList<>();        
    }
    
    public static Fleet getInstance(){
        log.info("Fleet Created!");
        return INSTANCE;
        
    }
    
    public List<Aircraft> getListOfAircraft() {
        return listOfAircraft;
    }
    
    

    public void setListOfAircraft(ArrayList<Aircraft> listOfAircraft) {
        this.listOfAircraft = listOfAircraft;
    }
    
    public Aircraft addAircraft(){
        log.info("New Aircraft Created");
        Aircraft a = new CargoAircraft();
        listOfAircraft.add(a);
        return a;
    } 
    
    
    //writes to file
    public void load(ArrayList<Aircraft> list, String fileName){
        try{
        FileWriter fw;
        fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        for(Aircraft a: list){
            CargoAircraft c  = (CargoAircraft) a;
            String print = c.printCargoInfo();
            save(print,bw);
        }
        bw.close();
        }
            catch(IOException ex){
                 System.err.println("IO ERROR received: "+ ex.getMessage());
                 ex.printStackTrace(); 
            }
        }
    
    
    private void save(String line, BufferedWriter bw) throws IOException{
        bw.write(line);
        bw.append(System.lineSeparator());
    }  
    
    public void clearlist(ArrayList<Aircraft> list){
        list.clear();
    }          
    
}
