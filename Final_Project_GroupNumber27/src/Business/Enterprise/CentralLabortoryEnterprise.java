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
public class CentralLabortoryEnterprise extends Enterprise {
    
        public CentralLabortoryEnterprise(String name){
        super(name,Business.Enterprise.Enterprise.EnterpriseType.CentralLaboratory);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
