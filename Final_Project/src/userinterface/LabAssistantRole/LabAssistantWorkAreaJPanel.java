/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Visitor.Visitor;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayush
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Organization labOrganization;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = organization;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : this.labOrganization.getWorkQueue().getWorkRequestList()){
            LabTestWorkRequest labTestWorkRequest=(LabTestWorkRequest)request;
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = getSenderEnterpriseType(request.getSender());
            row[3] = labTestWorkRequest.getTestName();
            row[4] = labTestWorkRequest.getPatientName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            
            model.addRow(row);
        }
    }

    
    public Enterprise.EnterpriseType getSenderEnterpriseType (UserAccount userAccount1){
        
        for (Network network: business.getNetworkList()) {
         for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()) {
           for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
             for (UserAccount u: organization.getUserAccountDirectory().getUserAccountList()) {
        if(u.getUsername().equals(userAccount1.getUsername())){
            return enterprise.getEnterpriseType();
        }
             }}}   }      
          return null;       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Sender Enterprise", "Test ", "PatientName", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setSelectionBackground(new java.awt.Color(88, 177, 159));
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setPreferredWidth(300);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 1280, 96));

        assignJButton.setBackground(new java.awt.Color(88, 177, 159));
        assignJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1131, 210, 120, -1));

        processJButton.setBackground(new java.awt.Color(88, 177, 159));
        processJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 210, 100, -1));

        refreshJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/Actions-view-refresh-icon.png"))); // NOI18N
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 60, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            
             JOptionPane.showMessageDialog(null, "Please select a row to process");
            return;
        }
        
        
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        try{
         if (!(request.getReceiver().equals("")||request.getReceiver()==null)){
             JOptionPane.showMessageDialog(null, "This request has already been assigned and is being worked upon by someone");
            return;
        }}
        catch(Exception e){
             
        }
          try{
          if (request.getStatus().equals("Completed")){
             JOptionPane.showMessageDialog(null, "This request is already completed");
            return;
        }}
          catch(Exception e){
            
          }
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, "Please select a row to process");
            return;
        }
        
        
        LabTestWorkRequest request = (LabTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        Enterprise.EnterpriseType enterPriseType = (Enterprise.EnterpriseType)workRequestJTable.getValueAt(selectedRow, 2);
        String testName = (String)workRequestJTable.getValueAt(selectedRow, 3);
        try{
          if (request.getStatus().equals("Completed")){
             JOptionPane.showMessageDialog(null, "This request is already completed");
            return;
        }}
          catch(Exception e){
           
          }
         
        try{
          if (request.getReceiver().equals("") || request.getReceiver()==null){
             JOptionPane.showMessageDialog(null, "Please assign it before processing");
            return;
        }}
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Please assign it before processing");
            return;
        }
     
        request.setStatus("Processing");
        Visitor v1=getPatient(request);
    
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request,enterPriseType,v1,testName);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed
   
    public Visitor getPatient(LabTestWorkRequest request) {

        int selectedRow = workRequestJTable.getSelectedRow();

        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.Hospital;

        String patientName = (String) workRequestJTable.getValueAt(selectedRow, 4);
        if (request.getReceiver().equals(userAccount)) {

            for (Network network : business.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getEnterpriseType() == type) {
                      for( Organization o: enterprise.getOrganizationDirectory().getOrganizationList())
                          if((o.getName().equals("Visitor Organization"))){
                            for (Visitor v : o.getVisitorDirectory().getVisitorList()) {
                                if (v.getName().equals(patientName)) {
                                    return v;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
         
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
