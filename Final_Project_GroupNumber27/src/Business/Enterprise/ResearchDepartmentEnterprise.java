package Business.Enterprise;

/**
 * Represents a Research Department Enterprise.
 */
public class ResearchDepartmentEnterprise extends Enterprise {

    // Constructor
    public ResearchDepartmentEnterprise(String organizationId, String name) {
        super(organizationId, name, EnterpriseType.ResearchDepartment);
    }

    // Implementing the abstract method for enterprise-specific functionality
    @Override
    public void performEnterpriseFunction() {
        System.out.println("Research Department Enterprise " + getOrganizationName() + " is conducting research and development activities.");
    }

    // Implementing the abstract method from Organization
    @Override
    public void performOrganizationFunction() {
        System.out.println("Performing organization-level operations for Research Department Enterprise.");
    }

    // Additional functionality specific to ResearchDepartmentEnterprise can be added here
}
