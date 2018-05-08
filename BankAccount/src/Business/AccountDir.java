/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bengre
 */
public class AccountDir {
    private ArrayList<Account> accountList;
    
    public AccountDir(){
        accountList = new ArrayList();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    public Account addAccount(){
        Account a= new Account();
        accountList.add(a);
        return a;                
    }
    
    public void deleteAccount(Account a){
        accountList.remove(a);
    }
    
    public Account searchAccount(String accNo){
        for(Account a:accountList){
            if(a.getAccountNo().equals(accNo)){
                return a;
            }               
        }
        return null;            
    }
}
