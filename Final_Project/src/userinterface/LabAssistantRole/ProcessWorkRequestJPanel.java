/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.Enterprise.Enterprise;
import Business.Visitor.Phase;
import Business.Visitor.Visitor;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author ayush
 */


public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    LabTestWorkRequest request;
    Enterprise.EnterpriseType enterPriseType;
    Visitor visitor;
    String testName;
    Enterprise.EnterpriseType hospitalType = Enterprise.EnterpriseType.Hospital;
    
    Enterprise.EnterpriseType researchType = Enterprise.EnterpriseType.ResearchDepartment;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, LabTestWorkRequest request,Enterprise.EnterpriseType enterPriseType,Visitor visitor,String testName) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.enterPriseType=enterPriseType;
        this.visitor=visitor;
        this.testName=testName;
        
        if(this.enterPriseType==hospitalType){
            antibodiesCount.setEnabled(false);
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

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        UploadReportLabel = new javax.swing.JButton();
        ImagePathTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        antibodiesCount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        submitJButton.setBackground(new java.awt.Color(88, 177, 159));
        submitJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Result");

        backJButton.setBackground(new java.awt.Color(88, 177, 159));
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/back.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        UploadReportLabel.setBackground(new java.awt.Color(88, 177, 159));
        UploadReportLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UploadReportLabel.setText("Upload Report");
        UploadReportLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadReportLabelActionPerformed(evt);
            }
        });

        ImagePathTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagePathTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Glucose Level");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/upload-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(antibodiesCount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UploadReportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitJButton)
                            .addComponent(ImagePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1180, 1180, 1180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(antibodiesCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UploadReportLabel)
                    .addComponent(ImagePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(submitJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(resultJTextField.getText().equals("")||ImagePathTextField.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            return;
        }
        
        
        
          if(this.enterPriseType==hospitalType){
        
        request.setTestResult(resultJTextField.getText());
        request.setStatus("Completed");
        request.setFileupload(ImagePathTextField.getText());
          }
          
          if(this.enterPriseType==researchType){
           if(antibodiesCount.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter glucose count");
            return;
           }
        
          int antibodiesCount1;
              try
           {
        
        antibodiesCount1 = Integer.parseInt(antibodiesCount.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid glucose count"); 
            antibodiesCount.setText("");
               return;
           } 
        request.setTestResult(resultJTextField.getText());
        request.setStatus("Completed");
        request.setFileupload(ImagePathTextField.getText());
       if(this.testName.equals("Glucose Test1")){
       Phase phase1= visitor.searchPhase("Phase1");
       phase1.setAntibodiesCount(antibodiesCount1);
       }
       
       if(this.testName.equals("Glucose Test2")){
       Phase phase2= visitor.searchPhase("Phase2");
       phase2.setAntibodiesCount(antibodiesCount1);
       }
       
       if(this.testName.equals("Glucose Test3")){
       Phase phase3= visitor.searchPhase("Phase3");
       phase3.setAntibodiesCount(antibodiesCount1);
       }
       
       if(this.testName.equals("Glucose Test4")){
       Phase phase4= visitor.searchPhase("Phase4");
       phase4.setAntibodiesCount(antibodiesCount1);
       }
          }
            JOptionPane.showMessageDialog(null, "Report submitted successfully");
                 userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
            return;
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void UploadReportLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadReportLabelActionPerformed
        // TODO add your handling code here:

      JFileChooser jfl=new JFileChooser();
        jfl.setCurrentDirectory(new File(System.getProperty("user.home")));
        jfl.addChoosableFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "tif"));
        jfl.setAcceptAllFileFilterUsed(false);
        int result=jfl.showSaveDialog(null);


        if(result==JFileChooser.APPROVE_OPTION)
        {
            File selectedFile=jfl.getSelectedFile();
            String path=selectedFile.getAbsolutePath();
            ImagePathTextField.setText(path);

        }
        else if(result==JFileChooser.CANCEL_OPTION)
        {
            ImagePathTextField.setText("No file selected");

        }
    }//GEN-LAST:event_UploadReportLabelActionPerformed

    private void ImagePathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagePathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImagePathTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ImagePathTextField;
    private javax.swing.JButton UploadReportLabel;
    private javax.swing.JTextField antibodiesCount;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
