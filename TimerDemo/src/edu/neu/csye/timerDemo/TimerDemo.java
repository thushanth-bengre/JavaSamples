/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye.timerDemo;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Bengre
 */
public class TimerDemo {

    private Timer timer;
    public TimerDemo() {
        timer = new Timer();
        timer.schedule(new RemindTask(), 1000L, 3000L);
    }
    
    class RemindTask extends TimerTask{
        private int counter = 0;
        @Override
        public void run() {
            System.out.println("Timer alert " + counter++);
            Toolkit.getDefaultToolkit().beep();
            if(counter >=5) timer.cancel();
        }
        
    }
    
    MyRunnable myRunA = null;
    
   
    
    public TimerDemo(){
        
    }    
    
    
    public void run(){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TimerDemo td = new TimerDemo();
        td.run();
        System.out.println("We are done with this main!!");     
    }
    
}
