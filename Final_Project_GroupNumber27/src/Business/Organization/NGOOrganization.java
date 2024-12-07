/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.ProgramAdministratorRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author deves
 */
public class NGOOrganization extends Organization {

    public NGOOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProgramAdministratorRole());
        return roles;
    }
}
