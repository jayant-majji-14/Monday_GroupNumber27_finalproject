package Business.Organization;

import java.util.ArrayList;

public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    // Method to create an organization based on its type
    public Organization createOrganization(Organization.Type type, String organizationId, String organizationName) {
        Organization organization = null;

        if (type.getValue().equals(Organization.Type.Doctor.getValue())) {
            organization = new DoctorOrganization(organizationId, organizationName);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Patient.getValue())) {
            organization = new PatientOrganization(organizationId, organizationName);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Screening.getValue())) {
            organization = new ScreeningDepartment(organizationId, organizationName);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Exercise.getValue())) {
            organization = new ExerciseProgramTeam(organizationId, organizationName);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Pharmacy.getValue())) {
            organization = new PharmacyNetworkOrganization(organizationId, organizationName);
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.NGO.getValue())) {
            organization = new NGO(organizationId, organizationName);
            organizationList.add(organization);
        }

        return organization;
    }
}
