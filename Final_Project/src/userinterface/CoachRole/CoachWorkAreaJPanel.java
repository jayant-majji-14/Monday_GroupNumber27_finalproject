/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CoachRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Visitor.Phase;
import Business.Visitor.Visitor;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DoctorRole.ManagePatientsJPanel;

/**
 *
 * @author jayantmajji
 */
public class CoachWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel container;
    private EcoSystem business;
    private UserAccount account;
    private Organization coachOrganization;
    private Enterprise enterprise;

    /**
     * Creates new form CoachWorkAreaJPanel
     */
    public CoachWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.enterprise=enterprise;
        this.container = userProcessContainer;
        this.account = account;
        this.business = business;
        this.coachOrganization = organization;
        populateTable1();
    }
    
    public void populateTable1(){
      DefaultTableModel model = (DefaultTableModel) FailureTable.getModel();
      Enterprise e1=this.enterprise;
      model.setRowCount(0); 
      Object[] row = new Object[7];
       Enterprise.EnterpriseType type = Enterprise.EnterpriseType.Hospital;
       for (Network network: business.getNetworkList()) {
         for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()) {
          if (enterprise.getEnterpriseType() == type) {
           enterprise.getOrganizationDirectory().getOrganizationList().stream().filter((organization) 
                   -> (organization.getName().equals("Visitor Organization"))).forEachOrdered((organization) -> {
               
             for (Visitor v: organization.getVisitorDirectory().getVisitorList()) {
                try{
                 if(v.getSelectedBy().equals(e1.getName()))
                 {
                 
                 Phase phase1 = v.searchPhase("Phase1");
                 Phase phase2 = v.searchPhase("Phase2");
                 Phase phase3 = v.searchPhase("Phase3");
                 Phase phase4 = v.searchPhase("Phase4");
                  try
          {
                 if (v.getResearchStatus().equals("failed")) {

               row[0] = v;
               row[1]= v.getAge();
               row[2]= phase1.getPhaseStatus();
               row[3]= phase2.getPhaseStatus();
               row[4]= phase3.getPhaseStatus();
               row[5]= phase4.getPhaseStatus();
               row[6] = "failed";  
             
               
               model.addRow(row);
              }
                //model.addRow(row);
             }
             catch(Exception e){
                     
                     }}}
             catch(Exception e ){
                 
             }}
           });
          }}
          }
         }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        FailureTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();

        FailureTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Volunteer Name", "Age", "Phase1", "Phase2", "Phase3", "Phase4", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FailureTable.setSelectionBackground(new java.awt.Color(88, 177, 159));
        jScrollPane2.setViewportView(FailureTable);

        assignJButton.setBackground(new java.awt.Color(88, 177, 159));
        assignJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setBackground(new java.awt.Color(88, 177, 159));
        processJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(assignJButton)
                .addGap(1, 1, 1)
                .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignJButton)
                    .addComponent(processJButton))
                .addContainerGap(356, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = FailureTable.getSelectedRow();

        if (selectedRow < 0){

            JOptionPane.showMessageDialog(null, "Please select a row to assign");
            return;
        }

        Visitor patient = (Visitor)FailureTable.getValueAt(selectedRow, 0);
        try{
            if (!(patient.getAssignedDoctor().equals("")||patient.getAssignedDoctor()==null)){
                JOptionPane.showMessageDialog(null, "This request has already been assigned and is being worked upon by someone");
                return;
            }}
            catch(Exception e){

            }

            try{
                if (patient.getStatus().equals("Completed")){
                    JOptionPane.showMessageDialog(null, "Examination for this patient is already completed");
                    return;
                }}
                catch(Exception e){

                }
                patient.setAssignedDoctor(account);
                patient.setStatus("Pending");
                populateTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = FailureTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row to process");
            return;
        }

        Visitor patient = (Visitor)FailureTable.getValueAt(selectedRow, 0);
        try{
            if (patient.getResearchStatus().equals("Succeded")){
                JOptionPane.showMessageDialog(null, "Patient is all fit, no need for any coaching");
                return;
            }}
            catch(Exception e){

            }
            try{
                if (patient.getAssignedDoctor().equals("") || patient.getAssignedDoctor()==null){
                    JOptionPane.showMessageDialog(null, "Please assign it before processing");
                    return;
                }}
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Please assign it before processing");
                    return;
                }

                if(!patient.getAssignedDoctor().getUsername().equals(account.getUsername())){
                    JOptionPane.showMessageDialog(null, "You are not the assigned user for this patient.");
                    return;
                }
                patient.setStatus("Processing");
                ManagePatientsJPanel managePatientsJPanel = new ManagePatientsJPanel(container,enterprise,account,patient, business);
                container.add("managePatientsJPanel", managePatientsJPanel);
                CardLayout layout = (CardLayout) container.getLayout();
                layout.next(container);

    }//GEN-LAST:event_processJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FailureTable;
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    // End of variables declaration//GEN-END:variables
}
