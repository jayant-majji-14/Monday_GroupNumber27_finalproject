package Business.Organization;

import Business.Role.Patient;
import java.util.ArrayList;

public class PatientOrganization extends Organization {
    private ArrayList<Patient> patients; // List of patients in the organization

    // Constructor
    public PatientOrganization(String organizationId, String organizationName) {
        super(organizationId, organizationName, "PatientOrganization");
        this.patients = new ArrayList<>();
        // Add Patient role to the organization roles
        addRole(new Patient()); // Ensure Patient has a no-argument constructor
    }

    // Method to add a patient to the organization
    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    // Method to remove a patient from the organization
    public void removePatient(Patient patient) {
        this.patients.remove(patient);
    }

    // Get all patients
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    // Override performOrganizationFunction method
    @Override
    public void performOrganizationFunction() {
        System.out.println("Patient Organization " + getOrganizationName() + " is managing patients.");
        System.out.println("List of patients in the organization:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName() + " (ID: " + patient.getPatientId() + ")");
        }
    }

    // To String for better representation
    @Override
    public String toString() {
        return "PatientOrganization{" +
                "organizationId='" + getOrganizationId() + '\'' +
                ", organizationName='" + getOrganizationName() + '\'' +
                ", organizationType='" + getOrganizationType() + '\'' +
                ", patients=" + patients +
                '}';
    }
}
