package Business.Ecosystem;

import Business.Network.Network;
import java.util.ArrayList;

/**
 * Represents the Ecosystem, the topmost component of the system.
 */
public class Ecosystem {

    private static Ecosystem instance; // Singleton instance of the ecosystem
    private ArrayList<Network> networkList; // List of networks in the ecosystem

    // Private constructor to enforce singleton pattern
    private Ecosystem() {
        networkList = new ArrayList<>();
    }

    // Get the singleton instance of the Ecosystem
    public static Ecosystem getInstance() {
        if (instance == null) {
            instance = new Ecosystem();
        }
        return instance;
    }

    // Get the list of networks
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    // Add a new network to the ecosystem
    public Network createAndAddNetwork(String networkName) {
        if (networkName == null || networkName.trim().isEmpty()) {
            throw new IllegalArgumentException("Network name cannot be null or empty.");
        }

        // Check if a network with the same name already exists
        for (Network network : networkList) {
            if (network.getName().equalsIgnoreCase(networkName)) {
                throw new IllegalArgumentException("Network with the name '" + networkName + "' already exists.");
            }
        }

        Network network = new Network();
        network.setName(networkName);
        networkList.add(network);
        return network;
    }

    // Remove a network from the ecosystem
    public void removeNetwork(Network network) {
        if (network == null || !networkList.contains(network)) {
            throw new IllegalArgumentException("Network not found in the ecosystem.");
        }
        networkList.remove(network);
    }

    // ToString for better representation
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ecosystem: \n");
        for (Network network : networkList) {
            sb.append(" - ").append(network.getName()).append("\n");
        }
        return sb.toString();
    }
}
