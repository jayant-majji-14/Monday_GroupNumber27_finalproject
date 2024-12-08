/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class LifestyleCoachingEnterprise extends Enterprise {
    public LifestyleCoachingEnterprise(String name){
        super(name,EnterpriseType.LifestyleCoaching);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
