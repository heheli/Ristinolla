package ristinolla.logiikka;

import javax.swing.JOptionPane;
import ristinolla.kayttaja.Pelaaja;

/**
 * Luokka sisältää pelilautojen logiikkaa.
 */
public class Peli {

    private String vuorossa;
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;

    private Merkki[][] merkkitaulu;

    /**
     * Konstruktori sisältää taulun, jonka avulla seurataan pelin kulkua.
     *
     * @param pelaaja1 Pelaaja 1
     * @param pelaaja2 Pelaaja 2
     */
    public Peli(Pelaaja pelaaja1, Pelaaja pelaaja2) {
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
        this.vuorossa = "X";
        this.merkkitaulu = new Merkki[3][3];
    }

    /**
     * Pelaajan painaessa nappia, tällä metodilla vaihdetaan pelaajan "arvoa".
     */
    public void kenenVuoro() {
        if (this.vuorossa.equalsIgnoreCase("X")) {
            this.vuorossa = "O";
        } else {
            this.vuorossa = "X";
        }
    }

    public Merkki[][] getMerkkitaulu() {
        return this.merkkitaulu;
    }

    /**
     * Metodilla tarkastetaan voittiko x-pelaaja.
     *
     * @return totuusarvo ristin voitosta
     */
    public boolean pelinVoittoX() {
        if (merkkitaulu[0][0] == Merkki.RISTI && merkkitaulu[0][1] == Merkki.RISTI && merkkitaulu[0][2] == Merkki.RISTI) {
            return true;
        } else if (merkkitaulu[1][0] == Merkki.RISTI && merkkitaulu[1][1] == Merkki.RISTI && merkkitaulu[1][2] == Merkki.RISTI) {
            return true;
        } else if (merkkitaulu[2][0] == Merkki.RISTI && merkkitaulu[2][1] == Merkki.RISTI && merkkitaulu[2][2] == Merkki.RISTI) {
            return true;
        } else if (merkkitaulu[0][0] == Merkki.RISTI && merkkitaulu[1][0] == Merkki.RISTI && merkkitaulu[2][0] == Merkki.RISTI) {
            return true;
        } else if (merkkitaulu[0][1] == Merkki.RISTI && merkkitaulu[1][1] == Merkki.RISTI && merkkitaulu[2][1] == Merkki.RISTI) {
            return true;
        } else if (merkkitaulu[0][2] == Merkki.RISTI && merkkitaulu[1][2] == Merkki.RISTI && merkkitaulu[2][2] == Merkki.RISTI) {
            return true;
        } else if (merkkitaulu[2][0] == Merkki.RISTI && merkkitaulu[1][1] == Merkki.RISTI && merkkitaulu[0][2] == Merkki.RISTI) {
            return true;
        } else if (merkkitaulu[0][0] == Merkki.RISTI && merkkitaulu[1][1] == Merkki.RISTI && merkkitaulu[2][2] == Merkki.RISTI) {
            return true;
        }
        return false;
    }

    /**
     * Metodilla tarkastetaan voittiko o-pelaaja.
     *
     * @return totuusarvo nollan voitosta
     */
    public boolean pelinVoittoO() {
        if (merkkitaulu[0][0] == Merkki.NOLLA && merkkitaulu[0][1] == Merkki.NOLLA && merkkitaulu[0][2] == Merkki.NOLLA) {
            return true;
        } else if (merkkitaulu[1][0] == Merkki.NOLLA && merkkitaulu[1][1] == Merkki.NOLLA && merkkitaulu[1][2] == Merkki.NOLLA) {
            return true;
        } else if (merkkitaulu[2][0] == Merkki.NOLLA && merkkitaulu[2][1] == Merkki.NOLLA && merkkitaulu[2][2] == Merkki.NOLLA) {
            return true;
        } else if (merkkitaulu[0][0] == Merkki.NOLLA && merkkitaulu[1][0] == Merkki.NOLLA && merkkitaulu[2][0] == Merkki.NOLLA) {
            return true;
        } else if (merkkitaulu[0][1] == Merkki.NOLLA && merkkitaulu[1][1] == Merkki.NOLLA && merkkitaulu[2][1] == Merkki.NOLLA) {
            return true;
        } else if (merkkitaulu[0][2] == Merkki.NOLLA && merkkitaulu[1][2] == Merkki.NOLLA && merkkitaulu[2][2] == Merkki.NOLLA) {
            return true;
        } else if (merkkitaulu[2][0] == Merkki.NOLLA && merkkitaulu[1][1] == Merkki.NOLLA && merkkitaulu[0][2] == Merkki.NOLLA) {
            return true;
        } else if (merkkitaulu[0][0] == Merkki.NOLLA && merkkitaulu[1][1] == Merkki.NOLLA && merkkitaulu[2][2] == Merkki.NOLLA) {
            return true;
        }
        return false;
    }

    /**
     * Metodilla tarkastetaan tuliko tasapeli.
     *
     * @return totuusarvo tasapelistä
     */
    public boolean tasaPeli() {
        if (merkkitaulu[0][0] == null) {
            return false;
        } else if (merkkitaulu[0][1] == null) {
            return false;
        } else if (merkkitaulu[0][2] == null) {
            return false;
        } else if (merkkitaulu[1][0] == null) {
            return false;
        } else if (merkkitaulu[1][1] == null) {
            return false;
        } else if (merkkitaulu[1][2] == null) {
            return false;
        } else if (merkkitaulu[2][0] == null) {
            return false;
        } else if (merkkitaulu[2][1] == null) {
            return false;
        } else if (merkkitaulu[2][2] == null) {
            return false;
        }
        return true;
    }

    /**
     * Metodi kokoaa kaikki pelin päättymiseen liittyvät metodit, ja palauttaa
     * arvon laudalle.
     *
     * @return totuusarvo sille loppuuko peli
     */
    public boolean pelinTarkastus() {
        if (pelinVoittoX()) {
            xVoittaa();
            return true;
        }
        if (pelinVoittoO()) {
            yVoittaa();
            return true;
        }
        if (tasaPeli()) {
            tasaPeliViesti();
            return true;
        }
        return false;
    }

    /**
     * Resetoidaan taulukon arvot yhden pelin päättyessä.
     */
    public void laudanResetointi() {
        merkkitaulu[0][0] = null;
        merkkitaulu[0][1] = null;
        merkkitaulu[0][2] = null;
        merkkitaulu[1][0] = null;
        merkkitaulu[1][1] = null;
        merkkitaulu[1][2] = null;
        merkkitaulu[2][0] = null;
        merkkitaulu[2][1] = null;
        merkkitaulu[2][2] = null;
    }

    /**
     * Metodilla tulostetaan viesti, mitä halutaan näkyviin tasapelin tullessa.
     */
    public void tasaPeliViesti() {
        JOptionPane.showMessageDialog(null, "Tasapeli!", "Tasapeli!", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getVuoro() {
        return this.vuorossa;
    }

    /**
     * Metodilla palautetaan vuorossa olevan pelaajan nimi. Tarvitaan pelilaudan
     * alareunassa olevaan lokeroon, mikä kertoo kumman pelaajan vuoro on.
     *
     * @return palauttaa vuorossa olevan pelaajan nimen
     */
    public String pelaajanVuoro() {
        if (this.vuorossa.equals("X")) {
            return this.pelaaja1.getNimi();
        }
        return this.pelaaja2.getNimi();
    }

    /**
     * Metodilla tulostetaan viesti, mitä halutaan näkyviin x:n voittaessa.
     */
    public void xVoittaa() {
        this.pelaaja1.pelinVoitto();
        JOptionPane.showMessageDialog(null, this.pelaaja1 + " voittaa!", "Voitto!", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Metodilla tulostetaan viesti, mitä halutaan näkyviin o:n voittaessa.
     */
    public void yVoittaa() {
        this.pelaaja2.pelinVoitto();
        JOptionPane.showMessageDialog(null, this.pelaaja2 + " voittaa!", "Voitto!", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Pelilaudan alareunassa näkyvä tilanne merkkijonona.
     *
     * @return pelin tilanne
     */
    public String informaatio() {
        String palautus = "Pelaajan " + this.pelaaja1 + " pisteet: " + this.pelaaja1.getVoitetutPelit() + "            Vuorossa: "
                + pelaajanVuoro() + "               "
                + "Pelaajan " + this.pelaaja2 + " pisteet: " + this.pelaaja2.getVoitetutPelit();
        return palautus;
    }

}
