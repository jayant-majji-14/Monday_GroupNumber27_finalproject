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
public class EnterpriseDirectory {
            private ArrayList<Business.Enterprise.Enterprise> enterpriseList;
          
   
            
        public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }

    public ArrayList<Business.Enterprise.Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Business.Enterprise.Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    
    //Create enterprise
    public Business.Enterprise.Enterprise createAndAddEnterprise(String name,Business.Enterprise.Enterprise.EnterpriseType type){
        Business.Enterprise.Enterprise enterprise=null;
        if(type==Business.Enterprise.Enterprise.EnterpriseType.HealthcareFacility){
            enterprise=new HealthcareFacilityEnterprise(name);
            enterpriseList.add(enterprise);
        }
    
      if(type==Business.Enterprise.Enterprise.EnterpriseType.CentralLaboratory){
            enterprise=new CentralLaboratoryEnterprise(name);
            enterpriseList.add(enterprise);
        }
    
      if(type==Business.Enterprise.Enterprise.EnterpriseType.ResearchDepartment){
            enterprise=new ResearchDepartmentEnterprise(name);
            enterpriseList.add(enterprise);
        }
      if(type==Business.Enterprise.Enterprise.EnterpriseType.LifeStyleCoachingUnit){
            enterprise=new LifeStyleCoachingUnitEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
