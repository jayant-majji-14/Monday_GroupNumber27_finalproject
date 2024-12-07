/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

/**
 *
 * @author deves
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1; // Static counter to generate unique employee IDs

    // Constructor that assigns a unique ID to each employee
    public Employee() {
        id = count;  // Assign the current count as the employee ID
        count++;  // Increment the counter for the next employee
    }

    // Getter for employee ID
    public int getId() {
        return id;
    }

    // Setter for employee name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for employee name
    public String getName() {
        return name;
    }

    // Overriding the toString method to return the employee's name
    @Override
    public String toString() {
        return name;
    }
    
}
