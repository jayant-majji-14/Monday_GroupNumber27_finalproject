package Business.Organization;

import Business.Role.ProgramAdministrator;
import java.util.ArrayList;

public class NGO extends Organization {
    private ArrayList<ProgramAdministrator> programAdministrators; // List of program administrators

    // Constructor
    public NGO(String organizationId, String organizationName) {
        super(organizationId, organizationName, "NGO");
        this.programAdministrators = new ArrayList<>();
        // Add Program Administrator role to the organization roles
        addRole(new ProgramAdministrator()); // Ensure ProgramAdministrator has a no-argument constructor
    }

    // Method to add a program administrator to the organization
    public void addProgramAdministrator(ProgramAdministrator admin) {
        this.programAdministrators.add(admin);
    }

    // Method to remove a program administrator from the organization
    public void removeProgramAdministrator(ProgramAdministrator admin) {
        this.programAdministrators.remove(admin);
    }

    // Get all program administrators
    public ArrayList<ProgramAdministrator> getProgramAdministrators() {
        return programAdministrators;
    }

    // Override performOrganizationFunction method
    @Override
    public void performOrganizationFunction() {
        System.out.println("NGO " + getOrganizationName() + " is managing program administrators.");
        System.out.println("List of program administrators in the organization:");
        for (ProgramAdministrator admin : programAdministrators) {
            System.out.println("- " + admin.getName() + " (ID: " + admin.getProgramAdminId() + ")");
        }
    }

    // To String for better representation
    @Override
    public String toString() {
        return "NGO{" +
                "organizationId='" + getOrganizationId() + '\'' +
                ", organizationName='" + getOrganizationName() + '\'' +
                ", organizationType='" + getOrganizationType() + '\'' +
                ", programAdministrators=" + programAdministrators +
                '}';
    }
}
