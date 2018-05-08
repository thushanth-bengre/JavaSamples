/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SalesPerformance;

import Business.Busines;
import Business.Market;
import Business.MarketList;
import Business.Person;
import Interface.ManageXeroxAdmin.CreateMarketJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author siri chowdhary
 */
public class SelectMarketJPanel extends javax.swing.JPanel {
    

    /**
     * Creates new form SelectMarketJPanel
     */
    private JPanel userProcessContainer;
    private Busines b;
    private MarketList ml;
    public SelectMarketJPanel(JPanel userProcessContainer, Busines b) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.b = b;
        ml = b.getMl();
        populateComboBox();
    }
    
    private void populateComboBox(){
        for(Market m:ml.getListOfMarket()){
           selectmarketComboBox.addItem(m.getName());
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

        jLabel1 = new javax.swing.JLabel();
        selectmarketComboBox = new javax.swing.JComboBox<>();
        gobtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        jLabel1.setText("SELECT MARKET");

        selectmarketComboBox.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N

        gobtn.setText("GO");
        gobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobtnActionPerformed(evt);
            }
        });

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel1)
                        .addGap(91, 91, 91)
                        .addComponent(selectmarketComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addComponent(gobtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(backbtn)))
                .addContainerGap(411, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(selectmarketComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(gobtn)
                .addGap(229, 229, 229)
                .addComponent(backbtn)
                .addContainerGap(275, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void gobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobtnActionPerformed
        // TODO add your handling code here:
        String name = String.valueOf(selectmarketComboBox.getSelectedItem());
        Market m = null;
        for(Market mar:ml.getListOfMarket()){
            if(mar.getName().equals(name))
                m=mar;
        }
        PersonListbyRevenueJPanel panel = new PersonListbyRevenueJPanel(userProcessContainer,b,m);
        userProcessContainer.add("PersonListbyRevenueJPanel",panel);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_gobtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton gobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> selectmarketComboBox;
    // End of variables declaration//GEN-END:variables
}
