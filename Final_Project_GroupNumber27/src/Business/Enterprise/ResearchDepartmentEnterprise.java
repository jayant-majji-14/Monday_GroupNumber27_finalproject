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
public class ResearchDepartmentEnterprise extends Enterprise{
    
    public ResearchDepartmentEnterprise(String name){
        super(name,Business.Enterprise.Enterprise.EnterpriseType.ResearchDepartment);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
