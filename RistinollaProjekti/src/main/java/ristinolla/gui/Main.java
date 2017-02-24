package ristinolla.gui;

import ristinolla.kayttaja.Pelaaja;

public class Main {

    public static void main(String[] args) {
//        Aloitus uusipeli = new Aloitus();
//        uusipeli.aloita();

        RistinollaLauta1 lauta1 = new RistinollaLauta1(new Pelaaja("X"), new Pelaaja("Y"));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                lauta1.setVisible(true);
            }
        });
    }

}
