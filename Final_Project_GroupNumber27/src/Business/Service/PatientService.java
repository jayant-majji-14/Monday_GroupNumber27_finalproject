/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Service;

import DBConnections.DBConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author deves
 */
public class PatientService {
    
        // Register a new patient
    public boolean registerPatient(String name, int age, char gender, String username, String password, String email, String phoneNumber) throws Exception {
        if (isDuplicate(username, email, phoneNumber)) {
            throw new IllegalArgumentException("Username, email, or phone number already exists.");
        }

        String query = "INSERT INTO Patients (Name, Age, Gender, Username, PasswordHash, Email, PhoneNumber) VALUES (?, ?, ?, ?, HASHBYTES('SHA2_256', ?), ?, ?)";
        try (Connection conn = DBConnections.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, String.valueOf(gender));
            stmt.setString(4, username);
            stmt.setString(5, password); // Password will be hashed
            stmt.setString(6, email);
            stmt.setString(7, phoneNumber);

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        }
    }

    // Check for duplicate entries
    private boolean isDuplicate(String username, String email, String phoneNumber) throws Exception {
        String query = "SELECT * FROM Patients WHERE Username = ? OR Email = ? OR PhoneNumber = ?";
        try (Connection conn = DBConnections.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, email);
            stmt.setString(3, phoneNumber);

            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Returns true if any record matches
        }
    }

}