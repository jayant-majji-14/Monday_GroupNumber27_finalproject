/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jayantmajji
 */
public abstract class Organization {
    private String organizationId; // Unique identifier for the organization
    private String organizationName; // Name of the organization
    private String organizationType; // Type of organization (e.g., Doctor, Patient)
    private ArrayList<Role> roles; // List of roles associated with the organization

    // Constructor
    public Organization(String organizationId, String organizationName, String organizationType) {
        this.organizationId = organizationId;
        this.organizationName = organizationName;
        this.organizationType = organizationType;
        this.roles = new ArrayList<>();
    }

    // Getters and Setters
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }

    // Add a role to the organization
    public void addRole(Role role) {
        this.roles.add(role);
    }

    // Remove a role from the organization
    public void removeRole(Role role) {
        this.roles.remove(role);
    }

    // Abstract method for specific organization functionality
    public abstract void performOrganizationFunction();

    // To String for better representation
    @Override
    public String toString() {
        return "Organization{" +
                "organizationId='" + organizationId + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", organizationType='" + organizationType + '\'' +
                ", roles=" + roles +
                '}';
    }
}
