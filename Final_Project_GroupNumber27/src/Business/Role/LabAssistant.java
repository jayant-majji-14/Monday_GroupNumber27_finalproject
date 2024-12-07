/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author jayantmajji
 */
public class LabAssistant extends Role {
    private String labAssistantId;
    private String name;
    private String phoneNo;
    private String labNo;

    // No-argument constructor
    public LabAssistant() {
        super("Lab Assistant");
        this.labAssistantId = "";
        this.name = "Default Lab Assistant";
        this.phoneNo = "";
        this.labNo = "Default Lab";
    }

    // Parameterized constructor
    public LabAssistant(String labAssistantId, String name, String phoneNo, String labNo) {
        super("Lab Assistant");
        this.labAssistantId = labAssistantId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.labNo = labNo;
    }

    // Getters and Setters
    public String getLabAssistantId() {
        return labAssistantId;
    }

    public void setLabAssistantId(String labAssistantId) {
        this.labAssistantId = labAssistantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLabNo() {
        return labNo;
    }

    public void setLabNo(String labNo) {
        this.labNo = labNo;
    }

    // Override performRole method
    @Override
    public void performRole() {
        System.out.println("Lab Assistant " + name + " is processing samples in lab " + labNo + ".");
    }

    @Override
    public String toString() {
        return "LabAssistant{" +
                "labAssistantId='" + labAssistantId + '\'' +
                ", name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", labNo='" + labNo + '\'' +
                '}';
    }
}