/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.FitnessCoach;
import java.util.ArrayList;

/**
 *
 * @author jayantmajji
 */
    public class ExerciseProgramTeam extends Organization {
    private ArrayList<FitnessCoach> fitnessCoaches; // List of fitness coaches in the organization

    // Constructor
    public ExerciseProgramTeam(String organizationId, String organizationName) {
        super(organizationId, organizationName, "ExerciseProgramTeam");
        this.fitnessCoaches = new ArrayList<>();
        // Add Fitness Coach role to the organization roles
        addRole(new FitnessCoach()); // Ensure FitnessCoach has a no-argument constructor
    }

    // Method to add a fitness coach to the organization
    public void addFitnessCoach(FitnessCoach fitnessCoach) {
        this.fitnessCoaches.add(fitnessCoach);
    }

    // Method to remove a fitness coach from the organization
    public void removeFitnessCoach(FitnessCoach fitnessCoach) {
        this.fitnessCoaches.remove(fitnessCoach);
    }

    // Get all fitness coaches
    public ArrayList<FitnessCoach> getFitnessCoaches() {
        return fitnessCoaches;
    }

    // Override performOrganizationFunction method
    @Override
    public void performOrganizationFunction() {
        System.out.println("Exercise Program Team " + getOrganizationName() + " is managing fitness coaches.");
        System.out.println("List of fitness coaches in the organization:");
        for (FitnessCoach fitnessCoach : fitnessCoaches) {
            System.out.println("- " + fitnessCoach.getName() + " (ID: " + fitnessCoach.getCoachId() + ")");
        }
    }

    // To String for better representation
    @Override
    public String toString() {
        return "ExerciseProgramTeam{" +
                "organizationId='" + getOrganizationId() + '\'' +
                ", organizationName='" + getOrganizationName() + '\'' +
                ", organizationType='" + getOrganizationType() + '\'' +
                ", fitnessCoaches=" + fitnessCoaches +
                '}';
    }
}
