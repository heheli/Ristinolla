package ristinolla.gui;


import ristinolla.kayttaja.Pelaaja;

public class Main {
 
    public static void main(String[] args) {
        Pelaaja x = new Pelaaja("Pertti");
        Pelaaja y = new Pelaaja("Jonne");
        kaynnista(1, x, y);
    }

    public static void kaynnista(int peli, Pelaaja x, Pelaaja y) {
        if (peli == 1) {
            RistinollaLauta1 lauta1 = new RistinollaLauta1(x, y);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    lauta1.setVisible(true);
                }
            });
        } else if (peli == 2) {
            RistinollaLauta2 lauta2 = new RistinollaLauta2(x, y);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    lauta2.setVisible(true);
                }
            });
        } else if (peli == 3) {
            RistinollaLauta3 lauta3 = new RistinollaLauta3(x, y);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    lauta3.setVisible(true);
                }
            });
        }
    }

}
