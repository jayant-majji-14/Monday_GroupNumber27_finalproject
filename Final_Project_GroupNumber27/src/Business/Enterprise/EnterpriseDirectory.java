package Business.Enterprise;

import java.util.ArrayList;

/**
 * Manages a list of enterprises in the system.
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList; // List of all enterprises

    // Constructor
    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    // Getter for the enterprise list
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    // Setter for the enterprise list
    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    /**
     * Creates and adds a new enterprise to the directory based on its type.
     *
     * @param organizationId Unique ID for the enterprise.
     * @param name           Name of the enterprise.
     * @param type           Type of the enterprise.
     * @return The created enterprise.
     */
    public Enterprise createAndAddEnterprise(String organizationId, String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;

        switch (type) {
            case HealthcareFacility:
                enterprise = new HealthcareFacilityEnterprise(organizationId, name);
                break;
            case CentralLaboratory:
                enterprise = new CentralLabortoryEnterprise(organizationId, name);
                break;
            case ResearchDepartment:
                enterprise = new ResearchDepartmentEnterprise(organizationId, name);
                break;
            case LifeStyleCoachingUnit:
                enterprise = new LifestyleCoachingUnitEnterprise(organizationId, name);
                break;
        }

        if (enterprise != null) {
            enterpriseList.add(enterprise);
        }

        return enterprise;
    }
}
