package ristinolla.logiikka;

import java.util.HashMap;
import javax.swing.JOptionPane;
import ristinolla.kayttaja.Pelaaja;

/**
 * Luokka sisältää pelilautojen logiikkaa.
 */
public class Peli {

    private String vuorossa;
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;
    private HashMap<String, String> taulu;

    /**
     * Konstruktori sisältää taulun, jonka avulla seurataan pelin kulkua.
     *
     * @param pelaaja1 Pelaaja 1
     * @param pelaaja2 Pelaaja 2
     */
    public Peli(Pelaaja pelaaja1, Pelaaja pelaaja2) { //esimerkiksi kolme kokoa; 3x3, 6x6
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
        this.vuorossa = "X";
        this.taulu = new HashMap();
        taulu.put("1.1", "");
        taulu.put("1.2", "");
        taulu.put("1.3", "");
        taulu.put("2.1", "");
        taulu.put("2.2", "");
        taulu.put("2.3", "");
        taulu.put("3.1", "");
        taulu.put("3.2", "");
        taulu.put("3.3", "");
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

    /**
     * Metodilla vaihdetaan taulukkoon ruutuja kuvaaviin kohtiin pelaajien
     * merkit.
     *
     * @param ruutu Ruudun sijainti, esim 1. ruutu on 1.1 ja sen alla 2.1
     * @param xy Kumman merkkinen pelaaja teki siirron, X vai Y
     */
    public void vaihdaTaulukonArvo(String ruutu, String xy) {
        this.taulu.put(ruutu, xy);
    }

    public HashMap<String, String> getPistetaulukko() {
        return this.taulu;
    }

    /**
     * Metodilla tarkastetaan voittiko x-pelaaja.
     */
    public boolean pelinVoittoX() {
        if (taulu.get("1.1").equals("X") && taulu.get("1.2").equals("X") && taulu.get("1.3").equals("X")) {
            return true;
        } else if (taulu.get("2.1").equals("X") && taulu.get("2.2").equals("X") && taulu.get("2.3").equals("X")) {
            return true;
        } else if (taulu.get("3.1").equals("X") && taulu.get("3.2").equals("X") && taulu.get("3.3").equals("X")) {
            return true;
        } else if (taulu.get("1.1").equals("X") && taulu.get("2.1").equals("X") && taulu.get("3.1").equals("X")) {
            return true;
        } else if (taulu.get("1.2").equals("X") && taulu.get("2.2").equals("X") && taulu.get("3.2").equals("X")) {
            return true;
        } else if (taulu.get("1.3").equals("X") && taulu.get("2.3").equals("X") && taulu.get("3.3").equals("X")) {
            return true;
        } else if (taulu.get("1.1").equals("X") && taulu.get("2.2").equals("X") && taulu.get("3.3").equals("X")) {
            return true;
        } else if (taulu.get("3.1").equals("X") && taulu.get("2.2").equals("X") && taulu.get("1.3").equals("X")) {
            return true;
        }
        return false;
    }

    /**
     * Metodilla tarkastetaan voittiko o-pelaaja.
     */
    public boolean pelinVoittoY() {
        if (taulu.get("1.1").equals("O") && taulu.get("1.2").equals("O") && taulu.get("1.3").equals("O")) {
            return true;
        } else if (taulu.get("2.1").equals("O") && taulu.get("2.2").equals("O") && taulu.get("2.3").equals("O")) {
            return true;
        } else if (taulu.get("3.1").equals("O") && taulu.get("3.2").equals("O") && taulu.get("3.3").equals("O")) {
            return true;
        } else if (taulu.get("1.1").equals("O") && taulu.get("2.1").equals("O") && taulu.get("3.1").equals("O")) {
            return true;
        } else if (taulu.get("1.2").equals("O") && taulu.get("2.2").equals("O") && taulu.get("3.2").equals("O")) {
            return true;
        } else if (taulu.get("1.3").equals("O") && taulu.get("2.3").equals("O") && taulu.get("3.3").equals("O")) {
            return true;
        } else if (taulu.get("1.1").equals("O") && taulu.get("2.2").equals("O") && taulu.get("3.3").equals("O")) {
            return true;
        } else if (taulu.get("3.1").equals("O") && taulu.get("2.2").equals("O") && taulu.get("1.3").equals("O")) {
            return true;
        }
        return false;
    }

    /**
     * Metodilla tarkastetaan tuliko tasapeli.
     */
    public boolean tasaPeli() {
        for (String xy : this.taulu.values()) {
            if (xy.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodi kokoaa kaikki pelin päättymiseen liittyvät metodit, ja palauttaa
     * arvon laudalle.
     */
    public boolean pelinTarkastus() {
        if (pelinVoittoX()) {
            xVoittaa();
            return true;
        }
        if (pelinVoittoY()) {
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
        taulu.put("1.1", "");
        taulu.put("1.2", "");
        taulu.put("1.3", "");
        taulu.put("2.1", "");
        taulu.put("2.2", "");
        taulu.put("2.3", "");
        taulu.put("3.1", "");
        taulu.put("3.2", "");
        taulu.put("3.3", "");
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
