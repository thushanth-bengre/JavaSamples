/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SalesPerson;

import Business.Busines;
import Business.Person;
import Business.PersonDir;
import Business.User;
import Business.UserDir;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Minal
 */
public class SalesPersonLogin extends javax.swing.JPanel {

    /**
     * Creates new form SalesPersonLogin
     */
  
    private JPanel userProcessContainer;
    private Busines b;
    private UserDir ud;    
    public SalesPersonLogin(JPanel userProcessContainer, Busines b) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.b=b;
        ud= b.getUd();
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
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Sales Agent Login");

        jLabel2.setText("User Name: ");

        jLabel3.setText("Password:");

        btnLogin.setText("Login>>");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(407, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(403, 403, 403))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addComponent(btnLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1)
                .addGap(204, 204, 204)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addComponent(btnLogin)
                .addContainerGap(343, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        Person p = null;
        String name = txtUserName.getText();
        char[] pass = jPasswordField1.getPassword();
        String password = new String(pass);
        User u = ud.getUserDetails(name);
        if(u == null)
            JOptionPane.showMessageDialog(null,"User not found");
        else if(u.getPassword().equals(password)){
        p = u.getP();
        SalesAgentWorkArea panel = new SalesAgentWorkArea(userProcessContainer,b,p);
        userProcessContainer.add("SalesAgentWorkArea", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else
            JOptionPane.showMessageDialog(null,"Wrong password");
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
