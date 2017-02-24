package ristinolla.gui;

import javax.swing.JOptionPane;
import ristinolla.kayttaja.Pelaaja;
import ristinolla.logiikka.Merkki;

public abstract class Viestit {

    /**
     * Metodilla tulostetaan viesti, mitä halutaan näkyviin tasapelin tullessa.
     */
    public void tasaPeliViesti() {
        JOptionPane.showMessageDialog(null, "Tasapeli!", "Tasapeli!", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Metodilla tulostetaan viesti, mitä halutaan näkyviin x:n voittaessa.
     *
     * @param eka Pelaaja 1
     */
    public void xVoittaa(Pelaaja eka) {
        eka.pelinVoitto();
        JOptionPane.showMessageDialog(null, eka + " voittaa!", "Voitto!", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Metodilla tulostetaan viesti, mitä halutaan näkyviin o:n voittaessa.
     *
     * @param toka Pelaaja 2
     */
    public void yVoittaa(Pelaaja toka) {
        toka.pelinVoitto();
        JOptionPane.showMessageDialog(null, toka + " voittaa!", "Voitto!", JOptionPane.INFORMATION_MESSAGE);
    }

}
