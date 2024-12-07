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
public class LifestyleCoachingUnitEnterprise extends Enterprise {

     public LifestyleCoachingUnitEnterprise(String name){
     super(name,Business.Enterprise.Enterprise.EnterpriseType.LifeStyleCoachingUnit);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
