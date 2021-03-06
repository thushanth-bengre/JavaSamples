/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageXeroxAdmin;

import Business.Market;
import Business.MasterOrderList;
import Business.Order;
import Business.Person;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bengre
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderListJPanel
     */
    private JPanel userProcessContainer;
    private MasterOrderList mol;

    ManageOrderJPanel(JPanel userProcessContainer, MasterOrderList mol) {
         initComponents();
         this.userProcessContainer = userProcessContainer;
         this.mol = mol;
         populateTable();         
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)jTableMasterOrder.getModel();
        dtm.setRowCount(0);
        int revenue = 0;
        for(Order o: mol.getListOfOrders()){
            Person p = o.getP();
            Market m = o.getM();
            Object row[] = new Object[4];
            row[0] = o;
            row[1] = p.getFirstName() + " " + p.getLastName();
            row[2] = m.getName();
            row[3] = String.valueOf(o.totalRevenue());
            dtm.addRow(row);
            revenue += o.totalRevenue();          
    }
        jTextFieldTotalrevenue.setText(String.valueOf(revenue));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMasterOrder = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTotalrevenue = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Master Order List");

        jTableMasterOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Sales Person", "Market", "Invoice Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMasterOrder);
        if (jTableMasterOrder.getColumnModel().getColumnCount() > 0) {
            jTableMasterOrder.getColumnModel().getColumn(0).setResizable(false);
            jTableMasterOrder.getColumnModel().getColumn(1).setResizable(false);
            jTableMasterOrder.getColumnModel().getColumn(2).setResizable(false);
            jTableMasterOrder.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setText("Total revenue:");

        jTextFieldTotalrevenue.setEditable(false);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(388, 388, 388))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54)
                                .addComponent(jTextFieldTotalrevenue))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(backbtn)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTotalrevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(backbtn)
                .addGap(71, 71, 71))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMasterOrder;
    private javax.swing.JTextField jTextFieldTotalrevenue;
    // End of variables declaration//GEN-END:variables
}
