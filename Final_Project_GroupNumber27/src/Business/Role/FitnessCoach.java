/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author jayantmajji
 */
public class FitnessCoach extends Role {
    private String coachId;
    private String name;
    private String email;
    private String phoneNo;
    private String certification;
    private int yearsOfExperience;
    private String specialization;

    // No-argument constructor
    public FitnessCoach() {
        super("Fitness Coach");
        this.coachId = "";
        this.name = "Default Coach";
        this.email = "";
        this.phoneNo = "";
        this.certification = "None";
        this.yearsOfExperience = 0;
        this.specialization = "General Fitness";
    }

    // Parameterized constructor
    public FitnessCoach(String coachId, String name, String email, String phoneNo, String certification, int yearsOfExperience, String specialization) {
        super("Fitness Coach");
        this.coachId = coachId;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.certification = certification;
        this.yearsOfExperience = yearsOfExperience;
        this.specialization = specialization;
    }

    // Getters and Setters (unchanged)
    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Override performRole
    @Override
    public void performRole() {
        System.out.println("Fitness Coach " + name + " is preparing fitness plans.");
    }

    @Override
    public String toString() {
        return "FitnessCoach{" +
                "coachId='" + coachId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", certification='" + certification + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}