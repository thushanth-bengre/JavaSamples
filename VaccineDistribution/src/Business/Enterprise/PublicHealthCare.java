/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Bengre
 */
public class PublicHealthCare extends Enterprise{
    public PublicHealthCare(String name) {
        super(name, Enterprise.EnterpriseType.PublicHealthCare);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
