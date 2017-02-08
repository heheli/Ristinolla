package ristinolla.logiikka;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import ristinolla.kayttaja.Pelaaja;

public class Peli {

    private String vuorossa;
    public Pelaaja pelaaja1;
    public Pelaaja pelaaja2;

    public Peli(Pelaaja pelaaja1, Pelaaja pelaaja2) { //esimerkiksi kolme kokoa; 3x3, 6x6
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
        this.vuorossa = "X";
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

    public String pelaajanVuoro() {
        if (this.vuorossa.equals("X")) {
            return this.pelaaja1.getNimi();
        }
        return this.pelaaja2.getNimi();
    }

    public void xVoittaa() {
        this.pelaaja1.pelinVoitto();
        JOptionPane.showMessageDialog(null, this.pelaaja1 + " voittaa!", "Voitto!", JOptionPane.INFORMATION_MESSAGE);
    }

    public void yVoittaa() {
        this.pelaaja2.pelinVoitto();
        JOptionPane.showMessageDialog(null, this.pelaaja2 + " voittaa!", "Voitto!", JOptionPane.INFORMATION_MESSAGE);
    }

    public String informaatio() {
        String palautus = "Pelaajan " + this.pelaaja1 + " pisteet: " + this.pelaaja1.getVoitetutPelit() + "            Vuorossa: "
                + pelaajanVuoro() + "               "
                + "Pelaajan " + this.pelaaja2 + " pisteet: " + this.pelaaja2.getVoitetutPelit();
        return palautus;
    }

}
