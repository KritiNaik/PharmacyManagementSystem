/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kriti
 */
public class first extends javax.swing.JFrame {

    /**
     * Creates new form first
     */
    public first() {
        initComponents();
    }
Connection con1;
PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        emusername = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Textusername = new javax.swing.JTextField();
        PasswordPass = new javax.swing.JPasswordField();
        jButtonreset = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        empassword = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonexit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setText("ROFFE PHARMA");

        jLabel5.setText("ROFFE PHARMA");

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);

        jPanel3.setBackground(new java.awt.Color(36, 47, 65));

        emusername.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jPanel3.add(emusername);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ROFFE PHARMA");
        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Textusername.setBackground(new java.awt.Color(97, 212, 195));
        Textusername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Textusername.setForeground(new java.awt.Color(255, 255, 255));
        Textusername.setBorder(null);
        Textusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextusernameActionPerformed(evt);
            }
        });
        jPanel1.add(Textusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 420, 30));

        PasswordPass.setBackground(new java.awt.Color(97, 212, 195));
        PasswordPass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PasswordPass.setForeground(new java.awt.Color(255, 255, 255));
        PasswordPass.setBorder(null);
        jPanel1.add(PasswordPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 390, 30));

        jButtonreset.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonreset.setText("Reset");
        jButtonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresetActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 130, 40));

        jButtonLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 110, 40));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 230, -1));

        empassword.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jPanel1.add(empassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 240, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 380, 30));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 380, 50));

        jPanel4.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 610));

        jPanel5.setBackground(new java.awt.Color(36, 47, 65));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacymanage/icons8-hospital-96.png"))); // NOI18N
        jLabel3.setText("ROFFE PHARMA");
        jPanel5.add(jLabel3);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 330));

        jButtonexit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonexit.setText("<---");
        jButtonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        jLabel6.setBackground(new java.awt.Color(97, 212, 195));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 170, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
  dispose();
  new option().setVisible(true);

 if(Textusername.getText().trim().isEmpty() && PasswordPass.getText().trim().isEmpty() ){
             emusername.setText("username is empty");
            empassword.setText("username is empty");
 }
            else if(Textusername.getText().trim().isEmpty()){
               emusername.setText("username is empty"); 
            }
            else if(PasswordPass.getText().trim().isEmpty()){
               empassword.setText("username is empty");  
            }
            else {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/pharmacy", "root", "");
            String sql = "Select * from User where username=? and password =?";
            PreparedStatement pst = con1.prepareStatement(sql);
            pst.setString(1, Textusername.getText());
            pst.setString(2, PasswordPass.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"username and password matched");

            }
            else{
                JOptionPane.showMessageDialog(null, "username and password do not match");
            Textusername.setText("");
            PasswordPass.setText("");
            }
            con1.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        }

        
        
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresetActionPerformed
        // TODO add your handling code here:
         Textusername.setText(null);
      PasswordPass.setText(null);
    }//GEN-LAST:event_jButtonresetActionPerformed

    private void jButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexitActionPerformed
dispose();
      // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonexitActionPerformed

    private void TextusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextusernameActionPerformed

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
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new first().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordPass;
    private javax.swing.JTextField Textusername;
    private javax.swing.JLabel empassword;
    private javax.swing.JLabel emusername;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonexit;
    private javax.swing.JButton jButtonreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
