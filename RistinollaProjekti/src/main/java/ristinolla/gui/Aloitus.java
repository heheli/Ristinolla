package ristinolla.gui;

import com.sun.java.swing.plaf.windows.resources.windows;
import ristinolla.kayttaja.Pelaaja;

public class Aloitus extends javax.swing.JFrame {

    private Pelaaja eka;
    private Pelaaja toka;

    public Aloitus() {
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        this.eka = new Pelaaja();
        this.toka = new Pelaaja();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lauta3 = new javax.swing.JButton();
        Lauta2 = new javax.swing.JButton();
        Lauta1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tervetuloa pelaamaan!");
        setBackground(java.awt.Color.lightGray);
        setForeground(java.awt.Color.lightGray);

        Lauta3.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        Lauta3.setText("3");
        Lauta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lauta3ActionPerformed(evt);
            }
        });

        Lauta2.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        Lauta2.setText("2");
        Lauta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lauta2ActionPerformed(evt);
            }
        });

        Lauta1.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        Lauta1.setText("1");
        Lauta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lauta1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Pelaaja 1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("Pelaaja 2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Tervetuloa pelaamaan ristinollaa! ");

        jLabel2.setText("--------------------------------------------------------");

        jLabel3.setText("Kirjoittakaa pelaajien nimet niille varatuille paikoille.");

        jLabel4.setText("Valitsemalla jonkin  painikkeen 1-3, aloitat uuden pelin.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Lauta1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Lauta2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Lauta3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                .addComponent(jTextField2))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lauta1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lauta2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lauta3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lauta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lauta1ActionPerformed
        setVisible(false);
        this.eka.setNimi(jTextField1.getText());
        this.toka.setNimi(jTextField2.getText());
        RistinollaLauta1 lauta1 = new RistinollaLauta1(this.eka, this.toka);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                lauta1.setVisible(true);
            }
        });

    }//GEN-LAST:event_Lauta1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void Lauta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lauta2ActionPerformed
        setVisible(false);
        this.eka.setNimi(jTextField1.getText());
        this.toka.setNimi(jTextField2.getText());
        RistinollaLauta2 lauta2 = new RistinollaLauta2(this.eka, this.toka);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                lauta2.setVisible(true);
            }
        });
    }//GEN-LAST:event_Lauta2ActionPerformed

    private void Lauta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lauta3ActionPerformed
        setVisible(false);
        this.eka.setNimi(jTextField1.getText());
        this.toka.setNimi(jTextField2.getText());
        RistinollaLauta3 lauta3 = new RistinollaLauta3(this.eka, this.toka);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                lauta3.setVisible(true);
            }
        });

    }//GEN-LAST:event_Lauta3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    public void aloita() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aloitus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Lauta1;
    public javax.swing.JButton Lauta2;
    public javax.swing.JButton Lauta3;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
