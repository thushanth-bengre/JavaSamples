
package Interface.SalesPerson;

import Business.Customer;
import Business.Helper;
import Business.Market;
import Business.MarketOffer;
import Business.MarketOfferCatalog;
import Business.MasterOrderList;
import Business.Order;
import Business.OrderItem;
import Business.Person;
import Business.Product;
import Business.Supplier;
import Business.SupplierDir;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Minal
 */
public class PlacingOrder extends javax.swing.JPanel {

    /**
     * Creates new form PlacingOrder
     */
  
private JPanel userProcessContainer;
private Market m;
private Person per;
private Customer c;
private MarketOfferCatalog moc;
private MasterOrderList mol;
private Order o;
private List<MarketOffer> listOfMOC;
private List<OrderItem> cartList;

    PlacingOrder(JPanel userProcessContainer, Market m, Person p, Customer c, MarketOfferCatalog moc, MasterOrderList mol) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.m = m;
        this.per=p;
        this.c=c;
        this.moc=moc;
        this.mol = mol;
        o = null;
        cartList = new ArrayList();
        jTextFieldCustomer.setText("Customer Name: " + c.getName());
        jTextFieldMarket.setText("Market: " + m.getName());
        listOfMOC = getList();
        populateTable(listOfMOC);
    }
    
    private void refreshTable(){
        listOfMOC = getList();
        populateTable(listOfMOC);
    }
        public void populateTable(List<MarketOffer> tempList)
        {
        DefaultTableModel dtm = (DefaultTableModel)marketOfferTable.getModel();
        dtm.setRowCount(0);
        for(MarketOffer mo: tempList){
            Object row[] = new Object[5];
            row[0] = mo;
            row[1] = mo.getP().getAvailability();
            row[2] = mo.getFloor();
            row[3] = mo.getTarget();
            row[4] = mo.getCeiling();
            dtm.addRow(row);
        }        
    }
  
  private void populateCart(List<OrderItem> tempList){
      DefaultTableModel dtm = (DefaultTableModel)orderTable.getModel();
        dtm.setRowCount(0);
        for(OrderItem oi: tempList){
            Object row[] = new Object[7];
            row[0] = oi.getP().getName();
            row[1] = oi.getSalesPrice();
            int qty = oi.getQuantity();
            row[2] = qty;
            row[3] = oi.getSalesPrice() * qty;
            row[4] = (oi.getTargetPrice()* 0.1) * qty;
            row[5] = (oi.getCommission() - (oi.getTargetPrice()* 0.1)) * qty;
            row[6] = oi.getCommission() * qty;
            dtm.addRow(row);          
        }
  }
  
  private List getList(){
      List<MarketOffer> tempList = new ArrayList();
      for(MarketOffer mo: moc.getListOfMarketOffer()){
          if(mo.getM().equals(m))
              tempList.add(mo);
      }
      return tempList;
  }
  
  private void refresh(){
      int rowCount =orderTable.getRowCount(); 
      int i;
      for (i = rowCount-1; i >= 0; i--) 
          ((DefaultTableModel)orderTable.getModel()).removeRow(i);
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
        marketOfferTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        qtySpinner = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCustomer = new javax.swing.JTextField();
        jTextFieldMarket = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextFieldComission = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldInvTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTotCommission = new javax.swing.JTextField();

        marketOfferTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marketOfferTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Availability", "Floor Price", "Target Price", "Ceiling Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(marketOfferTable);
        if (marketOfferTable.getColumnModel().getColumnCount() > 0) {
            marketOfferTable.getColumnModel().getColumn(0).setResizable(false);
            marketOfferTable.getColumnModel().getColumn(1).setResizable(false);
            marketOfferTable.getColumnModel().getColumn(2).setResizable(false);
            marketOfferTable.getColumnModel().getColumn(3).setResizable(false);
            marketOfferTable.getColumnModel().getColumn(4).setResizable(false);
        }

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Price", "Quantity", "Total Amount", "Commission", "Bonus", "Total Comission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(0).setResizable(false);
            orderTable.getColumnModel().getColumn(1).setResizable(false);
            orderTable.getColumnModel().getColumn(2).setResizable(false);
            orderTable.getColumnModel().getColumn(3).setResizable(false);
            orderTable.getColumnModel().getColumn(4).setResizable(false);
            orderTable.getColumnModel().getColumn(5).setResizable(false);
            orderTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel4.setText("Sales Price");

        jLabel5.setText("Quantity");

        jButton1.setText("Add To Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Checkout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("<<Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Select Product and CheckOut");

        jTextFieldCustomer.setEditable(false);

        jTextFieldMarket.setEditable(false);

        jButton2.setText("Check Commission >");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextFieldComission.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Cart");

        jLabel1.setText("Invoice Total");

        jTextFieldInvTotal.setEditable(false);

        jLabel2.setText("Commission:");

        jTextFieldTotCommission.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSalesPrice))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jButton1))
                            .addComponent(jTextFieldComission, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(502, 502, 502)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldInvTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTotCommission, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTextFieldCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)))))
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMarket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextFieldComission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldInvTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTotCommission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addContainerGap(236, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:        
        int selectedRow = marketOfferTable.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }else{
            int fetchQty = (Integer) qtySpinner.getValue();
            if(fetchQty<=0)
            {
            JOptionPane.showMessageDialog(null, "Quantity cannot be less than or equal to 0");
            return;
            }else
            {
                MarketOffer mo= (MarketOffer)marketOfferTable.getValueAt(selectedRow, 0);
                int salesPrice = Integer.parseInt(txtSalesPrice.getText());
                int floor = mo.getFloor();
                int ceiling = mo.getCeiling();
                int targetPrice = mo.getTarget();
                if((salesPrice > ceiling) || (salesPrice < floor))
                        JOptionPane.showMessageDialog(null, "Please select a price between Floor and Ceiling!!");                        
                else{
                     int dialogButton = JOptionPane.YES_NO_OPTION;
                     int dialogResult = JOptionPane.showConfirmDialog(null, "Once Items are added, it can not be removed. DO you want to Proceed?", "Warning" , dialogButton);
                     if (dialogResult == JOptionPane.YES_OPTION){   
                         if(o == null)
                             o = mol.addOrder();
                           for(int i=0; i<fetchQty ; i++){                               
                               OrderItem oi = o.addOderItem();
                               if(i == 0){ 
                                   cartList.add(oi);
                                   oi.setQuantity(fetchQty);
                               }
                               oi.setP(mo.getP());
                               oi.setSalesPrice(salesPrice);
                               oi.setTargetPrice(targetPrice);
                               Product p = mo.getP();
                               int diff = Helper.giveDifference(salesPrice, targetPrice); 
                               if(diff > 0){
                                oi.setAboveTarget(true);
                                p.aboveSalesCount();
                                m.aboveSalesCount();
                                per.aboveSalesCount();
                                }
                                if(diff == 0){
                                    oi.setOnTarget(true);
                                    p.onTargetCount();
                                    m.onTargetCount();
                                    per.onTargetCount();
                                }
                                if(diff < 0){
                                    oi.setBelowTarget(true);
                                    p.belowSalesCount();
                                    m.belowSalesCount();
                                    per.belowSalesCount();
                                }
                                p.addTargetPrice(targetPrice);
                                p.addRevenue(salesPrice);
                                p.setAvailability(p.getAvailability()-1);
                                m.addRevenue(salesPrice);
                                m.addTargetPrice(targetPrice);
                                per.addRevenue(salesPrice);
                                per.addTargetPrice(targetPrice);
                                double comission = Helper.calculateComission(salesPrice, targetPrice);
                                per.addCommission(comission);
                                oi.setCommission(comission);      
                                refreshTable();                               
                           }
                           jTextFieldTotCommission.setText(String.valueOf(o.totalComission()));
                           jTextFieldInvTotal.setText(String.valueOf(o.totalRevenue()));                           
                           populateCart(cartList);
                           JOptionPane.showMessageDialog(null, "Item added!!");
                    }
                }
                
            }          
        }                                 

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(o == null)
            JOptionPane.showMessageDialog(null, "Add Items to cart");
        else{
            o.setC(c);
            o.setM(m);
            o.setP(per);
            JOptionPane.showMessageDialog(null, "Your Order Id is : " +o.getOrderId());
            JOptionPane.showMessageDialog(null, "Your Total Commission on this order is  : " +o.totalComission());
            JOptionPane.showMessageDialog(null, "Invoice Total : " +o.totalRevenue());
            refresh();           
        }
                 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRowValue = marketOfferTable.getSelectedRow();
        if(selectedRowValue < 0)
            JOptionPane.showMessageDialog(null,"Please select a record to delete");
        else{
            MarketOffer mo= (MarketOffer)marketOfferTable.getValueAt(selectedRowValue, 0);
            double com = Helper.calculateComission(Integer.parseInt(txtSalesPrice.getText()), mo.getTarget());
            jTextFieldComission.setText(String.valueOf(com));
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldComission;
    private javax.swing.JTextField jTextFieldCustomer;
    private javax.swing.JTextField jTextFieldInvTotal;
    private javax.swing.JTextField jTextFieldMarket;
    private javax.swing.JTextField jTextFieldTotCommission;
    private javax.swing.JTable marketOfferTable;
    private javax.swing.JTable orderTable;
    private javax.swing.JSpinner qtySpinner;
    private javax.swing.JTextField txtSalesPrice;
    // End of variables declaration//GEN-END:variables
}
