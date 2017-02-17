package ristinolla.gui;

import java.awt.Color;
import ristinolla.kayttaja.Pelaaja;
import ristinolla.logiikka.Peli;

public class RistinollaLauta2 extends javax.swing.JFrame {

    private Peli uusiPeli;

    public RistinollaLauta2(Pelaaja pelaaja1, Pelaaja pelaaja2) {
        uusiPeli = new Peli(pelaaja1, pelaaja2);
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        info.setText(uusiPeli.informaatio());

    }

    public boolean pelinVoitto() {
        return true;
    }

    private void tasaPeli() {
        if (jButton1.getText() != "" && jButton2.getText() != "" && jButton3.getText() != "" && jButton4.getText() != "" && jButton5.getText() != "" && jButton6.getText() != "" && jButton7.getText() != "" && jButton8.getText() != "" && jButton9.getText() != ""
                && jButton10.getText() != "" && jButton11.getText() != "" && jButton12.getText() != "" && jButton13.getText() != "" && jButton14.getText() != "" && jButton15.getText() != "" && jButton16.getText() != "" && jButton17.getText() != "" && jButton18.getText() != ""
                && jButton19.getText() != "" && jButton20.getText() != "" && jButton21.getText() != "" && jButton22.getText() != "" && jButton23.getText() != "" && jButton24.getText() != "" && jButton25.getText() != "" && jButton26.getText() != "" && jButton27.getText() != ""
                && jButton28.getText() != "" && jButton29.getText() != "" && jButton30.getText() != "" && jButton31.getText() != "" && jButton32.getText() != "" && jButton33.getText() != "" && jButton34.getText() != "" && jButton35.getText() != "" && jButton36.getText() != "") {
            uusiPeli.tasaPeli();
            laudanResetointi();
        }
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
        jButton10.setText("");
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        jButton14.setText("");
        jButton15.setText("");
        jButton16.setText("");
        jButton17.setText("");
        jButton18.setText("");
        jButton19.setText("");
        jButton20.setText("");
        jButton21.setText("");
        jButton22.setText("");
        jButton23.setText("");
        jButton24.setText("");
        jButton25.setText("");
        jButton26.setText("");
        jButton27.setText("");
        jButton28.setText("");
        jButton29.setText("");
        jButton30.setText("");
        jButton31.setText("");
        jButton32.setText("");
        jButton33.setText("");
        jButton34.setText("");
        jButton35.setText("");
        jButton36.setText("");
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
        ruutu10 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        ruutu11 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        ruutu12 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        ruutu13 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        ruutu14 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        ruutu15 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        ruutu16 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        ruutu17 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        ruutu18 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        ruutu19 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        ruutu20 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        ruutu21 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        ruutu22 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        ruutu23 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        ruutu24 = new javax.swing.JPanel();
        jButton24 = new javax.swing.JButton();
        ruutu25 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        ruutu26 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        ruutu27 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        ruutu28 = new javax.swing.JPanel();
        jButton28 = new javax.swing.JButton();
        ruutu29 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        ruutu30 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        ruutu31 = new javax.swing.JPanel();
        jButton31 = new javax.swing.JButton();
        ruutu32 = new javax.swing.JPanel();
        jButton32 = new javax.swing.JButton();
        ruutu33 = new javax.swing.JPanel();
        jButton33 = new javax.swing.JButton();
        ruutu34 = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        ruutu35 = new javax.swing.JPanel();
        jButton35 = new javax.swing.JButton();
        ruutu36 = new javax.swing.JPanel();
        jButton36 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ristinolla");

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        info.setText("Informaatio");
        jPanel1.add(info, java.awt.BorderLayout.PAGE_END);

        ruudukko.setBackground(java.awt.Color.gray);
        ruudukko.setLayout(new java.awt.GridLayout(6, 6, 1, 1));

        ruutu1.setBackground(java.awt.Color.white);
        ruutu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ruutu1.add(jButton1, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu1);

        ruutu2.setBackground(java.awt.Color.white);
        ruutu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ruutu2.add(jButton2, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu2);

        ruutu3.setBackground(java.awt.Color.white);
        ruutu3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ruutu3.add(jButton3, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu3);

        ruutu4.setBackground(java.awt.Color.white);
        ruutu4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ruutu4.add(jButton4, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu4);

        ruutu5.setBackground(java.awt.Color.white);
        ruutu5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        ruutu5.add(jButton5, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu5);

        ruutu6.setBackground(java.awt.Color.white);
        ruutu6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        ruutu6.add(jButton6, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu6);

        ruutu7.setBackground(java.awt.Color.white);
        ruutu7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        ruutu7.add(jButton7, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu7);

        ruutu8.setBackground(java.awt.Color.white);
        ruutu8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        ruutu8.add(jButton8, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu8);

        ruutu9.setBackground(java.awt.Color.white);
        ruutu9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        ruutu9.add(jButton9, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu9);

        ruutu10.setBackground(java.awt.Color.white);
        ruutu10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu10.setLayout(new java.awt.BorderLayout());

        jButton10.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        ruutu10.add(jButton10, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu10);

        ruutu11.setBackground(java.awt.Color.white);
        ruutu11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu11.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        ruutu11.add(jButton11, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu11);

        ruutu12.setBackground(java.awt.Color.white);
        ruutu12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu12.setLayout(new java.awt.BorderLayout());

        jButton12.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        ruutu12.add(jButton12, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu12);

        ruutu13.setBackground(java.awt.Color.white);
        ruutu13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu13.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        ruutu13.add(jButton13, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu13);

        ruutu14.setBackground(java.awt.Color.white);
        ruutu14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu14.setLayout(new java.awt.BorderLayout());

        jButton14.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        ruutu14.add(jButton14, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu14);

        ruutu15.setBackground(java.awt.Color.white);
        ruutu15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu15.setLayout(new java.awt.BorderLayout());

        jButton15.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        ruutu15.add(jButton15, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu15);

        ruutu16.setBackground(java.awt.Color.white);
        ruutu16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu16.setLayout(new java.awt.BorderLayout());

        jButton16.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        ruutu16.add(jButton16, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu16);

        ruutu17.setBackground(java.awt.Color.white);
        ruutu17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu17.setLayout(new java.awt.BorderLayout());

        jButton17.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        ruutu17.add(jButton17, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu17);

        ruutu18.setBackground(java.awt.Color.white);
        ruutu18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu18.setLayout(new java.awt.BorderLayout());

        jButton18.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        ruutu18.add(jButton18, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu18);

        ruutu19.setBackground(java.awt.Color.white);
        ruutu19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu19.setLayout(new java.awt.BorderLayout());

        jButton19.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        ruutu19.add(jButton19, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu19);

        ruutu20.setBackground(java.awt.Color.white);
        ruutu20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu20.setLayout(new java.awt.BorderLayout());

        jButton20.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        ruutu20.add(jButton20, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu20);

        ruutu21.setBackground(java.awt.Color.white);
        ruutu21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu21.setLayout(new java.awt.BorderLayout());

        jButton21.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        ruutu21.add(jButton21, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu21);

        ruutu22.setBackground(java.awt.Color.white);
        ruutu22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu22.setLayout(new java.awt.BorderLayout());

        jButton22.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        ruutu22.add(jButton22, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu22);

        ruutu23.setBackground(java.awt.Color.white);
        ruutu23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu23.setLayout(new java.awt.BorderLayout());

        jButton23.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        ruutu23.add(jButton23, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu23);

        ruutu24.setBackground(java.awt.Color.white);
        ruutu24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu24.setLayout(new java.awt.BorderLayout());

        jButton24.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        ruutu24.add(jButton24, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu24);

        ruutu25.setBackground(java.awt.Color.white);
        ruutu25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu25.setLayout(new java.awt.BorderLayout());

        jButton25.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        ruutu25.add(jButton25, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu25);

        ruutu26.setBackground(java.awt.Color.white);
        ruutu26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu26.setLayout(new java.awt.BorderLayout());

        jButton26.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        ruutu26.add(jButton26, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu26);

        ruutu27.setBackground(java.awt.Color.white);
        ruutu27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu27.setLayout(new java.awt.BorderLayout());

        jButton27.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        ruutu27.add(jButton27, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu27);

        ruutu28.setBackground(java.awt.Color.white);
        ruutu28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu28.setLayout(new java.awt.BorderLayout());

        jButton28.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        ruutu28.add(jButton28, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu28);

        ruutu29.setBackground(java.awt.Color.white);
        ruutu29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu29.setLayout(new java.awt.BorderLayout());

        jButton29.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        ruutu29.add(jButton29, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu29);

        ruutu30.setBackground(java.awt.Color.white);
        ruutu30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu30.setLayout(new java.awt.BorderLayout());

        jButton30.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        ruutu30.add(jButton30, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu30);

        ruutu31.setBackground(java.awt.Color.white);
        ruutu31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu31.setLayout(new java.awt.BorderLayout());

        jButton31.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        ruutu31.add(jButton31, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu31);

        ruutu32.setBackground(java.awt.Color.white);
        ruutu32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu32.setLayout(new java.awt.BorderLayout());

        jButton32.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        ruutu32.add(jButton32, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu32);

        ruutu33.setBackground(java.awt.Color.white);
        ruutu33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu33.setLayout(new java.awt.BorderLayout());

        jButton33.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        ruutu33.add(jButton33, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu33);

        ruutu34.setBackground(java.awt.Color.white);
        ruutu34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu34.setLayout(new java.awt.BorderLayout());

        jButton34.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        ruutu34.add(jButton34, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu34);

        ruutu35.setBackground(java.awt.Color.white);
        ruutu35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu35.setLayout(new java.awt.BorderLayout());

        jButton35.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        ruutu35.add(jButton35, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu35);

        ruutu36.setBackground(java.awt.Color.white);
        ruutu36.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruutu36.setLayout(new java.awt.BorderLayout());

        jButton36.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        ruutu36.add(jButton36, java.awt.BorderLayout.CENTER);

        ruudukko.add(ruutu36);

        jPanel1.add(ruudukko, java.awt.BorderLayout.CENTER);

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
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton1ActionPerformed

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
        info.setText(uusiPeli.informaatio());
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
        info.setText(uusiPeli.informaatio());
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
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton4ActionPerformed

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
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton5ActionPerformed

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
        info.setText(uusiPeli.informaatio());
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
        info.setText(uusiPeli.informaatio());
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
        info.setText(uusiPeli.informaatio());
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
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (jButton10.getText().equalsIgnoreCase("")) {
            jButton10.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton10.setForeground(Color.red);
            } else {
                jButton10.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (jButton11.getText().equalsIgnoreCase("")) {
            jButton11.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton11.setForeground(Color.red);
            } else {
                jButton11.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (jButton12.getText().equalsIgnoreCase("")) {
            jButton12.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton12.setForeground(Color.red);
            } else {
                jButton12.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (jButton13.getText().equalsIgnoreCase("")) {
            jButton13.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton13.setForeground(Color.red);
            } else {
                jButton13.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (jButton14.getText().equalsIgnoreCase("")) {
            jButton14.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton14.setForeground(Color.red);
            } else {
                jButton14.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if (jButton15.getText().equalsIgnoreCase("")) {
            jButton15.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton15.setForeground(Color.red);
            } else {
                jButton15.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (jButton16.getText().equalsIgnoreCase("")) {
            jButton16.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton16.setForeground(Color.red);
            } else {
                jButton16.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if (jButton17.getText().equalsIgnoreCase("")) {
            jButton17.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton17.setForeground(Color.red);
            } else {
                jButton17.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if (jButton18.getText().equalsIgnoreCase("")) {
            jButton18.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton18.setForeground(Color.red);
            } else {
                jButton18.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if (jButton19.getText().equalsIgnoreCase("")) {
            jButton19.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton19.setForeground(Color.red);
            } else {
                jButton19.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if (jButton20.getText().equalsIgnoreCase("")) {
            jButton20.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton20.setForeground(Color.red);
            } else {
                jButton20.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        if (jButton21.getText().equalsIgnoreCase("")) {
            jButton21.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton21.setForeground(Color.red);
            } else {
                jButton21.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if (jButton22.getText().equalsIgnoreCase("")) {
            jButton22.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton22.setForeground(Color.red);
            } else {
                jButton22.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if (jButton23.getText().equalsIgnoreCase("")) {
            jButton23.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton23.setForeground(Color.red);
            } else {
                jButton23.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        if (jButton24.getText().equalsIgnoreCase("")) {
            jButton24.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton24.setForeground(Color.red);
            } else {
                jButton24.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        if (jButton25.getText().equalsIgnoreCase("")) {
            jButton25.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton25.setForeground(Color.red);
            } else {
                jButton25.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        if (jButton26.getText().equalsIgnoreCase("")) {
            jButton26.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton26.setForeground(Color.red);
            } else {
                jButton26.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        if (jButton27.getText().equalsIgnoreCase("")) {
            jButton27.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton27.setForeground(Color.red);
            } else {
                jButton27.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        if (jButton28.getText().equalsIgnoreCase("")) {
            jButton28.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton28.setForeground(Color.red);
            } else {
                jButton28.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        if (jButton29.getText().equalsIgnoreCase("")) {
            jButton29.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton29.setForeground(Color.red);
            } else {
                jButton29.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        if (jButton30.getText().equalsIgnoreCase("")) {
            jButton30.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton30.setForeground(Color.red);
            } else {
                jButton30.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        if (jButton31.getText().equalsIgnoreCase("")) {
            jButton31.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton31.setForeground(Color.red);
            } else {
                jButton31.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        if (jButton32.getText().equalsIgnoreCase("")) {
            jButton32.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton32.setForeground(Color.red);
            } else {
                jButton32.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        if (jButton33.getText().equalsIgnoreCase("")) {
            jButton33.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton33.setForeground(Color.red);
            } else {
                jButton33.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        if (jButton34.getText().equalsIgnoreCase("")) {
            jButton34.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton34.setForeground(Color.red);
            } else {
                jButton34.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        if (jButton35.getText().equalsIgnoreCase("")) {
            jButton35.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton35.setForeground(Color.red);
            } else {
                jButton35.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        if (jButton36.getText().equalsIgnoreCase("")) {
            jButton36.setText(uusiPeli.getVuoro());
            if (uusiPeli.getVuoro().equalsIgnoreCase("X")) {
                jButton36.setForeground(Color.red);
            } else {
                jButton36.setForeground(Color.blue);
            }
            uusiPeli.kenenVuoro();
        }
        if (pelinVoitto()) {
            laudanResetointi();
        }
        tasaPeli();
        info.setText(uusiPeli.informaatio());
    }//GEN-LAST:event_jButton36ActionPerformed

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
//            java.util.logging.Logger.getLogger(RistinollaLauta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RistinollaLauta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RistinollaLauta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RistinollaLauta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RistinollaLauta2().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel ruudukko;
    private javax.swing.JPanel ruutu1;
    private javax.swing.JPanel ruutu10;
    private javax.swing.JPanel ruutu11;
    private javax.swing.JPanel ruutu12;
    private javax.swing.JPanel ruutu13;
    private javax.swing.JPanel ruutu14;
    private javax.swing.JPanel ruutu15;
    private javax.swing.JPanel ruutu16;
    private javax.swing.JPanel ruutu17;
    private javax.swing.JPanel ruutu18;
    private javax.swing.JPanel ruutu19;
    private javax.swing.JPanel ruutu2;
    private javax.swing.JPanel ruutu20;
    private javax.swing.JPanel ruutu21;
    private javax.swing.JPanel ruutu22;
    private javax.swing.JPanel ruutu23;
    private javax.swing.JPanel ruutu24;
    private javax.swing.JPanel ruutu25;
    private javax.swing.JPanel ruutu26;
    private javax.swing.JPanel ruutu27;
    private javax.swing.JPanel ruutu28;
    private javax.swing.JPanel ruutu29;
    private javax.swing.JPanel ruutu3;
    private javax.swing.JPanel ruutu30;
    private javax.swing.JPanel ruutu31;
    private javax.swing.JPanel ruutu32;
    private javax.swing.JPanel ruutu33;
    private javax.swing.JPanel ruutu34;
    private javax.swing.JPanel ruutu35;
    private javax.swing.JPanel ruutu36;
    private javax.swing.JPanel ruutu4;
    private javax.swing.JPanel ruutu5;
    private javax.swing.JPanel ruutu6;
    private javax.swing.JPanel ruutu7;
    private javax.swing.JPanel ruutu8;
    private javax.swing.JPanel ruutu9;
    // End of variables declaration//GEN-END:variables
}
