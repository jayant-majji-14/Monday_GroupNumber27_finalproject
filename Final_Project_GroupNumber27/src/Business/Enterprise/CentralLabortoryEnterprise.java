package Business.Enterprise;

/**
 * Represents a Central Laboratory Enterprise.
 */
public class CentralLabortoryEnterprise extends Enterprise {

    // Constructor
    public CentralLabortoryEnterprise(String organizationId, String name) {
        super(organizationId, name, EnterpriseType.CentralLaboratory);
    }

    // Implementing the abstract method for enterprise-specific functionality
    @Override
    public void performEnterpriseFunction() {
        System.out.println("Central Laboratory Enterprise " + getOrganizationName() + " is managing laboratory operations and testing.");
    }

    // Implementing the abstract method from Organization
    @Override
    public void performOrganizationFunction() {
        System.out.println("Performing organization-level operations for Central Laboratory Enterprise.");
    }

    // Additional functionality specific to CentralLaboratoryEnterprise can be added here
}
