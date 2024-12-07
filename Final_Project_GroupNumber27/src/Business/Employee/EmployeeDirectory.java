/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author deves
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    // Constructor to initialize the employee list
    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    // Getter for employee list
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    /**
     * Method to create a new employee and add it to the employee list.
     * @param name The name of the employee
     * @return The newly created Employee object
     */
    public Employee createEmployee(String name) {
        Employee employee = new Employee();
        employee.setName(name);  // Set the name of the new employee
        employeeList.add(employee);  // Add the employee to the list
        return employee;
    }

    /**
     * Method to search for an employee by name.
     * @param employeeName The name of the employee to search for
     * @return true if the employee is found, false otherwise
     */
    public boolean searchEmployee(String employeeName) {
        for (Employee employee : this.getEmployeeList()) {
            if (employee.getName().equals(employeeName)) {
                return true;  // Employee found
            }
        }
        return false;  // Employee not found
    }
    
}
