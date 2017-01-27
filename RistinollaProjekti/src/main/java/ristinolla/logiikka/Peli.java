package ristinolla.logiikka;

import javax.swing.JOptionPane;
import ristinolla.kayttaja.Pelaaja;

public class Peli {

    private String vuorossa;
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;

    public Peli() { //esimerkiksi kolme kokoa; 3x3, 6x6 ja 9x9
        this.pelaaja1 = null;
        this.pelaaja2 = null;
        this.vuorossa = "X";
    }

    public void setPelaaja1(Pelaaja eka) {
        this.pelaaja1 = eka;
    }

    public void setPelaaja2(Pelaaja toka) {
        this.pelaaja1 = toka;
    }

    public void kenenVuoro() {
        if (this.vuorossa.equalsIgnoreCase("X")) {
            this.vuorossa = "O";
        } else {
            this.vuorossa = "X";
        }
    }

    public void tasaPeli() {
        JOptionPane.showMessageDialog(null, "Tasapeli!", "Tasapeli!", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getVuoro() {
        return this.vuorossa;
    }

    public void xVoittaa() {
        JOptionPane.showMessageDialog(null, this.pelaaja1 + " voittaa!", "Voitto!", JOptionPane.INFORMATION_MESSAGE);
    }

    public void yVoittaa() {
        JOptionPane.showMessageDialog(null, this.pelaaja2 + " voittaa!", "Voitto!", JOptionPane.INFORMATION_MESSAGE);
    }

}
