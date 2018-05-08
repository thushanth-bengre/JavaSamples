/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye.timerDemo;

/**
 *
 * @author Bengre
 */
public class MyThread extends Thread{

    private boolean  done = false;
    private int ctr = 0;
    public MyThread(String name) {
        super(name);
    }
    
    @Override
    public void run(){
        while(!done){
            doWork();
            ctr++;
            if((ctr %10) ==0)
            System.out.println("Thread: " +this.getName() + " - loop # " + ctr);
        }
    }
    
    private void doWork(){
        for(int i = 0; i< 1000000; i++){
            double val = Math.exp((double) i);
        }
    }
    
}
