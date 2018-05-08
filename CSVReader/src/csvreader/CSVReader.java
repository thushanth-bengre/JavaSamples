/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvreader;

import Business.Airplane;
import Business.AirplaneList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class CSVReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String csvFile = "airplane_data.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        AirplaneList airplaneList = new AirplaneList();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] airplaneElement = line.split(cvsSplitBy);
                Airplane airplane = airplaneList.addAirplane();
                String airport = airplaneElement[0];
                String modelNumber = airplaneElement[1];
                String manufacturer = airplaneElement[2];
                int year = Integer.parseInt(airplaneElement[3]);
                airplane.setAirport(airport);
                airplane.setYear(year);
                airplane.setManufacturer(manufacturer);
                airplane.setModelNumber(modelNumber);
            }
            int i=1;
            for (Airplane a : airplaneList.getAirplaneList()) {
                System.out.println(i+":Airport-->"+a.getAirport()+"\tModel-->"+a.getModelNumber()+"\tManufacturer-->"+a.getManufacturer()+"\tYear-->"+a.getYear());
                i++;
                

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
