package Business.Organization;

import Business.Role.Doctor;
import Business.Role.Nutritionist;
import java.util.ArrayList;

public class DoctorOrganization extends Organization {
    private ArrayList<Doctor> doctors; // List of doctors in this organization
    private ArrayList<Nutritionist> nutritionists; // List of nutritionists in this organization

    // Constructor
    public DoctorOrganization(String organizationId, String organizationName) {
        super(organizationId, organizationName, "DoctorOrganization");
        this.doctors = new ArrayList<>();
        this.nutritionists = new ArrayList<>();
        // Add Doctor and Nutritionist roles to the organization
        addRole(new Doctor()); // Ensure Doctor has a no-argument constructor
        addRole(new Nutritionist()); // Ensure Nutritionist has a no-argument constructor
    }

    // Methods to add and remove Doctors
    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    public void removeDoctor(Doctor doctor) {
        this.doctors.remove(doctor);
    }

    // Methods to add and remove Nutritionists
    public void addNutritionist(Nutritionist nutritionist) {
        this.nutritionists.add(nutritionist);
    }

    public void removeNutritionist(Nutritionist nutritionist) {
        this.nutritionists.remove(nutritionist);
    }

    // Getters
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Nutritionist> getNutritionists() {
        return nutritionists;
    }

    // Override performOrganizationFunction method
    @Override
    public void performOrganizationFunction() {
        System.out.println("Doctor Organization " + getOrganizationName() + " is managing doctors and nutritionists.");
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName() + " (ID: " + doctor.getDoctorId() + ")");
        }
        System.out.println("List of Nutritionists:");
        for (Nutritionist nutritionist : nutritionists) {
            System.out.println("- " + nutritionist.getName() + " (ID: " + nutritionist.getNutritionistId() + ")");
        }
    }

    @Override
    public String toString() {
        return "DoctorOrganization{" +
                "organizationId='" + getOrganizationId() + '\'' +
                ", organizationName='" + getOrganizationName() + '\'' +
                ", organizationType='" + getOrganizationType() + '\'' +
                ", doctors=" + doctors +
                ", nutritionists=" + nutritionists +
                '}';
    }
}
