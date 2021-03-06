/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Airliner;
import Business.Airplanes;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bengre
 */
public class QElevenJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QElevenJPanel
     */
    private Airliner al;
    private ArrayList<Airplanes> tempList;
    public QElevenJPanel(Airliner al) {
        initComponents();
        this.al = al;
        tempList= new ArrayList(); 
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)jTableModelList.getModel();
        dtm.setRowCount(0);
        
        for(Airplanes a:tempList ){
            Object row[] = new Object[2];
            row[0] = a;
            row[1] = a.getModelName();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModelList = new javax.swing.JTable();
        jButtonGo = new javax.swing.JButton();

        jTableModelList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airplane Serial Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableModelList);

        jButtonGo.setText("Fetch Data");
        jButtonGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jButtonGo)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButtonGo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoActionPerformed
        // TODO add your handling code here:
        Date date= Calendar.getInstance().getTime();
        for(Airplanes a: al.getAirplaneList()){
            try {
                String dateStr = a.getMainExpDate();
                DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                Date startDate = (Date)formatter.parse(dateStr);
                if(date.after(startDate)){
                    tempList.add(a);
                }
                    } catch (ParseException ex) {
                Logger.getLogger(QElevenJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        populateTable();
    }//GEN-LAST:event_jButtonGoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableModelList;
    // End of variables declaration//GEN-END:variables
}
