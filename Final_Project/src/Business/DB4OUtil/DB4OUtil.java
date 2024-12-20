package Business.DB4OUtil;

import Business.ConfigureASystem;
import Business.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author jayantmajji
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("/Users/jayantmajji/Documents/GitHub/Monday_GroupNumber27_finalproject/Final_Project/Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().add(new TransparentPersistenceSupport());
        config.common().activationDepth(Integer.MAX_VALUE);
        config.common().updateDepth(Integer.MAX_VALUE);
        config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true);

        ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
        if (db == null) {
            System.out.println("Failed to create connection to the database.");
        }
        return db;
    } catch (Exception ex) {
        System.out.println("Error while creating connection: " + ex.getMessage());
        ex.printStackTrace(); // Print stack trace for more details
    }
    return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public EcoSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class); // Change to the object you want to save
        EcoSystem system;
        if (systems.size() == 0){
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}