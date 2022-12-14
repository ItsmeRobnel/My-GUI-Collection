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
public class User_Registration extends javax.swing.JFrame {

    public static String firstName;
    public static String lastname;
    public static long phoneNo = 0 ;
    public static String username1;
    public static String password1;

    /**
     * Creates new form User_Log_In
     */
    public User_Registration() {
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
        userNameTxt1 = new javax.swing.JTextField();
        checkPass = new javax.swing.JCheckBox();
        PassWord1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phoneNoTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        confirtnBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Account Registration");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameTxt1.setBackground(new java.awt.Color(51, 51, 51));
        userNameTxt1.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        userNameTxt1.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(userNameTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 160, 30));

        checkPass.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        checkPass.setForeground(new java.awt.Color(232, 232, 232));
        checkPass.setText("Show password");
        checkPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPassActionPerformed(evt);
            }
        });
        getContentPane().add(checkPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 110, 30));

        PassWord1.setBackground(new java.awt.Color(51, 51, 51));
        PassWord1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        PassWord1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PassWord1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 160, 30));

        jButton2.setBackground(new java.awt.Color(17, 17, 17));
        jButton2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Clear");
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 90, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 60, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Username");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 70, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Phone No.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 70, 30));

        phoneNoTxt.setBackground(new java.awt.Color(51, 51, 51));
        phoneNoTxt.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        phoneNoTxt.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(phoneNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 160, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 70, 30));

        lastNameTxt.setBackground(new java.awt.Color(51, 51, 51));
        lastNameTxt.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        lastNameTxt.setForeground(new java.awt.Color(204, 204, 204));
        lastNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lastNameTxtKeyPressed(evt);
            }
        });
        getContentPane().add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 160, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 70, 30));

        firstNameTxt.setBackground(new java.awt.Color(51, 51, 51));
        firstNameTxt.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        firstNameTxt.setForeground(new java.awt.Color(204, 204, 204));
        firstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTxtActionPerformed(evt);
            }
        });
        firstNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameTxtKeyPressed(evt);
            }
        });
        getContentPane().add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 160, 30));

        jButton1.setBackground(new java.awt.Color(8, 8, 8));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(234, 237, 237));
        jButton1.setText("BACK");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 470, 30));

        confirtnBtn.setBackground(new java.awt.Color(8, 8, 8));
        confirtnBtn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        confirtnBtn.setForeground(new java.awt.Color(234, 237, 237));
        confirtnBtn.setText("CONFIRM");
        confirtnBtn.setFocusPainted(false);
        confirtnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirtnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(confirtnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 470, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/My project-1 (1).png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 360, 80));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PizzaFINAL.png"))); // NOI18N
        jPanel1.add(jLabel10);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 190, 90));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blackradiant - Copy.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 510, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new User_Log_in1().show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPassActionPerformed
        if (checkPass.isSelected()) {

            PassWord1.setEchoChar((char) 0);
        } else {

            PassWord1.setEchoChar('*');
        }
    }//GEN-LAST:event_checkPassActionPerformed

    private void confirtnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirtnBtnActionPerformed
        
        boolean success = false;
        firstName = firstNameTxt.getText();
        lastname = lastNameTxt.getText();
        username1 = userNameTxt1.getText();
        password1 = PassWord1.getText();
        
        if (firstNameTxt.getText().equals("") || lastNameTxt.getText().equals("") || phoneNoTxt.getText().equals("") || userNameTxt1.getText().equals("") || PassWord1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill all the the information!", "Incomplete Details", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                phoneNo = Long.parseLong(phoneNoTxt.getText());
                success = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please Enter a VALID Phone Number!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (success == true) {
                AccountDetails obj3 = new AccountDetails();
                obj3.usernameLbl.setText(username1);
                obj3.passwordLbl.setText(password1);
                obj3.setVisible(true);
                this.dispose();
            }

        }
    }//GEN-LAST:event_confirtnBtnActionPerformed

    private void firstNameTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTxtKeyPressed
       char c = evt.getKeyChar();
       if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
           firstNameTxt.setEditable(true);
       }else firstNameTxt.setEditable(false);
    }//GEN-LAST:event_firstNameTxtKeyPressed

    private void firstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTxtActionPerformed

    private void lastNameTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTxtKeyPressed
        char c = evt.getKeyChar();
       if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
        lastNameTxt.setEditable(true);
       }else lastNameTxt.setEditable(false);
    }//GEN-LAST:event_lastNameTxtKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       firstNameTxt.setText("");
       lastNameTxt.setText("");
       phoneNoTxt.setText("");
       userNameTxt1.setText("");
       PassWord1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(User_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPasswordField PassWord1;
    private javax.swing.JCheckBox checkPass;
    private javax.swing.JButton confirtnBtn;
    public static javax.swing.JTextField firstNameTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    public static javax.swing.JTextField lastNameTxt;
    public static javax.swing.JTextField phoneNoTxt;
    public static javax.swing.JTextField userNameTxt1;
    // End of variables declaration//GEN-END:variables
}
