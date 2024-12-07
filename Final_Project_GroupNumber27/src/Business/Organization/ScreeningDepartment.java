package Business.Organization;

import Business.Role.LabAssistant;
import Business.Role.ResearchScientist;
import java.util.ArrayList;

public class ScreeningDepartment extends Organization {
    private ArrayList<LabAssistant> labAssistants; // List of lab assistants
    private ArrayList<ResearchScientist> researchScientists; // List of research scientists

    // Constructor
    public ScreeningDepartment(String organizationId, String organizationName) {
        super(organizationId, organizationName, "ScreeningDepartment");
        this.labAssistants = new ArrayList<>();
        this.researchScientists = new ArrayList<>();
        // Add Lab Assistant and Research Scientist roles to the organization
        addRole(new LabAssistant());
        addRole(new ResearchScientist());
    }

    // Methods to add and remove Lab Assistants
    public void addLabAssistant(LabAssistant labAssistant) {
        this.labAssistants.add(labAssistant);
    }

    public void removeLabAssistant(LabAssistant labAssistant) {
        this.labAssistants.remove(labAssistant);
    }

    // Methods to add and remove Research Scientists
    public void addResearchScientist(ResearchScientist scientist) {
        this.researchScientists.add(scientist);
    }

    public void removeResearchScientist(ResearchScientist scientist) {
        this.researchScientists.remove(scientist);
    }

    // Getters
    public ArrayList<LabAssistant> getLabAssistants() {
        return labAssistants;
    }

    public ArrayList<ResearchScientist> getResearchScientists() {
        return researchScientists;
    }

    // Override performOrganizationFunction method
    @Override
    public void performOrganizationFunction() {
        System.out.println("Screening Department " + getOrganizationName() + " is managing lab assistants and research scientists.");
        System.out.println("List of Lab Assistants:");
        for (LabAssistant labAssistant : labAssistants) {
            System.out.println("- " + labAssistant.getName() + " (ID: " + labAssistant.getLabAssistantId() + ")");
        }
        System.out.println("List of Research Scientists:");
        for (ResearchScientist scientist : researchScientists) {
            System.out.println("- " + scientist.getName() + " (ID: " + scientist.getScientistId() + ")");
        }
    }

    @Override
    public String toString() {
        return "ScreeningDepartment{" +
                "organizationId='" + getOrganizationId() + '\'' +
                ", organizationName='" + getOrganizationName() + '\'' +
                ", organizationType='" + getOrganizationType() + '\'' +
                ", labAssistants=" + labAssistants +
                ", researchScientists=" + researchScientists +
                '}';
    }
}
