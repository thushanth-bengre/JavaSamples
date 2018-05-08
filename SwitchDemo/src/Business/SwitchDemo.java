/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.IOException;

/**
 *
 * @author Bengre
 */
public class SwitchDemo {
    
    
    public static void main(String[] args) throws IOException{
        char inChar = ' ';
        System.out.println("Enter a character('a','b', 'c') or q to quit:");
        //demo of do while
        do{
            inChar = (char) System.in.read();
            System.out.println("inChar : "+ inChar + " > " + (int)inChar);
                  
        
        switch(inChar){
            case 'a':
            case 'A':
                System.out.println("You selected A");
            case 'b':
            case 'B':
                System.out.println("You selected B");
            case 'c':
            case 'C':
                System.out.println("You selected C");
            case '\n':
            case '\r':
                break;
            default:
                System.out.println("Invalid Selection");
        }
        
         }while(inChar != 'q');//end of do while
    }
}
