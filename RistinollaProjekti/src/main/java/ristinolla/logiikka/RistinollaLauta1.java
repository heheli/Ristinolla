package ristinolla.logiikka;

import java.awt.Color;
import javax.swing.JOptionPane;
import ristinolla.kayttaja.Pelaaja;

public class RistinollaLauta1 extends javax.swing.JFrame {

    private Peli uusiPeli;

    public RistinollaLauta1() {
        this.uusiPeli = new Peli();
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
    }

    private void laudanResetointi() {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
    }


    private boolean pelinVoitto() {
        boolean vastaus = true;
        if (jButton1.getText().equalsIgnoreCase("X") && jButton2.getText().equalsIgnoreCase("X") && jButton3.getText().equalsIgnoreCase("X")) {
            uusiPeli.xVoittaa();
        } else if (jButton4.getText().equalsIgnoreCase("X") && jButton5.getText().equalsIgnoreCase("X") && jButton6.getText().equalsIgnoreCase("X")) {
            uusiPeli.xVoittaa();
        } else if (jButton7.getText().equalsIgnoreCase("X") && jButton8.getText().equalsIgnoreCase("X") && jButton9.getText().equalsIgnoreCase("X")) {
            uusiPeli.xVoittaa();
        } else if (jButton1.getText().equalsIgnoreCase("X") && jButton5.getText().equalsIgnoreCase("X") && jButton9.getText().equalsIgnoreCase("X")) {
            uusiPeli.xVoittaa();
        } else if (jButton3.getText().equalsIgnoreCase("X") && jButton5.getText().equalsIgnoreCase("X") && jButton7.getText().equalsIgnoreCase("X")) {
            uusiPeli.xVoittaa();
        } else if (jButton1.getText().equalsIgnoreCase("X") && jButton4.getText().equalsIgnoreCase("X") && jButton7.getText().equalsIgnoreCase("X")) {
            uusiPeli.xVoittaa();
        } else if (jButton2.getText().equalsIgnoreCase("X") && jButton5.getText().equalsIgnoreCase("X") && jButton8.getText().equalsIgnoreCase("X")) {
            uusiPeli.xVoittaa();
        } else if (jButton3.getText().equalsIgnoreCase("X") && jButton6.getText().equalsIgnoreCase("X") && jButton9.getText().equalsIgnoreCase("X")) {
            uusiPeli.xVoittaa();
        } else if (jButton1.getText().equalsIgnoreCase("O") && jButton2.getText().equalsIgnoreCase("O") && jButton3.getText().equalsIgnoreCase("O")) {
            uusiPeli.yVoittaa();
        } else if (jButton4.getText().equalsIgnoreCase("O") && jButton5.getText().equalsIgnoreCase("O") && jButton6.getText().equalsIgnoreCase("O")) {
            uusiPeli.yVoittaa();
        } else if (jButton7.getText().equalsIgnoreCase("O") && jButton8.getText().equalsIgnoreCase("O") && jButton9.getText().equalsIgnoreCase("O")) {
            uusiPeli.yVoittaa();
        } else if (jButton1.getText().equalsIgnoreCase("O") && jButton5.getText().equalsIgnoreCase("O") && jButton9.getText().equalsIgnoreCase("O")) {
            uusiPeli.yVoittaa();
        } else if (jButton3.getText().equalsIgnoreCase("O") && jButton5.getText().equalsIgnoreCase("O") && jButton7.getText().equalsIgnoreCase("O")) {
            uusiPeli.yVoittaa();
        } else if (jButton1.getText().equalsIgnoreCase("O") && jButton4.getText().equalsIgnoreCase("O") && jButton7.getText().equalsIgnoreCase("O")) {
            uusiPeli.yVoittaa();
        } else if (jButton2.getText().equalsIgnoreCase("O") && jButton5.getText().equalsIgnoreCase("O") && jButton8.getText().equalsIgnoreCase("O")) {
            uusiPeli.yVoittaa();
        } else if (jButton3.getText().equalsIgnoreCase("O") && jButton6.getText().equalsIgnoreCase("O") && jButton9.getText().equalsIgnoreCase("O")) {
            uusiPeli.yVoittaa();
        } else {
            vastaus = false;
        }
        return vastaus;
    }

    private void tasaPeli() {
        if (jButton1.getText() != "" && jButton2.getText() != "" && jButton3.getText() != "" && jButton4.getText() != "" && jButton5.getText() != "" && jButton6.getText() != "" && jButton7.getText() != "" && jButton8.getText() != "" && jButton9.getText() != "") {
            uusiPeli.tasaPeli();
            laudanResetointi();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ruudukko = new javax.swing.JPanel();
        ruutu1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ruutu2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        ruutu3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        ruutu4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        ruutu5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        ruutu6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        ruutu7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        ruutu8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        ruutu9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ristinolla");
        setForeground(java.awt.Color.lightGray);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Informaatio");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_END);

        Ruudukko.setBackground(java.awt.Color.gray);
        Ruudukko.setForeground(java.awt.Color.black);
        Ruudukko.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        ruutu1.setBackground(java.awt.Color.white);
        ruutu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ruutu1.add(jButton1, java.awt.BorderLayout.CENTER);

        Ruudukko.add(ruutu1);

        ruutu2.setBackground(java.awt.Color.white);
        ruutu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ruutu2.add(jButton2, java.awt.BorderLayout.CENTER);

        Ruudukko.add(ruutu2);

        ruutu3.setBackground(java.awt.Color.white);
        ruutu3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ruutu3.add(jButton3, java.awt.BorderLayout.CENTER);

        Ruudukko.add(ruutu3);

        ruutu4.setBackground(java.awt.Color.white);
        ruutu4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ruutu4.add(jButton4, java.awt.BorderLayout.CENTER);

        Ruudukko.add(ruutu4);

        ruutu5.setBackground(java.awt.Color.white);
        ruutu5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        ruutu5.add(jButton5, java.awt.BorderLayout.CENTER);

        Ruudukko.add(ruutu5);

        ruutu6.setBackground(java.awt.Color.white);
        ruutu6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        ruutu6.add(jButton6, java.awt.BorderLayout.CENTER);

        Ruudukko.add(ruutu6);

        ruutu7.setBackground(java.awt.Color.white);
        ruutu7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        ruutu7.add(jButton7, java.awt.BorderLayout.CENTER);

        Ruudukko.add(ruutu7);

        ruutu8.setBackground(java.awt.Color.white);
        ruutu8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        ruutu8.add(jButton8, java.awt.BorderLayout.CENTER);

        Ruudukko.add(ruutu8);

        ruutu9.setBackground(java.awt.Color.white);
        ruutu9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        ruutu9.add(jButton9, java.awt.BorderLayout.CENTER);

        Ruudukko.add(ruutu9);

        jPanel1.add(Ruudukko, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jButton1.getText().equalsIgnoreCase("")) {
            jButton1.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton1.setForeground(Color.red);
            } else {
                jButton1.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }

        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jButton5.getText().equalsIgnoreCase("")) {
            jButton5.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton5.setForeground(Color.red);
            } else {
                jButton5.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jButton2.getText().equalsIgnoreCase("")) {
            jButton2.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton2.setForeground(Color.red);
            } else {
                jButton2.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jButton3.getText().equalsIgnoreCase("")) {
            jButton3.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton3.setForeground(Color.red);
            } else {
                jButton3.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jButton4.getText().equalsIgnoreCase("")) {
            jButton4.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton4.setForeground(Color.red);
            } else {
                jButton4.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jButton6.getText().equalsIgnoreCase("")) {
            jButton6.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton6.setForeground(Color.red);
            } else {
                jButton6.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jButton7.getText().equalsIgnoreCase("")) {
            jButton7.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton7.setForeground(Color.red);
            } else {
                jButton7.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (jButton8.getText().equalsIgnoreCase("")) {
            jButton8.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton8.setForeground(Color.red);
            } else {
                jButton8.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jButton9.getText().equalsIgnoreCase("")) {
            jButton9.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton9.setForeground(Color.red);
            } else {
                jButton9.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
    }//GEN-LAST:event_jButton9ActionPerformed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RistinollaLauta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RistinollaLauta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RistinollaLauta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RistinollaLauta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RistinollaLauta1().setVisible(true);
//            }
//        });
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ruudukko;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel ruutu1;
    private javax.swing.JPanel ruutu2;
    private javax.swing.JPanel ruutu3;
    private javax.swing.JPanel ruutu4;
    private javax.swing.JPanel ruutu5;
    private javax.swing.JPanel ruutu6;
    private javax.swing.JPanel ruutu7;
    private javax.swing.JPanel ruutu8;
    private javax.swing.JPanel ruutu9;
    // End of variables declaration//GEN-END:variables
}
