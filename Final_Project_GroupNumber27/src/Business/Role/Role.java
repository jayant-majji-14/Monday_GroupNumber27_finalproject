/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author deves
 */
public abstract class Role {
    
    public enum RoleType {
        Patient("Patient"),
        LabAssistant("Lab Assistant"),
        ResearchScientist("Research Scientist"),
        Doctor("Doctor"),
        Nutritionist("Nutritionist"),
        Pharmacist("Pharmacist"),
        ProgramAdministrator("Program Administrator"),
        FitnessCoach("Fitness Coach");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    /**
     * Abstract method for the role-specific operations. This could be used to 
     * define any common functionality across roles.
     */
    public abstract void performRoleOperations();

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
