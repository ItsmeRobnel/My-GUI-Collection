/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package robledo_Pos;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static robledo_Pos.GreenWich_POS.CustomerName;
import static robledo_Pos.GreenWich_POS.ToTalToReceipt;
import static robledo_Pos.GreenWich_POS.TotalTxt;
import static robledo_Pos.Receipt12.ReceiptTable;

/**
 *
 * @author roble
 */
public class CheckOut12 extends javax.swing.JFrame {

    /**
     * Creates new form AccountDetails
     */
    public CheckOut12() {
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

        jPanel1 = new javax.swing.JPanel();
        amountPayTxt = new javax.swing.JTextField();
        PayOrderTotalAmount = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        userNameWelcome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment");
        setBackground(new java.awt.Color(0, 175, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(68, 142, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        amountPayTxt.setBackground(new java.awt.Color(51, 51, 51));
        amountPayTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        amountPayTxt.setForeground(new java.awt.Color(255, 255, 255));
        amountPayTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountPayTxtKeyPressed(evt);
            }
        });
        jPanel1.add(amountPayTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 30));

        PayOrderTotalAmount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PayOrderTotalAmount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(PayOrderTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 160, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Amount Here:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 30));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setBackground(new java.awt.Color(8, 8, 8));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 130, -1));

        jButton2.setBackground(new java.awt.Color(14, 14, 14));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("CONFRIM");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Order Total Amount:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 30));

        userNameWelcome.setFont(new java.awt.Font("Lucida Bright", 3, 14)); // NOI18N
        userNameWelcome.setForeground(new java.awt.Color(234, 230, 230));
        jPanel1.add(userNameWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 280, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("PAY YOUR ORDER");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/COPY OF BLACK  FOR CREDENTIAL.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG - Copy.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 320, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 170));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GreenWich_POS pos = new GreenWich_POS();
        DefaultTableModel model = (DefaultTableModel) GreenWich_POS.model;
        GreenWich_POS.CustomerName.setText(User_Registration.firstName + " " + User_Registration.lastname);
        GreenWich_POS.TransactionMode = pos.TransactionMode;
        GreenWich_POS.CardLabTxt.setText(pos.cardLabTxt);
        GreenWich_POS.TotalTxt.setText(GreenWich_POS.ToTalToReceipt);
        GreenWich_POS.myTable.setModel(model);

        pos.show();
        this.show(false);
    }//GEN-LAST:event_jButton1ActionPerformed
void transactionNumber(){
    int[] stlnum = new int[100000];
      Random rand = new Random();
         for (int a = 0; a < 2; a++) {
          int randomNum = rand.nextInt(stlnum.length);
          if (randomNum == 0){
              randomNum=111292391;
          }
          stlnum[a] = randomNum;
      }
          Receipt12.TransactionNum.setText("Transaction Number: " + String.valueOf(stlnum[0])+String.valueOf(stlnum[1]));
      }
     

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        GreenWich_POS pos = new GreenWich_POS();
        Receipt12 ReceiptForm = new Receipt12();

        double change = 0;
        double AmountPay = Double.parseDouble(amountPayTxt.getText());
        double n = Double.parseDouble(GreenWich_POS.ToTalToReceipt.replaceAll("₱", "").trim());

        if (AmountPay > n) {
            change = AmountPay - n;

            DefaultTableModel model = (DefaultTableModel) pos.model;
            ReceiptForm.CustomerName2.setText("Customer Name: " + User_Registration.firstName + " " + User_Registration.lastname);
            ReceiptForm.TransactionType.setText("Transaction Type: " + pos.TransactionMode);
            ReceiptForm.OverLoadCardNum.setText("OverLoad Card Number: " + pos.cardLabTxt);
            transactionNumber();
            ReceiptForm.ContactNum.setText("Contact Number: " + User_Registration.phoneNo);
            ReceiptForm.AmountPaid.setText("AMOUNT PAID:    ₱" + AmountPay);
            ReceiptForm.OrderTotalAmount.setText("TOTAL ORDER:    " + GreenWich_POS.ToTalToReceipt);
            ReceiptForm.ReceiptChangeField.setText("₱" + change);
            ReceiptForm.ReceiptChangeField.setEditable(false);
            ReceiptForm.ReceiptTable.setModel(model);
            ReceiptForm.ReceiptTable.setEnabled(false);

            dispose();

            ReceiptForm.setVisible(true);
        } else {
JOptionPane.showMessageDialog(this, "Paid Amount should greater than Order Total Amount!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        /* 
        double change = 0;
        String TransactionMode="";
            
            double AmountPay = Double.parseDouble(AmountPayTxt.getText());
            double n = Double.parseDouble(pos.TotalTxt.getText());
            change = AmountPay - n;
            
            DefaultTableModel model = (DefaultTableModel)pos.myTable.getModel();
            Receipt12.CustomerName2.setText("Customer Name: " + pos.CustomerName.getText());
            Receipt12.TransactionType.setText("Transaction Type: " + TransactionMode);
            Receipt12.OverLoadCardNum.setText("OverLoad Card Number: " +pos.CardLabTxt.getText());
            Receipt12.ContactNum.setText("Contact Number: " + String.valueOf(User_Registration.phoneNoTxt.getText()));
            Receipt12.AmountPaid.setText("Amount Paid: ₱" + AmountPay );
            Receipt12.OrderTotalAmount.setText("Total Order: ₱" + pos.TotalTxt.getText());
            Receipt12.Change.setText("Change: ₱" + n);
            Receipt12.ReceiptTable.setModel(model); */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void amountPayTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountPayTxtKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isJavaIdentifierStart(c)) {
            amountPayTxt.setEditable(false);
        } else {
            amountPayTxt.setEditable(true);
        }
    }//GEN-LAST:event_amountPayTxtKeyPressed

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
            java.util.logging.Logger.getLogger(CheckOut12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel PayOrderTotalAmount;
    public static javax.swing.JTextField amountPayTxt;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel userNameWelcome;
    // End of variables declaration//GEN-END:variables
}