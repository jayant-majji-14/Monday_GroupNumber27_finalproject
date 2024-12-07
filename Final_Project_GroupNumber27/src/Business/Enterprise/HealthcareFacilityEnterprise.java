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
public class HealthcareFacilityEnterprise extends Enterprise {

        public HealthcareFacilityEnterprise(String name){
        super(name,Business.Enterprise.Enterprise.EnterpriseType.HealthcareFacility);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
