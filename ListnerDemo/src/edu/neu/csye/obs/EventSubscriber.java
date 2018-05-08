/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye.obs;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Bengre
 */
public class EventSubscriber implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ES received update from: " + o);
        System.out.println("                    message: " + arg);
    }
    
}
