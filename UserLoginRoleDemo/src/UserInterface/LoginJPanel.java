/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Person;
import Business.PersonDir;
import Business.User;
import Business.UserDir;
import Business.Utility;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Bengre
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    
    private JPanel cardSeqJPanel;
    private PersonDir pd;
    private UserDir ud;    
    LoginJPanel(JPanel cardSeqJPanel, PersonDir pd, UserDir ud) {
        initComponents();
        this.cardSeqJPanel=cardSeqJPanel;
        this.pd=pd;
        this.ud=ud;
        String input = JOptionPane.showInputDialog("Input here");
        System.out.println(input);
    }
    
    private void systemAdmin(String n){
        SystemAdminWrkAreaJPanel panel = new SystemAdminWrkAreaJPanel(cardSeqJPanel,pd,ud,n);
        cardSeqJPanel.add("SystemAdminWrkAreaJPanel",panel);
        CardLayout layout = (CardLayout) cardSeqJPanel.getLayout();
        layout.next(cardSeqJPanel);
    }
    
    private void hrAdmin(String n){
        HRAdminWrkAreaJPanel panel = new HRAdminWrkAreaJPanel(cardSeqJPanel,pd,ud,n);
        cardSeqJPanel.add("HRAdminWrkAreaJPanel",panel);
        CardLayout layout = (CardLayout) cardSeqJPanel.getLayout();
        layout.next(cardSeqJPanel);
    }
    
    private void appAdmin(String n){
        AppAdminWrkAreaJPanel panel = new AppAdminWrkAreaJPanel(cardSeqJPanel,pd,ud,n);
        cardSeqJPanel.add("AppAdminWrkAreaJPanel",panel);
        CardLayout layout = (CardLayout) cardSeqJPanel.getLayout();
        layout.next(cardSeqJPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setText("User Name:");

        jLabel3.setText("Password:");

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldUserName)
                                .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButtonLogin)
                .addContainerGap(368, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        boolean isAuthenticated= false;
        String name = jTextFieldUserName.getText();
        char[] p = jPasswordField.getPassword();
        String password = new String(p);
        User u = ud.getUserDetails(name);
        if(u == null)
            JOptionPane.showMessageDialog(null,"User not found");
        else{
            String stored = u.getPassword();
            try {
                isAuthenticated = Utility.check(password, stored);
            } catch (Exception ex) {
                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }            
        if(!isAuthenticated)
            JOptionPane.showMessageDialog(null,"Wrong password");
        else {
            JOptionPane.showMessageDialog(null,"User Authenticated");
            String role = u.getRole();
            String n = pd.findPerson(u);
            if(role.equals("Application Admin"))
               appAdmin(n);
            else if(role.equals("System Admin"))
               systemAdmin(n);
            else if(role.equals("HR Admin"))
               hrAdmin(n);
            }
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}