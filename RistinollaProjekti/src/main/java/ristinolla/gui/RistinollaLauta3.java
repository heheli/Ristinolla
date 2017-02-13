package ristinolla.gui;

import java.awt.Color;
import ristinolla.kayttaja.Pelaaja;
import ristinolla.logiikka.Merkki;
import ristinolla.logiikka.Peli;

public class RistinollaLauta3 extends javax.swing.JFrame {

    private Peli uusiPeli;

    public RistinollaLauta3(Pelaaja pelaaja1, Pelaaja pelaaja2) {
        uusiPeli = new Peli(pelaaja1, pelaaja2);
        uusiPeli.laudanResetointi();
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        info.setText(uusiPeli.informaatio());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        info = new javax.swing.JLabel();
        ruudukko = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ristinolla");

        jPanel1.setBackground(java.awt.Color.blue);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        info.setBackground(java.awt.Color.lightGray);
        info.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        info.setForeground(new java.awt.Color(254, 254, 254));
        info.setText("Informaatio");
        jPanel1.add(info, java.awt.BorderLayout.PAGE_END);

        ruudukko.setForeground(new java.awt.Color(1, 0, 1));
        ruudukko.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        ruutu1.setBackground(java.awt.Color.blue);
        ruutu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ruutu1.add(jButton1, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu1);

        ruutu2.setBackground(java.awt.Color.blue);
        ruutu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ruutu2.add(jButton2, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu2);

        ruutu3.setBackground(java.awt.Color.blue);
        ruutu3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ruutu3.add(jButton3, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu3);

        ruutu4.setBackground(java.awt.Color.blue);
        ruutu4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ruutu4.add(jButton4, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu4);

        ruutu5.setBackground(java.awt.Color.blue);
        ruutu5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        ruutu5.add(jButton5, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu5);

        ruutu6.setBackground(java.awt.Color.blue);
        ruutu6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        ruutu6.add(jButton6, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu6);

        ruutu7.setBackground(java.awt.Color.blue);
        ruutu7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        ruutu7.add(jButton7, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu7);

        ruutu8.setBackground(java.awt.Color.blue);
        ruutu8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        ruutu8.add(jButton8, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu8);

        ruutu9.setBackground(java.awt.Color.blue);
        ruutu9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        ruutu9.add(jButton9, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu9);

        jPanel1.add(ruudukko, java.awt.BorderLayout.CENTER);

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (uusiPeli.getMerkkitaulu()[0][1] == null) {

            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                uusiPeli.getMerkkitaulu()[0][1] = Merkki.RISTI;
                jButton2.setForeground(Color.red);
            } else {
                uusiPeli.getMerkkitaulu()[0][1] = Merkki.NOLLA;
                jButton2.setForeground(Color.blue);
            }
            jButton2.setText(uusiPeli.getVuoro());
            uusiPeli.kenenVuoro();
            if (uusiPeli.pelinTarkastus()) {
                laudanResetointi();
            }
        }
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (uusiPeli.getMerkkitaulu()[0][0] == null) {

            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                uusiPeli.getMerkkitaulu()[0][0] = Merkki.RISTI;
                jButton1.setForeground(Color.red);
            } else {
                uusiPeli.getMerkkitaulu()[0][0] = Merkki.NOLLA;
                jButton1.setForeground(Color.blue);
            }
            jButton1.setText(uusiPeli.getVuoro());
            uusiPeli.kenenVuoro();
            if (uusiPeli.pelinTarkastus()) {
                laudanResetointi();
            }
        }
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (uusiPeli.getMerkkitaulu()[0][2] == null) {

            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                uusiPeli.getMerkkitaulu()[0][2] = Merkki.RISTI;
                jButton3.setForeground(Color.red);
            } else {
                uusiPeli.getMerkkitaulu()[0][2] = Merkki.NOLLA;
                jButton3.setForeground(Color.blue);
            }
            jButton3.setText(uusiPeli.getVuoro());
            uusiPeli.kenenVuoro();
            if (uusiPeli.pelinTarkastus()) {
                laudanResetointi();
            }
        }
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (uusiPeli.getMerkkitaulu()[1][0] == null) {

            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                uusiPeli.getMerkkitaulu()[1][0] = Merkki.RISTI;
                jButton4.setForeground(Color.red);
            } else {
                uusiPeli.getMerkkitaulu()[1][0] = Merkki.NOLLA;
                jButton4.setForeground(Color.blue);
            }
            jButton4.setText(uusiPeli.getVuoro());
            uusiPeli.kenenVuoro();
            if (uusiPeli.pelinTarkastus()) {
                laudanResetointi();
            }
        }
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (uusiPeli.getMerkkitaulu()[1][1] == null) {

            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                uusiPeli.getMerkkitaulu()[1][1] = Merkki.RISTI;
                jButton5.setForeground(Color.red);
            } else {
                uusiPeli.getMerkkitaulu()[1][1] = Merkki.NOLLA;
                jButton5.setForeground(Color.blue);
            }
            jButton5.setText(uusiPeli.getVuoro());
            uusiPeli.kenenVuoro();
            if (uusiPeli.pelinTarkastus()) {
                laudanResetointi();
            }
        }
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (uusiPeli.getMerkkitaulu()[1][2] == null) {

            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                uusiPeli.getMerkkitaulu()[1][2] = Merkki.RISTI;
                jButton6.setForeground(Color.red);
            } else {
                uusiPeli.getMerkkitaulu()[1][2] = Merkki.NOLLA;
                jButton6.setForeground(Color.blue);
            }
            jButton6.setText(uusiPeli.getVuoro());
            uusiPeli.kenenVuoro();
            if (uusiPeli.pelinTarkastus()) {
                laudanResetointi();
            }
        }
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (uusiPeli.getMerkkitaulu()[2][0] == null) {

            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                uusiPeli.getMerkkitaulu()[2][0] = Merkki.RISTI;
                jButton7.setForeground(Color.red);
            } else {
                uusiPeli.getMerkkitaulu()[2][0] = Merkki.NOLLA;
                jButton7.setForeground(Color.blue);
            }
            jButton7.setText(uusiPeli.getVuoro());
            uusiPeli.kenenVuoro();
            if (uusiPeli.pelinTarkastus()) {
                laudanResetointi();
            }
        }
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (uusiPeli.getMerkkitaulu()[2][1] == null) {

            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                uusiPeli.getMerkkitaulu()[2][1] = Merkki.RISTI;
                jButton8.setForeground(Color.red);
            } else {
                uusiPeli.getMerkkitaulu()[2][1] = Merkki.NOLLA;
                jButton8.setForeground(Color.blue);
            }
            jButton8.setText(uusiPeli.getVuoro());
            uusiPeli.kenenVuoro();
            if (uusiPeli.pelinTarkastus()) {
                laudanResetointi();
            }
        }
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (uusiPeli.getMerkkitaulu()[2][2] == null) {

            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                uusiPeli.getMerkkitaulu()[2][2] = Merkki.RISTI;
                jButton9.setForeground(Color.red);
            } else {
                uusiPeli.getMerkkitaulu()[2][2] = Merkki.NOLLA;
                jButton9.setForeground(Color.blue);
            }
            jButton9.setText(uusiPeli.getVuoro());
            uusiPeli.kenenVuoro();
            if (uusiPeli.pelinTarkastus()) {
                laudanResetointi();
            }
        }
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel ruudukko;
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
