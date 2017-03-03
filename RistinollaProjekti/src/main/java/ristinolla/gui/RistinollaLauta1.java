package ristinolla.gui;

import java.awt.Color;
import javax.swing.JButton;
import ristinolla.kayttaja.Pelaaja;
import ristinolla.logiikka.Merkki;
import ristinolla.logiikka.Peli;

public class RistinollaLauta1 extends javax.swing.JFrame {

    private Peli uusiPeli;

    public RistinollaLauta1(Pelaaja pelaaja1, Pelaaja pelaaja2) {
        uusiPeli = new Peli(pelaaja1, pelaaja2);
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        info.setText(uusiPeli.informaatio());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        info = new javax.swing.JLabel();
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

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ristinolla");
        setForeground(java.awt.Color.lightGray);

        jPanel1.setBackground(java.awt.Color.red);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.BorderLayout());

        info.setForeground(java.awt.Color.black);
        info.setText("Informaatio");
        jPanel1.add(info, java.awt.BorderLayout.PAGE_END);

        Ruudukko.setBackground(java.awt.Color.gray);
        Ruudukko.setForeground(java.awt.Color.black);
        Ruudukko.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        ruutu1.setBackground(java.awt.Color.red);
        ruutu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu1.setForeground(java.awt.Color.lightGray);
        ruutu1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ruutu1.add(jButton1, java.awt.BorderLayout.CENTER);

        Ruudukko.add(ruutu1);

        ruutu2.setBackground(java.awt.Color.red);
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

        ruutu3.setBackground(java.awt.Color.red);
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

        ruutu4.setBackground(java.awt.Color.red);
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

        ruutu5.setBackground(java.awt.Color.red);
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

        ruutu6.setBackground(java.awt.Color.red);
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

        ruutu7.setBackground(java.awt.Color.red);
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

        ruutu8.setBackground(java.awt.Color.red);
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

        ruutu9.setBackground(java.awt.Color.red);
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
        uusiPeli.laudanResetointi();
    }

    private void peli(JButton nappi, int x, int y) {
        if (uusiPeli.getMerkkitaulu()[x][y] == null) {

            if (uusiPeli.getVuoro() == Merkki.RISTI) {
                nappi.setForeground(Color.red);
            } else {
                nappi.setForeground(Color.blue);
            }
            nappi.setText(uusiPeli.asetaMerkki(x, y).toString());
            if (uusiPeli.pelinTarkastus()) {
                laudanResetointi();
            }
            uusiPeli.vaihdaVuoro();
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        peli(jButton1, 0, 0);
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        peli(jButton5, 1, 1);
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        peli(jButton2, 0, 1);
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        peli(jButton3, 0, 2);
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        peli(jButton4, 1, 0);
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        peli(jButton6, 1, 2);
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        peli(jButton7, 2, 0);
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        peli(jButton8, 2, 1);
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        peli(jButton9, 2, 2);
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ruudukko;
    private javax.swing.JLabel info;
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
