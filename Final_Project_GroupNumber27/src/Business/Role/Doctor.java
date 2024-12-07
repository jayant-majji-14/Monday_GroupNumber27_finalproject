package Business.Role;

import java.util.ArrayList;

public class Doctor extends Role {
    private String doctorId;
    private String name;
    private String email;
    private String phoneNo;
    private ArrayList<String> workingDays;
    private String workingTimings;

    // No-argument constructor
    public Doctor() {
        super("Doctor");
        this.doctorId = "";
        this.name = "Default Doctor";
        this.email = "";
        this.phoneNo = "";
        this.workingDays = new ArrayList<>();
        this.workingTimings = "";
    }

    // Parameterized constructor
    public Doctor(String doctorId, String name, String email, String phoneNo, ArrayList<String> workingDays, String workingTimings) {
        super("Doctor");
        this.doctorId = doctorId;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.workingDays = workingDays;
        this.workingTimings = workingTimings;
    }

    // Getters and Setters
    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
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

    public ArrayList<String> getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(ArrayList<String> workingDays) {
        this.workingDays = workingDays;
    }

    public String getWorkingTimings() {
        return workingTimings;
    }

    public void setWorkingTimings(String workingTimings) {
        this.workingTimings = workingTimings;
    }

    // Override performRole method
    @Override
    public void performRole() {
        System.out.println("Doctor " + name + " is performing their role.");
    }

    // To String for better representation
    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId='" + doctorId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", workingDays=" + workingDays +
                ", workingTimings='" + workingTimings + '\'' +
                '}';
    }
}
