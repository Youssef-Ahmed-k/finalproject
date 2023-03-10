/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Youssef_Ahmed
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        jLabel2 = new javax.swing.JLabel();
        loginid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setPreferredSize(new java.awt.Dimension(652, 452));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 450));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/icons8-people-100.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 140, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/icons8-username-48.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 130, 50, 50);

        loginid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(loginid);
        loginid.setBounds(200, 130, 280, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/icons8-sign-in-form-password-48.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 220, 50, 50);

        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/icons8-login-32.png"))); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(240, 310, 180, 40);

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(password);
        password.setBounds(200, 220, 280, 50);

        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton1.setText("About");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 380, 80, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("ID:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 110, 40, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("Password:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 200, 120, 16);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 650, 449);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        clogin l = new clogin();

        int x=0;
        // emplyee
        try {
            DB d = new DB();
            ResultSet rs = l.openemp();
            if (rs.next()) {
                x=1;
                Employee a = new Employee();
                a.setLocation(400,200);
                a.setVisible(true);
                this.dispose();
            }
            d.Close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        //team leader
        try {
            DB d = new DB();
            ResultSet rs = l.opentm();
            if (rs.next()) {
                x=1;
                Teamleader tm = new Teamleader();
                tm.setLocation(400,200);
                tm.setVisible(true);
                this.dispose();
            }
            d.Close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } // project manager
        try {
            DB d = new DB();

            ResultSet rs = l.openpm();
            if (rs.next()) {
                x=1;
                PM m = new PM();
                m.setLocation(400,200);
                m.setVisible(true);
                this.dispose();
            }
            d.Close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //admin
        try {
            DB d = new DB();
            ResultSet rs = l.opena();
            if (rs.next()) {
                x=1;
                Admin a = new Admin();
                a.setLocation(400,200);
                a.setVisible(true);
                this.dispose();
            }

            d.Close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        if(x==0){
            JOptionPane.showMessageDialog(null, "Username or password not Correct");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        About a= new About();
        a.setLocation(400, 200);
        a.setVisible(true );
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton login;
    public static javax.swing.JTextField loginid;
    public static javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
