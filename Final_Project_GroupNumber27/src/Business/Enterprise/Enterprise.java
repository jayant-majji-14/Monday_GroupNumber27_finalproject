/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;


/**
 *
 * @author deves
 */
public class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    // Constructor
    public Enterprise(String name, EnterpriseType type) {
        super(name);  // Call Organization's constructor with only the name
        this.enterpriseType = type;  // Set the enterprise type
        this.organizationDirectory = new OrganizationDirectory();  // Initialize organization directory
    }

    // Getter for OrganizationDirectory
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    // Enum for Enterprise Types specific to the project
    public enum EnterpriseType {
        Hospital("Hospital"),
        Screening("Screening"),
        Pharmacy("Pharmacy"),
        NGO("NGO"),
        LifestyleProgram("Lifestyle Program");

        private String value;

        // Constructor for EnterpriseType
        private EnterpriseType(String value) {
            this.value = value;
        }

        // Getter for value
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    // Getter for EnterpriseType
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    // Setter for EnterpriseType
    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
}
