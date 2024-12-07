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
import userinterface.SystemAdminRole.SystemAdminWorkAreaJPanel;


/**
 *
 * @author deves
 */
public class SystemAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel rightPanel, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        // The SystemAdmin's work area will include options to manage the entire system, such as user management, system settings, etc.
        return new SystemAdminWorkAreaJPanel(rightPanel, enterprise, account, business);
    }
}
