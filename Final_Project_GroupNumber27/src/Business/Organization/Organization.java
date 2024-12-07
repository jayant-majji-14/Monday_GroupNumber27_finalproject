package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 * Base class for all organizations in the system.
 */
public abstract class Organization {
    private String organizationId;
    private String organizationName;
    private String organizationType;
    private ArrayList<Role> roles; // Roles available in this organization

    // Enum to define organization types
    public enum Type {
        Doctor("Doctor Organization"),
        Patient("Patient Organization"),
        Screening("Screening Department"),
        Exercise("Exercise Program Team"),
        Pharmacy("Pharmacy Network Organization"),
        NGO("NGO");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

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

    // Abstract method for organization-specific functionality
    public abstract void performOrganizationFunction();

    // ToString for better representation
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
