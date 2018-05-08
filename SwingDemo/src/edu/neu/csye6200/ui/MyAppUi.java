/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Bengre
 */
public class MyAppUi{

    
    private Logger log = Logger.getLogger(MyAppUi.class.getName());
    private JFrame frame = null;
    private JPanel mainPanel = null;
    private JButton startBtn = null;
    private JButton stopBtn = null;
    private MyCanvas canvas = null;
    //constructor
    public MyAppUi() {
        log.info("App Started");
        initGUI();
        
    }
    
    public static void main(String[] args){
        MyAppUi myApp = new MyAppUi();
        System.out.println("App ended");
    }

    private void initGUI() {
        frame = new JFrame();
        frame.setSize(900, 600);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MyAppUI");       
        frame.setLayout(new BorderLayout());
        frame.add(getMainPanel(), BorderLayout.NORTH);
        canvas = new MyCanvas();
        frame.add(canvas , BorderLayout.CENTER);
        canvas.repaint();
        frame.setVisible(true);
    }
    
    private JPanel getMainPanel(){
        mainPanel = new JPanel();
        
        mainPanel.setLayout(new FlowLayout());
        mainPanel.setBackground(Color.cyan);
        startBtn = new JButton("Start");
        stopBtn = new JButton("Stop");        
        mainPanel.add(startBtn);
        mainPanel.add(stopBtn);
        return mainPanel;
    }

    
    
}
