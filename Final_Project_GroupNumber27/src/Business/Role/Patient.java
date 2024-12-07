/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author jayantmajji
 */
public class Patient extends Role {
    private String patientId;
    private String name;
    private int age;
    private char gender; // 'M' Male, 'F' Female, 'O' Other
    private double height; // in centimeters
    private double weight; // in kilograms
    private String email;
    private String phoneNo;

    // No-argument constructor
    public Patient() {
        super("Patient");
        this.patientId = "";
        this.name = "Default Patient";
        this.age = 0;
        this.gender = 'O';
        this.height = 0.0;
        this.weight = 0.0;
        this.email = "";
        this.phoneNo = "";
    }

    // Parameterized constructor
    public Patient(String patientId, String name, int age, char gender, double height, double weight, String email, String phoneNo) {
        super("Patient");
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    // Getters and Setters
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
        System.out.println("Patient " + name + " is participating in the intervention program.");
    }

    // To String for better representation
    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}