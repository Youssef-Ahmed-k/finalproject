/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.JOptionPane;

/**
 *
 * @author ebrahem
 */
public class Pmproprograss extends javax.swing.JFrame {

    /**
     * Creates new form Pmproprograss
     */
    public Pmproprograss() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        prograss = new javax.swing.JTextField();
        send1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pnum1 = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setPreferredSize(new java.awt.Dimension(652, 452));
        setResizable(false);
        setSize(new java.awt.Dimension(651, 451));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/pmprograss.png"))); // NOI18N
        jLabel1.setText("Project Progress");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 0, 380, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Project Number :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 80, 220, 30);

        prograss.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prograss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prograssActionPerformed(evt);
            }
        });
        getContentPane().add(prograss);
        prograss.setBounds(120, 270, 250, 40);

        send1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        send1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/asstask.png"))); // NOI18N
        send1.setText("View");
        send1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send1ActionPerformed(evt);
            }
        });
        getContentPane().add(send1);
        send1.setBounds(480, 130, 130, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Project Progress :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 210, 230, 30);

        pnum1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnum1ActionPerformed(evt);
            }
        });
        getContentPane().add(pnum1);
        pnum1.setBounds(120, 130, 250, 40);

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/back-icon.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(250, 350, 150, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 650, 449);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prograssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prograssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prograssActionPerformed

    private void pnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnum1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        PM e = new PM();
        e.setLocation(400, 200);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void send1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send1ActionPerformed
        // TODO add your handling code here:
        try {
            CPm c = new CPm();
            c.pop();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_send1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pmproprograss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pmproprograss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pmproprograss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pmproprograss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pmproprograss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JTextField pnum1;
    public static javax.swing.JTextField prograss;
    private javax.swing.JButton send1;
    // End of variables declaration//GEN-END:variables
}
