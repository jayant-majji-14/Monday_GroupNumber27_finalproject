package Business.Enterprise;

/**
 * Represents a Healthcare Facility Enterprise.
 */
public class HealthcareFacilityEnterprise extends Enterprise {

    // Constructor
    public HealthcareFacilityEnterprise(String organizationId, String name) {
        super(organizationId, name, EnterpriseType.HealthcareFacility);
    }

    // Implementing the abstract method for enterprise-specific functionality
    @Override
    public void performEnterpriseFunction() {
        System.out.println("Healthcare Facility Enterprise " + getOrganizationName() + " is managing healthcare services.");
    }

    // Implementing the abstract method from Organization
    @Override
    public void performOrganizationFunction() {
        System.out.println("Performing organization-level operations for Healthcare Facility Enterprise.");
    }

    // Additional functionality specific to HealthcareFacilityEnterprise can be added here
}
