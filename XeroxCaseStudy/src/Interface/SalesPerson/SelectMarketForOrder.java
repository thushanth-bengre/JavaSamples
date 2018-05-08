/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SalesPerson;

import Business.Busines;
import Business.Customer;
import Business.CustomerDir;
import Business.Market;
import Business.MarketList;
import Business.MarketOfferCatalog;
import Business.MasterOrderList;
import Business.Person;
import Business.Supplier;
import Interface.ManageXeroxAdmin.UpdateMarketJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Minal
 */
public class SelectMarketForOrder extends javax.swing.JPanel {

    /**
     * Creates new form SelectMarketForOrder
     */
    
    private JPanel userProcessContainer;
    private Busines b;
    private MarketList ml;
    private CustomerDir cd;
    private Market m;
    private Customer c;
    private MarketOfferCatalog moc;
    private Person p;
    private MasterOrderList mol;
    SelectMarketForOrder(JPanel userProcessContainer, Busines b, Person p) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.b =b;
        mol = b.getMol();
        ml = b.getMl();
        cd = b.getCd();
        moc = b.getMoc();
        m = null;
        c = null;
        this.p = p;
        populateComboBox();
    }
    
    private void populateComboBox(){
        for(Market m:ml.getListOfMarket()){
           marketCombo.addItem(m.getName());
        }
    }
    
    private void populatetable(ArrayList<Customer> listOfCustomers){
        DefaultTableModel dtm = (DefaultTableModel)jTableCustList.getModel();
        dtm.setRowCount(0);
        for(Customer cust:listOfCustomers){
            Object row[] = new Object[4];
            row[0] = cust;
            row[1] = cust.getContactNum();
            row[2] = cust.getAddress();
            row[3] = cust.getEmail();
            dtm.addRow(row);
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

        marketCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButtonShowCust = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCustList = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButtonSelectCust = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel2.setText("Markets");

        jButtonShowCust.setText("Select Customer");
        jButtonShowCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowCustActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Select Market and Customer");

        jTableCustList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact", "Address", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCustList);
        if (jTableCustList.getColumnModel().getColumnCount() > 0) {
            jTableCustList.getColumnModel().getColumn(0).setResizable(false);
            jTableCustList.getColumnModel().getColumn(1).setResizable(false);
            jTableCustList.getColumnModel().getColumn(2).setResizable(false);
            jTableCustList.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Customer List");

        jButtonSelectCust.setText("Select Customer");
        jButtonSelectCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectCustActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonShowCust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(marketCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(280, 280, 280))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSelectCust))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(165, 165, 165))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(marketCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButtonShowCust)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSelectCust)
                    .addComponent(btnBack))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShowCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowCustActionPerformed
        // TODO add your handling code here:
        String marName = String.valueOf(marketCombo.getSelectedItem());        
        for(Market mar:ml.getListOfMarket()){
            if(mar.getName().equals(marName))
                m=mar;
        }
        ArrayList<Customer> listOfCust = new ArrayList();
        for(Customer cust: cd.getListOfCustomers()){
            if(cust.getM().equals(m))
                listOfCust.add(cust);
        }
        populatetable(listOfCust);        
    }//GEN-LAST:event_jButtonShowCustActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButtonSelectCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectCustActionPerformed
        // TODO add your handling code here:
        int selectedRowValue = jTableCustList.getSelectedRow();
        if(selectedRowValue >= 0){
        c= (Customer)jTableCustList.getValueAt(selectedRowValue, 0);
        PlacingOrder panel = new PlacingOrder(userProcessContainer,m,p,c,moc,mol);
        userProcessContainer.add("PlacingOrder",panel);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
         else
            JOptionPane.showMessageDialog(null,"Please select a Customer!!");        
    }//GEN-LAST:event_jButtonSelectCustActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButtonSelectCust;
    private javax.swing.JButton jButtonShowCust;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCustList;
    private javax.swing.JComboBox<String> marketCombo;
    // End of variables declaration//GEN-END:variables
}