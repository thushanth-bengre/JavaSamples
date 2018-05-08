/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author Bengre
 */
public class UserDir {
    //declaration
    private HashMap<String,User> userMap;
    
    //constructor
    public UserDir(){
        userMap = new HashMap();        
    }
    
    //getters and setters
    public HashMap<String, User> getUserMap() {
        return userMap;
    }
    
    public User addUser(String name){
        User u = new User();
        userMap.put(name, u);
        return u;
    }
    
    public void removeUser(String name){
        userMap.remove(name);
    }
    
    public User getUserDetails(String name){
        User u = userMap.get(name);
        if(u != null)
            return u;
        else 
            return null;
    }
    
}
