/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author jayantmajji
 */
public class Pharmacist extends Role {
    private String pharmacistId;
    private String pharmacyName;
    private String name;
    private String email;
    private String phoneNo;

    // No-argument constructor
    public Pharmacist() {
        super("Pharmacist");
        this.pharmacistId = "";
        this.pharmacyName = "Default Pharmacy";
        this.name = "Default Pharmacist";
        this.email = "";
        this.phoneNo = "";
    }

    // Parameterized constructor
    public Pharmacist(String pharmacistId, String pharmacyName, String name, String email, String phoneNo) {
        super("Pharmacist");
        this.pharmacistId = pharmacistId;
        this.pharmacyName = pharmacyName;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    // Getters and Setters
    public String getPharmacistId() {
        return pharmacistId;
    }

    public void setPharmacistId(String pharmacistId) {
        this.pharmacistId = pharmacistId;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
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

    // Override performRole method
    @Override
    public void performRole() {
        System.out.println("Pharmacist " + name + " from " + pharmacyName + " is managing medication plans.");
    }

    // To String for better representation
    @Override
    public String toString() {
        return "Pharmacist{" +
                "pharmacistId='" + pharmacistId + '\'' +
                ", pharmacyName='" + pharmacyName + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}