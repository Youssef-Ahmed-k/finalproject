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
 * @author mohamed_mo3taz
 */
public class Uploadtask extends javax.swing.JFrame {

    /**
     * Creates new form Uploadtask
     */
    public Uploadtask() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnum = new javax.swing.JTextField();
        taskname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/rsz_background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(649, 449));
        jLabel3.setMinimumSize(new java.awt.Dimension(649, 449));
        jLabel3.setPreferredSize(new java.awt.Dimension(649, 450));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setPreferredSize(new java.awt.Dimension(652, 452));
        setResizable(false);
        setSize(new java.awt.Dimension(651, 651));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/upload task.png"))); // NOI18N
        jLabel1.setText("Upload Tasks");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 10, 310, 40);

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/back-icon.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(440, 350, 150, 40);

        save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/save.png"))); // NOI18N
        save.setText("send");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(80, 350, 150, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Project Number :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 200, 220, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Task Name :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 90, 150, 40);

        pnum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(pnum);
        pnum.setBounds(100, 250, 250, 40);

        taskname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(taskname);
        taskname.setBounds(100, 140, 250, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        jLabel6.setText("jLabel3");
        jLabel6.setMaximumSize(new java.awt.Dimension(649, 449));
        jLabel6.setMinimumSize(new java.awt.Dimension(649, 449));
        jLabel6.setPreferredSize(new java.awt.Dimension(649, 450));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 649, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Employee e = new Employee();
        e.setLocation(400, 200);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:

        try {
            CEmp e = new CEmp();
            e.uploadtask();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(Uploadtask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uploadtask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uploadtask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uploadtask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uploadtask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JTextField pnum;
    private javax.swing.JButton save;
    public static javax.swing.JTextField taskname;
    // End of variables declaration//GEN-END:variables
}
