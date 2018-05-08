package edu.neu.csye.obs;


import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bengre
 */
public class EventPublisher extends Observable {

    private boolean done = false;
    private int ctr =0;
    public EventPublisher() {
        System.out.println("Event Piblisher. We are here,");
    }
    
    public void run(){
        while(!done){
            doAction();
        if(ctr >10)
                done = true;
        }
        
    }
    
    public void doAction(){
        setChanged();
        notifyObservers(new String ("A message" + ctr++));
    }

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventPublisher ep = new  EventPublisher();
        EventSubscriber es = new EventSubscriber();
        ep.addObserver(es);
        ep.run();
    }
    
}
