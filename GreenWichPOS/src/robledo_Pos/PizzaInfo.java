/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package robledo_Pos;

/**
 *
 * @author roble
 */
public class PizzaInfo extends javax.swing.JFrame {

    /**
     * Creates new form AccountDetails
     */
    public PizzaInfo() {
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
        pizzainfoName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pizzainfoLab = new javax.swing.JLabel();
        pizzainfoPic = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pizza Description");
        setBackground(new java.awt.Color(0, 175, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(68, 142, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pizzainfoName.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        pizzainfoName.setForeground(new java.awt.Color(255, 255, 255));
        pizzainfoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(pizzainfoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 300, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/COPY OF BLACK  FOR CREDENTIAL.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 40));

        pizzainfoLab.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        pizzainfoLab.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(pizzainfoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 310, 120));

        pizzainfoPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza images/1.png"))); // NOI18N
        jPanel1.add(pizzainfoPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 35, 190, 130));

        jButton1.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setBackground(new java.awt.Color(8, 8, 8));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 300, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG2.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, 400, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

hide();
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
            java.util.logging.Logger.getLogger(PizzaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PizzaInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel pizzainfoLab;
    public static javax.swing.JLabel pizzainfoName;
    public static javax.swing.JLabel pizzainfoPic;
    // End of variables declaration//GEN-END:variables
}
