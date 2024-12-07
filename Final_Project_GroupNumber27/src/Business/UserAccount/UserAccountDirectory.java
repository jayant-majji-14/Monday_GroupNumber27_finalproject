/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deves
 */
public class UserAccountDirectory {
    
     private ArrayList<UserAccount> userAccountList;

    // Constructor to initialize the user account list
    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    // Getter for the user account list
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    /**
     * Method to authenticate user based on username and password
     * @param username The user's username
     * @param password The user's password
     * @return The authenticated UserAccount, or null if authentication fails
     */
    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;  // User authenticated successfully
            }
        }
        return null;  // Authentication failed
    }

    /**
     * Method to create a new UserAccount
     * @param username The username for the new account
     * @param password The password for the new account
     * @param employee The employee associated with the user account
     * @param role The role associated with the user account
     * @return The created UserAccount, or null if the username is not unique
     */
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        if (checkIfUsernameIsUnique(username)) {
            UserAccount account = new UserAccount();
            account.setUsername(username);
            account.setPassword(password);
            account.setEmployee(employee);
            account.setRole(role);
            userAccountList.add(account);  // Add the new user account to the list
            return account;
        } else {
            return null;  // Username is not unique
        }
    }

    /**
     * Method to check if the provided username is unique
     * @param username The username to check
     * @return true if the username is unique, false otherwise
     */
    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;  // Username is not unique
            }
        }
        return true;  // Username is unique
    }
    
}
