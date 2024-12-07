/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class CentralLabortoryEnterprise {
    public class LaboratoryEnterprise  extends Enterprise{
     public LaboratoryEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Laboratory);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
