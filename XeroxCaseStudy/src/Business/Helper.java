/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author siri chowdhary
 */
public class Helper {
    
    // calculate comission 
    public  static double calculateComission(int salesPrice,int targetPrice){
    
    double comission = (targetPrice*(0.1)) ;
    
    if(salesPrice > targetPrice){        
      comission += ((salesPrice-targetPrice)*(0.1)); 
      return comission;
    }
    else
    if(salesPrice == targetPrice){
       return comission;       
    } else  
    if(salesPrice < targetPrice){        
      comission -= (targetPrice-salesPrice)*(0.1);  
      return comission;
    }
    return 0;
}
    
    public static int giveDifference(int salesPrice,int targetPrice){
     
        return (salesPrice-targetPrice);
    }   
        
    
}
