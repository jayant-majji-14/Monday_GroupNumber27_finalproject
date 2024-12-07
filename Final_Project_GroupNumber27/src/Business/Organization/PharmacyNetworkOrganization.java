package Business.Organization;

import Business.Role.Pharmacist;
import java.util.ArrayList;

public class PharmacyNetworkOrganization extends Organization {
    private ArrayList<Pharmacist> pharmacists; // List of pharmacists in the organization

    // Constructor
    public PharmacyNetworkOrganization(String organizationId, String organizationName) {
        super(organizationId, organizationName, "PharmacyNetworkOrganization");
        this.pharmacists = new ArrayList<>();
        // Add Pharmacist role to the organization roles
        addRole(new Pharmacist()); // Ensure Pharmacist has a no-argument constructor
    }

    // Method to add a pharmacist to the organization
    public void addPharmacist(Pharmacist pharmacist) {
        this.pharmacists.add(pharmacist);
    }

    // Method to remove a pharmacist from the organization
    public void removePharmacist(Pharmacist pharmacist) {
        this.pharmacists.remove(pharmacist);
    }

    // Get all pharmacists
    public ArrayList<Pharmacist> getPharmacists() {
        return pharmacists;
    }

    // Override performOrganizationFunction method
    @Override
    public void performOrganizationFunction() {
        System.out.println("Pharmacy Network Organization " + getOrganizationName() + " is managing pharmacists.");
        System.out.println("List of pharmacists in the organization:");
        for (Pharmacist pharmacist : pharmacists) {
            System.out.println("- " + pharmacist.getName() + " (ID: " + pharmacist.getPharmacistId() + ")");
        }
    }

    // To String for better representation
    @Override
    public String toString() {
        return "PharmacyNetworkOrganization{" +
                "organizationId='" + getOrganizationId() + '\'' +
                ", organizationName='" + getOrganizationName() + '\'' +
                ", organizationType='" + getOrganizationType() + '\'' +
                ", pharmacists=" + pharmacists +
                '}';
    }
}
