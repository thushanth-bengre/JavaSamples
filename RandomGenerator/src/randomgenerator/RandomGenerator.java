/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomgenerator;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.Random;

/**
 *
 * @author Bengre
 */
public class RandomGenerator {
    
    public String generateRandomChars(String c, int length) {
    StringBuilder sb = new StringBuilder();
        Random random = new Random();
    for (int i = 0; i < length; i++) {
        sb.append(c.charAt(random.nextInt(c.length())));
    }
    return sb.toString();
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomGenerator rg = new RandomGenerator();
        for(int i=0;i<200000;i++){
            String s = rg.generateRandomChars("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", 500);
            char[] try1 = s.toCharArray(); 
        for (int j = try1.length-1; j>=0; j--)
            System.out.print(try1[j]);
        }
        
        
    }
    
}
