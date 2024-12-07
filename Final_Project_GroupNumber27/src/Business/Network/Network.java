/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author deves
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    // Constructor to initialize the enterprise directory
    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    // Getter for network name
    public String getName() {
        return name;
    }

    // Setter for network name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for enterprise directory
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
