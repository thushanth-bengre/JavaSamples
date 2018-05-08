/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.Vector;

/**
 *
 * @author Bengre
 */
public class PrimeNumber {
        
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Vector<Long> list = new Vector<>();                              
    int primesRequired = 100;                                           

    list.add(2L);                                          
    list.add(3L);                                          
    long n = 5L;                                                  
    long d = 0L;                                                 

    outer:
    for( ; list.size() < primesRequired; n += 2) {      
      long limit = (long)Math.ceil(Math.sqrt((double)n));
      
      for(int i = 1; i < list.size() && (d = list.elementAt(i)) <= limit; ++i) {
        if(n%d == 0) {                                     
          continue outer;                                              
        }
      }
      list.add(n);                                           
    }
    
    for(Long i : list) {
        System.out.println(" " +i);
    }
  }
}