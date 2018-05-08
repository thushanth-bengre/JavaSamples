/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.MainJFrame;

import Business.Busines;
import Business.CSVReader;
import Business.MarketOfferCatalog;
import Business.SupplierDir;
import Business.User;
import Interface.ManageMarketOffer.MarketOfferAdminJPanel;
import Interface.ManageXeroxAdmin.ManageJPanel;
import Interface.SalesPerson.SalesPersonLogin;
import Interface.SupplierWork.SupplierLogin;
import java.awt.CardLayout;

/**
 *
 * @author siri chowdhary
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Busines b;
    private CSVReader csv;
    private SupplierDir sd;
    private MarketOfferCatalog moc;
    public MainJFrame() {
        initComponents();
        b = new Busines();        
        loadData();
        sd=b.getSd();
        moc = b.getMoc();
    }
    
    private void loadData(){
        CSVReader csv = new CSVReader(b);
        csv.readSupplier();
        csv.readProducts();
        csv.readSalesPerson();
        csv.readUser();
        csv.readMarket();
        csv.readMarketOffer();
        csv.readCustomers();
        csv.readOrders();
        csv.readOrderItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        xeroxadminbtn = new javax.swing.JButton();
        jButtonSupplierAdmin = new javax.swing.JButton();
        jButtonMrtOfferAdmin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        xeroxadminbtn.setText("Xerox Admin");
        xeroxadminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xeroxadminbtnActionPerformed(evt);
            }
        });

        jButtonSupplierAdmin.setText("Supplier Admin");
        jButtonSupplierAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupplierAdminActionPerformed(evt);
            }
        });

        jButtonMrtOfferAdmin.setText("Market Offer Admin");
        jButtonMrtOfferAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMrtOfferAdminActionPerformed(evt);
            }
        });

        jButton1.setText("Sales Person Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSupplierAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xeroxadminbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMrtOfferAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(xeroxadminbtn)
                .addGap(18, 18, 18)
                .addComponent(jButtonSupplierAdmin)
                .addGap(18, 18, 18)
                .addComponent(jButtonMrtOfferAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(545, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xeroxadminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xeroxadminbtnActionPerformed
        // TODO add your handling code here:
        ManageJPanel panel = new ManageJPanel(userProcessContainer,b);
        userProcessContainer.add("ManageJPanel",panel);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_xeroxadminbtnActionPerformed

    private void jButtonSupplierAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupplierAdminActionPerformed
        // TODO add your handling code here:
        SupplierLogin panel = new SupplierLogin(userProcessContainer,sd,b);
        userProcessContainer.add("SupplierLogin", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButtonSupplierAdminActionPerformed

    private void jButtonMrtOfferAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMrtOfferAdminActionPerformed
        // TODO add your handling code here:
        MarketOfferAdminJPanel panel = new MarketOfferAdminJPanel(userProcessContainer,moc);
        userProcessContainer.add("MarketOfferAdminJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButtonMrtOfferAdminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:        
        SalesPersonLogin panel = new SalesPersonLogin(userProcessContainer,b);
        userProcessContainer.add("MarketOfferAdminJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonMrtOfferAdmin;
    private javax.swing.JButton jButtonSupplierAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JButton xeroxadminbtn;
    // End of variables declaration//GEN-END:variables
}
