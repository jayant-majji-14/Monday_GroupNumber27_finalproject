/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author jayantmajji
 */
public class ResearchScientist extends Role {
    private String scientistId;
    private String name;
    private String testSpecialization;
    private String email;
    private String phoneNo;

    // No-argument constructor
    public ResearchScientist() {
        super("Research Scientist");
        this.scientistId = "";
        this.name = "Default Scientist";
        this.testSpecialization = "General";
        this.email = "";
        this.phoneNo = "";
    }

    // Parameterized constructor
    public ResearchScientist(String scientistId, String name, String testSpecialization, String email, String phoneNo) {
        super("Research Scientist");
        this.scientistId = scientistId;
        this.name = name;
        this.testSpecialization = testSpecialization;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    // Getters and Setters
    public String getScientistId() {
        return scientistId;
    }

    public void setScientistId(String scientistId) {
        this.scientistId = scientistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTestSpecialization() {
        return testSpecialization;
    }

    public void setTestSpecialization(String testSpecialization) {
        this.testSpecialization = testSpecialization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    // Override performRole method
    @Override
    public void performRole() {
        System.out.println("Research Scientist " + name + " is analyzing tests specializing in " + testSpecialization + ".");
    }

    @Override
    public String toString() {
        return "ResearchScientist{" +
                "scientistId='" + scientistId + '\'' +
                ", name='" + name + '\'' +
                ", testSpecialization='" + testSpecialization + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}