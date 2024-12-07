package Business.Network;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;

/**
 * Represents a Network, which contains a name and an enterprise directory.
 */
public class Network {

    private String name; // Name of the network
    private EnterpriseDirectory enterpriseDirectory; // Directory of enterprises within the network

    // Constructor
    public Network() {
        this.enterpriseDirectory = new EnterpriseDirectory();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Network name cannot be null or empty.");
        }
        this.name = name;
    }

    // Getter for enterprise directory
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    // Adds a new enterprise to the network
    public void addEnterprise(String enterpriseId, String enterpriseName, Enterprise.EnterpriseType type) {
        if (enterpriseId == null || enterpriseId.trim().isEmpty()) {
            throw new IllegalArgumentException("Enterprise ID cannot be null or empty.");
        }
        if (enterpriseName == null || enterpriseName.trim().isEmpty()) {
            throw new IllegalArgumentException("Enterprise Name cannot be null or empty.");
        }
        enterpriseDirectory.createAndAddEnterprise(enterpriseId, enterpriseName, type);
    }

    // toString for better representation
    @Override
    public String toString() {
        return "Network{" +
                "name='" + name + '\'' +
                ", enterpriseDirectory=" + enterpriseDirectory.getEnterpriseList() +
                '}';
    }
}
