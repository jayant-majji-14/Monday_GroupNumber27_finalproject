/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ResearchScientistRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ResearchDepartmentEnterprise;
import Business.Organization.Organization;
import Business.Organization.ResearchScientistOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author devesh
 */
public class ResearchScientistWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ResearchScientistOrganization researchScientistOrganization;
    private Enterprise enterprise;
    private String minAge;
    private String maxAge;
    private String numOfVolunteers;
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param business
     */
    public ResearchScientistWorkAreaJPanel(JPanel userProcessContainer,Enterprise enterprise, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.researchScientistOrganization = (ResearchScientistOrganization)organization;
        this.enterprise=enterprise;
        
    }
    
    void populate(String minAge,String maxAge,String numOfVolunteers){
    this.minAge=minAge;
    this.maxAge=maxAge;
    this.numOfVolunteers=numOfVolunteers;
    }
    
       /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(88, 177, 159));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Manage Vaccine Attributes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(88, 177, 159));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Manage Volunteers");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 200, -1));

        jButton3.setBackground(new java.awt.Color(88, 177, 159));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("View Results");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 200, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/managevaccine.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 540, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManageVaccineJPanel manageVaccineJPanel = new ManageVaccineJPanel(userProcessContainer, enterprise,userAccount,researchScientistOrganization,  business);
        userProcessContainer.add("ManageVaccineJPanel", manageVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ResearchDepartmentEnterprise  researchDepartmentEnterprise=(ResearchDepartmentEnterprise)enterprise;
        try{
     if(researchDepartmentEnterprise.getVaccineName().equals("")||researchDepartmentEnterprise.getVaccineName()==null){
         
        JOptionPane.showMessageDialog(null, "Vaccine is not defined yet. Please define vaccine and doses");
        return;
     }}
        catch(Exception e){ JOptionPane.showMessageDialog(null, "Vaccine is not defined yet. Please define vaccine and doses");
        return;}
        ManageVolunteersJPanel manageVolunteersJPanel = new ManageVolunteersJPanel(userProcessContainer, enterprise,userAccount,researchScientistOrganization,  business,minAge,maxAge,numOfVolunteers);
        userProcessContainer.add("manageVolunteersJPanel", manageVolunteersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        ResearchDepartmentEnterprise  researchDepartmentEnterprise=(ResearchDepartmentEnterprise)enterprise;
        try{
        if(researchDepartmentEnterprise.getVaccineName().equals("")||researchDepartmentEnterprise.getVaccineName()==null){
         
        JOptionPane.showMessageDialog(null, "Vaccine is not defined yet. Please define vaccine and doses");
        return;
     }}
        catch(Exception e){ JOptionPane.showMessageDialog(null, "Vaccine is not defined yet. Please define vaccine and doses");
        return;}
        ViewResultsJPanel ViewResultsJPanel = new ViewResultsJPanel(userProcessContainer,userAccount,enterprise, business);
        userProcessContainer.add("ViewResultsJPanel", ViewResultsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
