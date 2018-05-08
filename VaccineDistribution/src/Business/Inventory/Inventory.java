/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Vaccine.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author Bengre
 */
public class Inventory {
    private ArrayList<InventoryItem> inventory;

    public Inventory() {
        inventory = new ArrayList();
    }

    public ArrayList<InventoryItem> getInventory() {
        return inventory;
    }
    
    public InventoryItem addInventoryItem(Vaccine vaccine, int qty){
        InventoryItem iv = new InventoryItem();
        inventory.add(iv);
        iv.setQty(qty);
        iv.setVaccine(vaccine);
        return iv;
    }
    
}
