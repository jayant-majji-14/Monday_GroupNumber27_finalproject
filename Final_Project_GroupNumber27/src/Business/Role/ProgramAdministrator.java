/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author jayantmajji
 */
public class ProgramAdministrator extends Role {
    private String programAdminId;
    private String name;
    private String email;
    private String phoneNo;

    // No-argument constructor
    public ProgramAdministrator() {
        super("Program Administrator");
        this.programAdminId = "";
        this.name = "Default Admin";
        this.email = "";
        this.phoneNo = "";
    }

    // Parameterized constructor
    public ProgramAdministrator(String programAdminId, String name, String email, String phoneNo) {
        super("Program Administrator");
        this.programAdminId = programAdminId;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    // Getters and Setters
    public String getProgramAdminId() {
        return programAdminId;
    }

    public void setProgramAdminId(String programAdminId) {
        this.programAdminId = programAdminId;
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
        System.out.println("Program Administrator " + name + " is managing intervention programs.");
    }

    // To String for better representation
    @Override
    public String toString() {
        return "ProgramAdministrator{" +
                "programAdminId='" + programAdminId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}