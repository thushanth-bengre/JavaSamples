/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.Inventory;
import Business.Role.InventoryRole;
import Business.Role.Role;
import Business.Vaccine.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author Bengre
 */
public class InventoryOrganization extends Organization{
    private Inventory inventory;
    public InventoryOrganization() {
        super(Organization.Type.Inventory.getValue());
        inventory = new Inventory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InventoryRole());
        return roles;
    }

    public Inventory getInventory() {
        return inventory;
    }
    
    public void addItemToInventory(Vaccine v, int qty){
        inventory.addInventoryItem(v, qty);
    } 
    
}
