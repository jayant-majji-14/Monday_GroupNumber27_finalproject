/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author jayantmajji
 */
public class Nutritionist extends Role {
    private String nutritionistId;
    private String name;
    private String email;
    private String phoneNo;
    private String expertise; // Example: Weight Loss, Diabetes, Sports Nutrition
    private int yearsOfExperience;

    // No-argument constructor
    public Nutritionist() {
        super("Nutritionist");
        this.nutritionistId = "";
        this.name = "Default Nutritionist";
        this.email = "";
        this.phoneNo = "";
        this.expertise = "General";
        this.yearsOfExperience = 0;
    }

    // Parameterized constructor
    public Nutritionist(String nutritionistId, String name, String email, String phoneNo, String expertise, int yearsOfExperience) {
        super("Nutritionist");
        this.nutritionistId = nutritionistId;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.expertise = expertise;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Getters and Setters
    public String getNutritionistId() {
        return nutritionistId;
    }

    public void setNutritionistId(String nutritionistId) {
        this.nutritionistId = nutritionistId;
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

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    // Override performRole method
    @Override
    public void performRole() {
        System.out.println("Nutritionist " + name + " with expertise in " + expertise + " is preparing diet plans.");
    }

    @Override
    public String toString() {
        return "Nutritionist{" +
                "nutritionistId='" + nutritionistId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", expertise='" + expertise + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}