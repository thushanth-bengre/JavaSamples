/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Bengre
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.CDC){
            enterprise = new CDC(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Distributor){
            enterprise = new Distributor(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.PublicHealthCare){
            enterprise = new PublicHealthCare(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.SatelliteClinic){
            enterprise = new SatelliteClinic(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
