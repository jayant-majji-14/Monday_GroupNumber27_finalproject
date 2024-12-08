/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Visitor.getValue())){
            organization = new VisitorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Screening.getValue())){
            organization = new ScreeningOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Radiology.getValue())){
            organization = new RadiologyOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.ResearchScientist.getValue())){
            organization = new ResearchScientistOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.ResearchAssistant.getValue())){
            organization = new ResearchAssistantOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacist.getValue())){
            organization = new PharmacistOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Nutritionist.getValue())){
            organization = new NutritionistOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Coach.getValue())){
            organization = new CoachOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}