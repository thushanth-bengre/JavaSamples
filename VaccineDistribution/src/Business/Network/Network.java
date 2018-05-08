/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.Distributor;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Inventory.Inventory;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.Role.InventoryRole;
import Business.Role.NetworkAdminRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Vaccine.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author Bengre
 */
public class Network extends Organization{
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private Inventory provider;

    public Network(String name) {
        super(name);
        enterpriseDirectory = new EnterpriseDirectory();
        provider = new Inventory();
    }

    public Inventory getProvider() {
        return provider;
    }

    public void setProvider(Inventory provider) {
        this.provider = provider;
    }    
    

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new NetworkAdminRole());
        roleList.add(new InventoryRole());
        return roleList;
    }
    
    public void addItemToInventory(Vaccine v, int qty){
        provider.addInventoryItem(v, qty);
    }
}
