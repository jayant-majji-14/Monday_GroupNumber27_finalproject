package Business.DB4OUtil;

import java.nio.file.Paths;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayush
 */
public class DB4OUtil {
     private static final String FILENAME = Paths.get("C:\\Users\\ayush\\OneDrive\\Desktop\\FinalProject\\Monday_GroupNumber27_finalproject\\Final_Project_GroupNumber27\\Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    
}
    
}
