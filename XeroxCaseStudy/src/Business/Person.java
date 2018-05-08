/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bengre
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int salesPersonId;
    private static int count = 0;
    private int totRevenue;
    private int aboveTarget;
    private int belowTarget;
    private int onTarget;
    private int targetPrice;
    private double commission;

    
    //constructor
    public Person(){  
        count++;
        salesPersonId = count;
        totRevenue =0 ;
        aboveTarget =0 ;
        belowTarget =0 ;
        targetPrice =0 ;
        commission = 0;
        onTarget =0;
    }
    
    //getters and setters

    public String getFirstName() {
        return firstName;
    }

    public int getSalesPersonId() {
        return salesPersonId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void addRevenue(int revenue){
        totRevenue += revenue;
    }
    
    public void belowSalesCount(){
        belowTarget++;
    }
    
    public void onTargetCount(){
        onTarget++;
    }
    
    public void aboveSalesCount(){
        aboveTarget++;
    }
    
    public void addTargetPrice(int price){
        targetPrice += price;
    }
    
    public void addCommission(double salesCommission){
        commission += salesCommission;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public double getCommission() {
        return commission;
    }    

    public int getOnTarget() {
        return onTarget;
    }
    
    public int getTotRevenue() {
        return totRevenue;
    }

    public int getAboveTarget() {
        return aboveTarget;
    }

    public int getBelowTarget() {
        return belowTarget;
    }

    public int getTagertSales() {
        return targetPrice;
    }
    
    
    
    
    @Override
    public String toString(){
        return firstName;
    }
    
}
