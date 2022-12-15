/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Requestvacation extends javax.swing.JFrame {

    /**
     * Creates new form Requestvacation
     */
    public Requestvacation() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        to = new javax.swing.JTextField();
        from1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        VacationState = new javax.swing.JButton();
        back = new javax.swing.JButton();
        save = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setPreferredSize(new java.awt.Dimension(652, 452));
        setResizable(false);
        setSize(new java.awt.Dimension(651, 451));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Request vacation");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 0, 330, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Coffee-break-icon.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 0, 40, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("To :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 100, 30);
        getContentPane().add(to);
        to.setBounds(60, 230, 280, 40);
        getContentPane().add(from1);
        from1.setBounds(60, 120, 280, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("From :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 70, 100, 30);

        VacationState.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VacationState.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/asstask.png"))); // NOI18N
        VacationState.setText("Vacation State");
        VacationState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VacationStateActionPerformed(evt);
            }
        });
        getContentPane().add(VacationState);
        VacationState.setBounds(210, 360, 230, 40);

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/back-icon.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(450, 300, 150, 40);

        save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        save.setText("Send");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(60, 300, 150, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 650, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Employee e=new Employee();
        e.setLocation(400, 200);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
                try {
            CEmp e = new CEmp();
            e.requestvacation();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void VacationStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VacationStateActionPerformed
        // TODO add your handling code here:
        Vacationstate v=new Vacationstate();
        v.setLocation(400, 200);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VacationStateActionPerformed

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
            java.util.logging.Logger.getLogger(Requestvacation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Requestvacation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Requestvacation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Requestvacation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Requestvacation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VacationState;
    private javax.swing.JButton back;
    private javax.swing.JLabel bg;
    public static javax.swing.JTextField from1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton save;
    public static javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}