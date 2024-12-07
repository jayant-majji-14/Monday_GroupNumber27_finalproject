/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;


/**
 *
 * @author deves
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    // Constructor to initialize the organization list
    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    // Getter for the organization list
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    // Method to create and add an organization
    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;

        if (type.getValue().equals(Organization.Type.Patient.getValue())) {
            organization = new PatientOrganization("Patient Organization");
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Screening.getValue())) {
            organization = new ScreeningOrganization("Screening Organization");
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Doctor.getValue())) {
            organization = new DoctorOrganization("Doctor Organization");
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Pharmacy.getValue())) {
            organization = new PharmacyOrganization("Pharmacy Organization");
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.NGO.getValue())) {
            organization = new NGOOrganization("NGO Organization");
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.LifestyleProgram.getValue())) {
            organization = new LifestyleProgramOrganization("Lifestyle Program Organization");
            organizationList.add(organization);
        }

        return organization;
    }
    
}
