package Business.Enterprise;

/**
 * Represents a Lifestyle Coaching Unit Enterprise.
 */
public class LifestyleCoachingUnitEnterprise extends Enterprise {

    // Constructor
    public LifestyleCoachingUnitEnterprise(String organizationId, String name) {
        super(organizationId, name, EnterpriseType.LifeStyleCoachingUnit);
    }

    // Implementing the abstract method for enterprise-specific functionality
    @Override
    public void performEnterpriseFunction() {
        System.out.println("Lifestyle Coaching Unit Enterprise " + getOrganizationName() + " is managing lifestyle improvement programs.");
    }

    // Implementing the abstract method from Organization
    @Override
    public void performOrganizationFunction() {
        System.out.println("Performing organization-level operations for Lifestyle Coaching Unit Enterprise.");
    }

    // Additional functionality specific to LifestyleCoachingUnitEnterprise can be added here
}
