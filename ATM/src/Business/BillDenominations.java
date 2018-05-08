/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import UserInterface.CshWdJPanel;

/**
 *
 * @author Bengre
 */
public class BillDenominations {
    
    private int twentyBill;
    private int tenBill;
    private int fiveBill;
   
    
    public BillDenominations(){
    }
    
    
       
    public int getTwentyBill(int amountEntered) {
        twentyBill = amountEntered/20;
        return twentyBill;
    }

    public int getTenBill(int amountEntered) {
        int remainder;
        remainder = amountEntered%20;
        tenBill = remainder/10;
        return tenBill;
    }

    public int getFiveBill(int amountEntered) {
        int remainder;
        remainder = amountEntered %10;
        fiveBill = remainder /5;
        return fiveBill;
    }
    
    
}
