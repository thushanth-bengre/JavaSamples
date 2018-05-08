/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SupplierWork;

import Business.Busines;
import Business.Market;
import Business.Supplier;
import Business.SupplierDir;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Minal
 */
public class SupplierLogin extends javax.swing.JPanel {

    /**
     * Creates new form SupplierLogin
     */
  
    private JPanel userProcessContainer; 
    private SupplierDir sd;
    private Busines b;
    public SupplierLogin(JPanel userProcessContainer, SupplierDir sd, Busines b){
    initComponents();
    this.userProcessContainer=userProcessContainer;
    this.sd = sd;
    this.b =b;
    populateComboBox();
    }
    
    private void populateComboBox(){
        for(Supplier s:sd.getListOfSuppliers()){
           supplierComboBox.addItem(s.getName());
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        supplierComboBox = new javax.swing.JComboBox();
        btnFind = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Supplier Login");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Supplier Name");

        supplierComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboBoxActionPerformed(evt);
            }
        });

        btnFind.setText("GO>>");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1)
                        .addGap(84, 84, 84)
                        .addComponent(supplierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(btnFind)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel2)
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(470, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void supplierComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboBoxActionPerformed

    }//GEN-LAST:event_supplierComboBoxActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String name = String.valueOf(supplierComboBox.getSelectedItem());
        Supplier s = null;
        for(Supplier sup:sd.getListOfSuppliers()){
            if(sup.getName().equals(name))
                s=sup;
                }                
        SupplierWorkArea panel = new SupplierWorkArea(userProcessContainer, s, b);
        userProcessContainer.add("SupplierWorkArea", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
     
    }//GEN-LAST:event_btnFindActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox supplierComboBox;
    // End of variables declaration//GEN-END:variables

}