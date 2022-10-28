
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;

public class Midterm_Exam extends javax.swing.JFrame {

    Timer timer, sdtimer;
    int lottotype, sdlottotype;
    int loopnum, sdloopnum;

    public Midterm_Exam() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton642 = new javax.swing.JButton();
        jButton645 = new javax.swing.JButton();
        jButton649 = new javax.swing.JButton();
        jButton655 = new javax.swing.JButton();
        jButton658 = new javax.swing.JButton();
        jButton6Digit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButtonExit = new javax.swing.JButton();
        jLabelGenerate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PCSO LOTTO NUMBER GENERATOR");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PCSO1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jButton642.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/s4222.png"))); // NOI18N
        jButton642.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton642ActionPerformed(evt);
            }
        });

        jButton645.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/645.jpg"))); // NOI18N
        jButton645.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton645ActionPerformed(evt);
            }
        });

        jButton649.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/s49.jpg"))); // NOI18N
        jButton649.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton649ActionPerformed(evt);
            }
        });

        jButton655.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/s552.jpg"))); // NOI18N
        jButton655.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton655ActionPerformed(evt);
            }
        });

        jButton658.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/s58.png"))); // NOI18N
        jButton658.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton658ActionPerformed(evt);
            }
        });

        jButton6Digit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ph-6digit-lotto.png"))); // NOI18N
        jButton6Digit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6DigitActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField6.setBackground(new java.awt.Color(0, 0, 0));
        jTextField6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit-removebg-preview.png"))); // NOI18N
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabelGenerate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelGenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R.jpg"))); // NOI18N
        jLabelGenerate.setText("CLICK THE LOGO TO GENERATE NUMBER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton642, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton645, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton649, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton655, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton658, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6Digit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton642, jButton645, jButton649, jButton655, jButton658, jButton6Digit});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton649, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton642, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton645, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton655, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton658, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6Digit, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton649, jButton655, jButton658, jButton6Digit});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton642ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton642ActionPerformed
        lottotype = 43;
        timeraction();
        loopnum = 0;
        timer.start();
        jLabelGenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/s4222.png")));
        jLabelGenerate.setText("6/42 Generated Number");
    }//GEN-LAST:event_jButton642ActionPerformed

    private void jButton645ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton645ActionPerformed
        lottotype = 46;
        timeraction();
        loopnum = 0;
        timer.start();
        jLabelGenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/645.jpg")));
        jLabelGenerate.setText("6/45 Generated Number");
    }//GEN-LAST:event_jButton645ActionPerformed

    private void jButton649ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton649ActionPerformed
        lottotype = 50;
        timeraction();
        loopnum = 0;
        timer.start();
        jLabelGenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/s49.jpg")));
        jLabelGenerate.setText("6/49 Generated Number");
    }//GEN-LAST:event_jButton649ActionPerformed

    private void jButton655ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton655ActionPerformed
        lottotype = 56;
        timeraction();
        loopnum = 0;
        timer.start();
        jLabelGenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/s552.jpg")));
        jLabelGenerate.setText("6/55 Generated Number");
    }//GEN-LAST:event_jButton655ActionPerformed

    private void jButton658ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton658ActionPerformed
        lottotype = 59;
        timeraction();
        loopnum = 0;
        timer.start();
        jLabelGenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/s58.png")));
        jLabelGenerate.setText("6/58 Generated Number");
    }//GEN-LAST:event_jButton658ActionPerformed

    private void jButton6DigitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6DigitActionPerformed
       sdlottotype = 10;
        sdtimeraction();
        sdloopnum = 0;
        sdtimer.start();
        jLabelGenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ph-6digit-lotto.png")));
        jLabelGenerate.setText("6 Digit Generated Number");
    }//GEN-LAST:event_jButton6DigitActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed
    void generate_num() {
        int[] lottonum = new int[lottotype];
        Random rand = new Random();
        for (int i = 1; i < lottonum.length; i++) {
            lottonum[i] = i;
        }

        for (int a = 1; a < lottonum.length; a++) {
            int randomIndexToSwap = rand.nextInt(lottonum.length);
            if (randomIndexToSwap == 0) {
                randomIndexToSwap++;
            }
            int temp = lottonum[randomIndexToSwap];
            lottonum[randomIndexToSwap] = lottonum[a];
            lottonum[a] = temp;
        }
        jTextField1.setText(Integer.toString(lottonum[1]));
        jTextField2.setText(Integer.toString(lottonum[2]));
        jTextField3.setText(Integer.toString(lottonum[3]));
        jTextField4.setText(Integer.toString(lottonum[4]));
        jTextField5.setText(Integer.toString(lottonum[5]));
        jTextField6.setText(Integer.toString(lottonum[6]));
        loopnum++;
        if (loopnum == 25) {
            timer.stop();
        }
    }

    void timeraction() {
        timer = new Timer(7, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generate_num();
            }
        });
    }

    void six_digit() {
        int[] sdlottonum = new int[sdlottotype];
        Random rand = new Random();
        for (int i = 0; i < sdlottonum.length; i++) {
            sdlottonum[i] = i;
        }

        for (int a = 0; a < sdlottonum.length; a++) {
            int randomIndexToSwap = rand.nextInt(sdlottonum.length);
            sdlottonum[randomIndexToSwap] = sdlottonum[a];
            
        }
        jTextField1.setText(Integer.toString(sdlottonum[1]));
        jTextField2.setText(Integer.toString(sdlottonum[2]));
        jTextField3.setText(Integer.toString(sdlottonum[3]));
        jTextField4.setText(Integer.toString(sdlottonum[4]));
        jTextField5.setText(Integer.toString(sdlottonum[5]));
        jTextField6.setText(Integer.toString(sdlottonum[6]));
        sdloopnum++;
        if (sdloopnum == 25) {
            sdtimer.stop();
        }
    }

    void sdtimeraction() {
        sdtimer = new Timer(7, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                six_digit();
            }
        });
    }

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
            java.util.logging.Logger.getLogger(Midterm_Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Midterm_Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Midterm_Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Midterm_Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Midterm_Exam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton642;
    private javax.swing.JButton jButton645;
    private javax.swing.JButton jButton649;
    private javax.swing.JButton jButton655;
    private javax.swing.JButton jButton658;
    private javax.swing.JButton jButton6Digit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelGenerate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
