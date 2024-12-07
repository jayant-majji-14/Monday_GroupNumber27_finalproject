package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 * Abstract class representing an enterprise in the system.
 */
public abstract class Enterprise extends Organization {
    private EnterpriseType enterpriseType; // Type of the enterprise
    private OrganizationDirectory organizationDirectory; // Directory to manage organizations within the enterprise

    // Enum for enterprise types
    public enum EnterpriseType {
        HealthcareFacility("Healthcare Facility"),
        CentralLaboratory("Central Laboratory"),
        ResearchDepartment("Research Department"),
        LifeStyleCoachingUnit("Lifestyle Coaching Unit");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    // Constructor
    public Enterprise(String organizationId, String name, EnterpriseType type) {
        super(organizationId, name, "Enterprise"); // Pass all required parameters to Organization constructor
        this.enterpriseType = type;
        this.organizationDirectory = new OrganizationDirectory();
    }

    // Getters and Setters
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    // Abstract method for enterprise-specific functionality
    public abstract void performEnterpriseFunction();

    // ToString for better representation
    @Override
    public String toString() {
        return "Enterprise{" +
                "enterpriseType=" + enterpriseType +
                ", name=" + getOrganizationName() +
                '}';
    }
}
