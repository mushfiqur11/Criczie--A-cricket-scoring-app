/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadprojectcrickzie;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class SelectTeams extends javax.swing.JFrame {
    int TourneyID;
    /**
     * Creates new form SelectTeams
     * @param _TourneyID
     */
    public SelectTeams(int _TourneyID) {
        initComponents();
        TourneyID=_TourneyID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Team1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Team2 = new javax.swing.JComboBox<>();
        Team3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Team4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Team5 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Team6 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Logo2 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        jLabel7.setText("Crickzie");
        jLabel7.setToolTipText("");

        Logo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icon.png")); // NOI18N

        jLabel1.setText("Team1:");

        Team1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTM", "CEE", "CSE", "EEE", "MCE", "TVE" }));
        Team1.setEnabled(false);

        jLabel2.setText("Team2:");

        Team2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTM", "CEE", "CSE", "EEE", "MCE", "TVE" }));
        Team2.setSelectedIndex(1);
        Team2.setEnabled(false);

        Team3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTM", "CEE", "CSE", "EEE", "MCE", "TVE" }));
        Team3.setSelectedIndex(2);
        Team3.setEnabled(false);

        jLabel3.setText("Team3:");

        jLabel4.setText("Team4:");

        Team4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTM", "CEE", "CSE", "EEE", "MCE", "TVE" }));
        Team4.setSelectedIndex(3);
        Team4.setEnabled(false);

        jLabel5.setText("Team5:");

        Team5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTM", "CEE", "CSE", "EEE", "MCE", "TVE" }));
        Team5.setSelectedIndex(4);
        Team5.setEnabled(false);

        jLabel6.setText("Team6:");

        Team6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTM", "CEE", "CSE", "EEE", "MCE", "TVE" }));
        Team6.setSelectedIndex(5);
        Team6.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        jLabel8.setText("Crickzie");
        jLabel8.setToolTipText("");

        Logo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icon.png")); // NOI18N

        Submit.setText("Confirm");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(71, 71, 71)
                            .addComponent(Team1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(71, 71, 71)
                            .addComponent(Team2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(71, 71, 71)
                            .addComponent(Team3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(71, 71, 71)
                            .addComponent(Team4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(71, 71, 71)
                            .addComponent(Team5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(71, 71, 71)
                            .addComponent(Team6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(Logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Team1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Team2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Team3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Team4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Team5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Team6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(Submit)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        if(JDBConnection.JDBCCreateTournamentTeams(TourneyID)==1){
            JOptionPane.showMessageDialog(rootPane, "Select Teams", "Teams Selected", 1);
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Select Teams", "Teams Selection Failed", 1);
        }
    }//GEN-LAST:event_SubmitActionPerformed

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
            java.util.logging.Logger.getLogger(SelectTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SelectTeams().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Logo2;
    private javax.swing.JButton Submit;
    private javax.swing.JComboBox<String> Team1;
    private javax.swing.JComboBox<String> Team2;
    private javax.swing.JComboBox<String> Team3;
    private javax.swing.JComboBox<String> Team4;
    private javax.swing.JComboBox<String> Team5;
    private javax.swing.JComboBox<String> Team6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}