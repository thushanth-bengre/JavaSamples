/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.serial2;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Bengre
 */
public class SerialTest {
    
    private List<CarData> listOfCars;

    public SerialTest() {
        listOfCars = new ArrayList();
        listOfCars.add(new CarData(1, 2.0, "Ford"));
        listOfCars.add(new CarData(1, 2.0, "Audi"));
        listOfCars.add(new CarData(1, 2.0, "BMW"));
        listOfCars.add(new CarData(1, 2.0, "Toyota"));
        listOfCars.add(new CarData(1, 2.0, "Merc"));
        Collections.sort(listOfCars);
        for(CarData cd: listOfCars){
            System.out.println(cd.getName());
        }
    }
    
    public void streamOut(CarData cd, String fileName){
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cd);
            //oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
             ex.printStackTrace();
        }
    }
    
    public CarData streamIn(String fileName){
        CarData cd = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            cd = (CarData) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }        
        return cd;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Serializing a Ford");
        SerialTest st = new SerialTest();
        CarData cd= new CarData(1, 2.0, "Ford");
        st.streamOut(cd, "ford.data");
        CarData cd1 = st.streamIn("ford.data");
        System.out.println("Car 2 is: " + cd1.getName());
    }
    
}
