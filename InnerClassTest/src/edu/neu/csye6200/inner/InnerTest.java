/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.inner;

/**
 *
 * @author Bengre
 */
public class InnerTest {
    
    private int key = 20;

    public InnerTest() {
        InnerProc ip = new InnerProc();
        String str0 = "My secret message 123";
        System.out.println("Str0 "  +str0);
        String str1 = ip.encode(str0);
        System.out.println("Str1 "  +str1);
        String str2 = ip.encode(str1);
        System.out.println("Str2 "  +str2);
        
        
    }
    
    //innerClass
    public class InnerProc{
    public String encode(String input){
        StringBuffer sb = new StringBuffer();
        for(char c : input.toCharArray()){
            char c2 = (char) (c^key);
            sb.append(c2);
        }
        
        return sb.toString();
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InnerTest it = new InnerTest();
    }
    
}
