/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Employee.Employee;
import java.util.ArrayList;
import Business.Employee.Employee;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author deves
 */
public class ConfigureASystem {
    
    public static Ecosystem configure() {

        // Initialize the ecosystem
        Ecosystem system = Ecosystem.getInstance();

        // Create a default network
        Network network = system.createAndAddNetwork("Diabetes Network");

        // Create initial organizations
        OrganizationDirectory organizationDirectory = new OrganizationDirectory();
        Organization patientOrganization = organizationDirectory.createOrganization(Organization.Type.Patient);
        Organization screeningOrganization = network.getOrganizationDirectory().createOrganization("Screening Organization");
        Organization doctorOrganization = network.getOrganizationDirectory().createOrganization("Doctor Organization");
        Organization pharmacyOrganization = network.getOrganizationDirectory().createOrganization("Pharmacy Organization");
        Organization ngoOrganization = network.getOrganizationDirectory().createOrganization("NGO Organization");
        Organization lifestyleProgramOrganization = network.getOrganizationDirectory().createOrganization("Lifestyle Program Organization");

        // Create employees
        Employee sysAdmin = system.getEmployeeDirectory().createEmployee("System Admin");
        Employee labAssistant = screeningOrganization.getEmployeeDirectory().createEmployee("Lab Assistant");
        Employee researchScientist = screeningOrganization.getEmployeeDirectory().createEmployee("Research Scientist");
        Employee doctor = doctorOrganization.getEmployeeDirectory().createEmployee("Doctor");
        Employee pharmacist = pharmacyOrganization.getEmployeeDirectory().createEmployee("Pharmacist");
        Employee programAdministrator = ngoOrganization.getEmployeeDirectory().createEmployee("Program Administrator");
        Employee fitnessCoach = lifestyleProgramOrganization.getEmployeeDirectory().createEmployee("Fitness Coach");
        Employee nutritionist = lifestyleProgramOrganization.getEmployeeDirectory().createEmployee("Nutritionist");

        // Create user accounts for each role
        UserAccount sysAdminAccount = system.getUserAccountDirectory().createUserAccount(
                "sysadmin", "sysadmin", sysAdmin, new SystemAdminRole());
        UserAccount labAssistantAccount = screeningOrganization.getUserAccountDirectory().createUserAccount(
                "labassistant", "labassistant", labAssistant, new LabAssistantRole() {});
        UserAccount researchScientistAccount = screeningOrganization.getUserAccountDirectory().createUserAccount(
                "scientist", "scientist", researchScientist, new ResearchScientistRole());
        UserAccount doctorAccount = doctorOrganization.getUserAccountDirectory().createUserAccount(
                "doctor", "doctor", doctor, new DoctorRole());
        UserAccount pharmacistAccount = pharmacyOrganization.getUserAccountDirectory().createUserAccount(
                "pharmacist", "pharmacist", pharmacist, new PharmacistRole());
        UserAccount programAdminAccount = ngoOrganization.getUserAccountDirectory().createUserAccount(
                "programadmin", "programadmin", programAdministrator, new ProgramAdministratorRole());
        UserAccount fitnessCoachAccount = lifestyleProgramOrganization.getUserAccountDirectory().createUserAccount(
                "coach", "coach", fitnessCoach, new FitnessCoachRole());
        UserAccount nutritionistAccount = lifestyleProgramOrganization.getUserAccountDirectory().createUserAccount(
                "nutritionist", "nutritionist", nutritionist, new NutritionistRole());

        return system;
    }
    
}