/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ProgramAdministratorRole.ProgramAdministratorWorkAreaJPanel;

/**
 *
 * @author deves
 */
public class ProgramAdministratorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel rightPanel, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new ProgramAdministratorWorkAreaJPanel(rightPanel, enterprise, account, business);
    }
}