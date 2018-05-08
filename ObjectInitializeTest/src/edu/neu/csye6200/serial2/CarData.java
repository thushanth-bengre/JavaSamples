/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.serial2;

import java.io.Serializable;

/**
 *
 * @author Bengre
 */
public class CarData implements Serializable,Comparable<CarData>{
    private int iValue = 0;
    private double dvalue =1.0;
    private String name;

    public CarData(int iValue, double dValue, String name) {
        this.dvalue=dValue;
        this.iValue = iValue;
        this.name=name;
    }

    public int getiValue() {
        return iValue;
    }

    public double getDvalue() {
        return dvalue;
    }

    public String getName() {
        return name;
    }  

    @Override
    public int compareTo(CarData o) {
        return name.compareTo(o.getName());
    }
    
}
