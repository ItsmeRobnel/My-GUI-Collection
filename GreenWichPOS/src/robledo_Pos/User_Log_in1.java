/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package robledo_Pos;

import javax.swing.JOptionPane;

/**
 *
 * @author roble
 */
public class User_Log_in1 extends javax.swing.JFrame {

    User_Registration obj = new User_Registration();
    
    /**
     * Creates new form User_Log_In
     */
    public User_Log_in1() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        userNameTxt2 = new javax.swing.JTextField();
        signUpBtn = new javax.swing.JButton();
        checkPass = new javax.swing.JCheckBox();
        PassWord2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JButton();
        LogInBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN IN");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameTxt2.setBackground(new java.awt.Color(51, 51, 51));
        userNameTxt2.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        userNameTxt2.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(userNameTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, 30));

        signUpBtn.setBackground(new java.awt.Color(8, 8, 8));
        signUpBtn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(234, 237, 237));
        signUpBtn.setText("SIGN UP");
        signUpBtn.setFocusPainted(false);
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(signUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 140, 30));

        checkPass.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        checkPass.setForeground(new java.awt.Color(204, 204, 204));
        checkPass.setText("Show password");
        checkPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPassActionPerformed(evt);
            }
        });
        getContentPane().add(checkPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 130, 30));

        PassWord2.setBackground(new java.awt.Color(51, 51, 51));
        PassWord2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        PassWord2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PassWord2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 160, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 110, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Username");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 70, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/My project-1.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 200, 150));

        ExitBtn.setBackground(new java.awt.Color(8, 8, 8));
        ExitBtn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(234, 237, 237));
        ExitBtn.setText("EXIT");
        ExitBtn.setFocusPainted(false);
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 140, 30));

        LogInBtn.setBackground(new java.awt.Color(8, 8, 8));
        LogInBtn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LogInBtn.setForeground(new java.awt.Color(234, 237, 237));
        LogInBtn.setText("LOGIN");
        LogInBtn.setFocusPainted(false);
        LogInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LogInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/My project-1 (1).png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 360, 80));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blackradiant - Copy.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 510, 160));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void checkPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPassActionPerformed
        if (checkPass.isSelected()) {

            PassWord2.setEchoChar((char) 0);
        } else {

            PassWord2.setEchoChar('*');
        }
    }//GEN-LAST:event_checkPassActionPerformed

    private void LogInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInBtnActionPerformed

        if (userNameTxt2.getText().equals(obj.username1) && PassWord2.getText().equals(obj.password1)) {
            WelcomeGreet obj4 = new WelcomeGreet();
            obj4.userNameWelcome.setText("Hi there, " + obj.username1+". Welcome!");
            obj4.show();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Credentials", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_LogInBtnActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed

        obj.firstNameTxt.setText(obj.firstName);
        obj.lastNameTxt.setText(obj.lastname);
        if(obj.phoneNo==0){
            obj.phoneNoTxt.setText("");
        }else{
            obj.phoneNoTxt.setText(String.valueOf(obj.phoneNo));
        }
        obj.userNameTxt1.setText(obj.username1);
        obj.PassWord1.setText(obj.password1);
        obj.show();
        dispose();
    }//GEN-LAST:event_signUpBtnActionPerformed

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
            java.util.logging.Logger.getLogger(User_Log_in1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Log_in1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Log_in1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Log_in1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Log_in1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton LogInBtn;
    private javax.swing.JPasswordField PassWord2;
    private javax.swing.JCheckBox checkPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    public static javax.swing.JButton signUpBtn;
    private javax.swing.JTextField userNameTxt2;
    // End of variables declaration//GEN-END:variables
}
