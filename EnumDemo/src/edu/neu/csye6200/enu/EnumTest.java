/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.enu;

/**
 *
 * @author Bengre
 */
public class EnumTest {
    
    enum Weekday {
        SUNDAY(10) , MONDAY(11), TUESDAY(12), WEDNESDAY(13), THURSDAY(14), FRIDAY(20), SATURDAY(30);
        
        private int value;

        private Weekday(int n) {
            value =n;
        }
        public int getValue(){
            return value;
        }
        
    }
    
    private Weekday myDay = Weekday.WEDNESDAY;

    public EnumTest(){
        System.out.println("Current Day is" +myDay);
        setMyDay(Weekday.TUESDAY);
        System.out.println("Current Day is" +myDay);
        
        for(Weekday d: Weekday.values()){
            System.out.println("Day is " +d.name() + ", Ordinal: " + d.ordinal() +  ", Value :" +d.getValue());
        }
        
    }
    
    public Weekday getMyDay(){
        return myDay;
    }

    public void setMyDay(Weekday myDay) {
        this.myDay = myDay;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnumTest et = new EnumTest();
    }
    
}
