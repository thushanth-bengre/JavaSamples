/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Distributor;
import Business.Inventory.Inventory;
import Business.Inventory.InventoryItem;
import Business.Network.Network;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.Role.InventoryRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Vaccine.Disease;
import Business.Vaccine.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author Bengre
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private ArrayList<Disease> listOfDisease;
    private ArrayList<Vaccine> listOfVaccine;
    private Inventory provider;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        listOfDisease = new ArrayList();
        listOfVaccine = new ArrayList();
        provider = new Inventory();
    }

    public Inventory getProvider() {
        return provider;
    }

    public void setProvider(Inventory provider) {
        this.provider = provider;
    }
    

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public ArrayList<Disease> getListOfDisease() {
        return listOfDisease;
    }

    public ArrayList<Vaccine> getListOfVaccine() {
        return listOfVaccine;
    }
    
    

    public Network createAndAddNetwork(String name) {
        Network network = new Network(name);
        networkList.add(network);
        return network;
    }
    
    public Disease createAndAddDisease() {
        Disease disease = new Disease();        
        listOfDisease.add(disease);
        return disease;
    }
    
    public Vaccine createAndAddVaccine() {
        Vaccine vaccine = new Vaccine();
        listOfVaccine.add(vaccine);
        return vaccine;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        roleList.add(new InventoryRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }
    
    public void addItemToInventory(Vaccine v, int qty){
        provider.addInventoryItem(v, qty);
    }   
    
    
}
