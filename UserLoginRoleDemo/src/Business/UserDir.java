/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bengre
 */
public class UserDir {
    private HashMap<String,User> userMap;
    public UserDir(){
        userMap = new HashMap();        
    }

    public HashMap<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(HashMap<String, User> userMap) {
        this.userMap = userMap;
    }
    
    public User addUser(String name, String password, String status, String role){
        String p = null;
        try {
            p= Utility.getSaltedHash(password);
        } catch (Exception ex) {
            Logger.getLogger(UserDir.class.getName()).log(Level.SEVERE, null, ex);
        }
        User u = new User();
        userMap.put(name, u);
        u.setName(name);
        u.setPassword(p);
        u.setRole(role);
        u.setStatus(status);
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
