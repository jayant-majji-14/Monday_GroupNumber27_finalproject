/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author deves
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    // Constructor to initialize the enterprise list
    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    // Getter for enterprise list
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    // Setter for enterprise list
    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    // Method to create and add an enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;

        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }

        if (type == Enterprise.EnterpriseType.Screening) {
            enterprise = new ScreeningEnterprise(name);
            enterpriseList.add(enterprise);
        }

        if (type == Enterprise.EnterpriseType.Pharmacy) {
            enterprise = new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        }

        if (type == Enterprise.EnterpriseType.NGO) {
            enterprise = new NGOEnterprise(name);
            enterpriseList.add(enterprise);
        }

        if (type == Enterprise.EnterpriseType.LifestyleProgram) {
            enterprise = new LifestyleProgramEnterprise(name);
            enterpriseList.add(enterprise);
        }

        return enterprise;
    }
    
}
