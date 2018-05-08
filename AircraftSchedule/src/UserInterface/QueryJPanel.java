/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Questions
1. Find me the first available airplane.
2. How many airplanes are currently available. How many are, otherwise.  
3. List all airplanes that are made by Boeing. 
4. List all airplanes that were manufactured in a given year, ‘x’. 
5. Find an available airplane with a minimum of x seats but no more than y seats.  
6. Find an airplane with the given serial number. List the attributes of the found airplane.  
7. List all airplanes given the model number. 
8. List all the airplane manufacturers used by the (this) airliner. 
9. When was the last time the fleet catalog was updated.  
10. List all airplanes that are available in a given airport 
11. List all airplanes that have expired maintenance certificate. 
*/
package UserInterface;

import Business.Airliner;

/**
 *
 * @author Bengre
 */
public class QueryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QueryJPanel
     */
    private Airliner al;
    public QueryJPanel(Airliner al) {
        initComponents();
        this.al = al;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPaneQuery = new javax.swing.JSplitPane();
        jPanelQuestions = new javax.swing.JPanel();
        jButtonQ1 = new javax.swing.JButton();
        jButtonQ2 = new javax.swing.JButton();
        jButtonQ3 = new javax.swing.JButton();
        jButtonQ4 = new javax.swing.JButton();
        jButtonQ5 = new javax.swing.JButton();
        jButtonQ6 = new javax.swing.JButton();
        jButtonQ7 = new javax.swing.JButton();
        jButtonQ8 = new javax.swing.JButton();
        jButtonQ9 = new javax.swing.JButton();
        jButtonQten = new javax.swing.JButton();
        jButtonQ11 = new javax.swing.JButton();
        jPanelAnswers = new javax.swing.JPanel();

        jButtonQ1.setText("First Available Plane");
        jButtonQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQ1ActionPerformed(evt);
            }
        });

        jButtonQ2.setText("Currently Available Airplanes");
        jButtonQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQ2ActionPerformed(evt);
            }
        });

        jButtonQ3.setText("Airplanes made by Boeing");
        jButtonQ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQ3ActionPerformed(evt);
            }
        });

        jButtonQ4.setText("Manufactured Year");
        jButtonQ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQ4ActionPerformed(evt);
            }
        });

        jButtonQ5.setText("Number of seats");
        jButtonQ5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQ5ActionPerformed(evt);
            }
        });

        jButtonQ6.setText("View Airplane Details");
        jButtonQ6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQ6ActionPerformed(evt);
            }
        });

        jButtonQ7.setText("Model Number");
        jButtonQ7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQ7ActionPerformed(evt);
            }
        });

        jButtonQ8.setText("Airplane Manufacturers");
        jButtonQ8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQ8ActionPerformed(evt);
            }
        });

        jButtonQ9.setText("Fleet Catalogue Last Updated");
        jButtonQ9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQ9ActionPerformed(evt);
            }
        });

        jButtonQten.setText("Airplanes at given Airport");
        jButtonQten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQtenActionPerformed(evt);
            }
        });

        jButtonQ11.setText("Maintenance Expired");
        jButtonQ11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQ11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelQuestionsLayout = new javax.swing.GroupLayout(jPanelQuestions);
        jPanelQuestions.setLayout(jPanelQuestionsLayout);
        jPanelQuestionsLayout.setHorizontalGroup(
            jPanelQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuestionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonQ9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQ3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQ4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQ5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQ6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQ7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQ8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQ11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelQuestionsLayout.setVerticalGroup(
            jPanelQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuestionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonQ1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQ2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQ3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQ4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQ5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQ6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQ7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQ8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQ9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQ11)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jSplitPaneQuery.setLeftComponent(jPanelQuestions);

        javax.swing.GroupLayout jPanelAnswersLayout = new javax.swing.GroupLayout(jPanelAnswers);
        jPanelAnswers.setLayout(jPanelAnswersLayout);
        jPanelAnswersLayout.setHorizontalGroup(
            jPanelAnswersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
        jPanelAnswersLayout.setVerticalGroup(
            jPanelAnswersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        jSplitPaneQuery.setRightComponent(jPanelAnswers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneQuery, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneQuery)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQtenActionPerformed
        // TODO add your handling code here:
        QTenJPanel questTen = new QTenJPanel(al);
        jSplitPaneQuery.setRightComponent(questTen);               
    }//GEN-LAST:event_jButtonQtenActionPerformed

    private void jButtonQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQ1ActionPerformed
        // TODO add your handling code here:
        QOneJPanel questOne = new QOneJPanel(al);
        jSplitPaneQuery.setRightComponent(questOne);
    }//GEN-LAST:event_jButtonQ1ActionPerformed

    private void jButtonQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQ2ActionPerformed
        // TODO add your handling code here:
        QTwoJPanel questTwo = new QTwoJPanel(al);
        jSplitPaneQuery.setRightComponent(questTwo);
    }//GEN-LAST:event_jButtonQ2ActionPerformed

    private void jButtonQ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQ3ActionPerformed
        // TODO add your handling code here:
        QThreeJPanel questThree = new QThreeJPanel(al);
        jSplitPaneQuery. setRightComponent(questThree);
    }//GEN-LAST:event_jButtonQ3ActionPerformed

    private void jButtonQ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQ4ActionPerformed
        // TODO add your handling code here:
        QFourJPanel questFour = new QFourJPanel(al);
        jSplitPaneQuery.setRightComponent(questFour);
    }//GEN-LAST:event_jButtonQ4ActionPerformed

    private void jButtonQ5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQ5ActionPerformed
        // TODO add your handling code here:
        QFiveJPanel questFive = new QFiveJPanel(al);
        jSplitPaneQuery.setRightComponent(questFive);
    }//GEN-LAST:event_jButtonQ5ActionPerformed

    private void jButtonQ6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQ6ActionPerformed
        // TODO add your handling code here:
        QSixJPanel questSix = new QSixJPanel(al);
        jSplitPaneQuery.setRightComponent(questSix);
    }//GEN-LAST:event_jButtonQ6ActionPerformed

    private void jButtonQ7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQ7ActionPerformed
        // TODO add your handling code here:
        QSevenJPanel questSeven = new QSevenJPanel(al);
        jSplitPaneQuery.setRightComponent(questSeven);
    }//GEN-LAST:event_jButtonQ7ActionPerformed

    private void jButtonQ8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQ8ActionPerformed
        // TODO add your handling code here:
        QEightJPanel questEight = new QEightJPanel(al);
        jSplitPaneQuery. setRightComponent(questEight);
    }//GEN-LAST:event_jButtonQ8ActionPerformed

    private void jButtonQ9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQ9ActionPerformed
        // TODO add your handling code here:
        QNineJPanel questNine = new QNineJPanel(al);
        jSplitPaneQuery.setRightComponent(questNine);
    }//GEN-LAST:event_jButtonQ9ActionPerformed

    private void jButtonQ11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQ11ActionPerformed
        // TODO add your handling code here:
        QElevenJPanel questEleven = new QElevenJPanel(al);
        jSplitPaneQuery.setRightComponent(questEleven);
    }//GEN-LAST:event_jButtonQ11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonQ1;
    private javax.swing.JButton jButtonQ11;
    private javax.swing.JButton jButtonQ2;
    private javax.swing.JButton jButtonQ3;
    private javax.swing.JButton jButtonQ4;
    private javax.swing.JButton jButtonQ5;
    private javax.swing.JButton jButtonQ6;
    private javax.swing.JButton jButtonQ7;
    private javax.swing.JButton jButtonQ8;
    private javax.swing.JButton jButtonQ9;
    private javax.swing.JButton jButtonQten;
    private javax.swing.JPanel jPanelAnswers;
    private javax.swing.JPanel jPanelQuestions;
    private javax.swing.JSplitPane jSplitPaneQuery;
    // End of variables declaration//GEN-END:variables
}