/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.FitnessCoachRole;
import Business.Role.NutritionistRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author deves
 */
public class LifestyleProgramOrganization extends Organization {

    public LifestyleProgramOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FitnessCoachRole());
        roles.add(new NutritionistRole());
        return roles;
    }
}
