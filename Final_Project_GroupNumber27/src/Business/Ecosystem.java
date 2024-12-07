/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Network.Network;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author deves
 */
public class Ecosystem {
    
    private static Ecosystem business;
    private ArrayList<Network> networkList;  // To manage networks
    private ArrayList<UserAccount> userList;        // To manage system users

    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }

    private Ecosystem() {
        networkList = new ArrayList<>();
        userList = new ArrayList<>();
    }

    // Create and add a network (e.g., monitoring network for a specific region)
    public Network createAndAddNetwork(String networkName) {
        Network network = new Network();
        network.setName(networkName);
        networkList.add(network);
        return network;
    }

    // Retrieve the list of networks
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    // Add a user to the system (e.g., Volunteer, Doctor, Admin)
    public void addUser(UserAccount user) {
        userList.add(user);
    }

    // Check if a username is unique in the system
    public boolean checkIfUserIsUnique(String userName) {
        for (UserAccount user : userList) {
            if (user.getUsername().equalsIgnoreCase(userName)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
}
