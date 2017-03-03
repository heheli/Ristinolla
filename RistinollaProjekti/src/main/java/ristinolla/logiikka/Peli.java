package ristinolla.logiikka;

import ristinolla.gui.Viestit;
import ristinolla.kayttaja.Pelaaja;

/**
 * Luokka sisältää tarvittavan logiikan ristinollalle ja sen hetkisen
 * pelitilanteen.
 *
 * @author poutihel
 */
public class Peli extends Viestit {

    private Merkki vuorossa;
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
        this.vuorossa = Merkki.RISTI;
        this.merkkitaulu = new Merkki[3][3];

    }

    /**
     * Pelaajan painaessa nappia, tällä metodilla vaihdetaan pelaajan "arvoa".
     */
    public void vaihdaVuoro() {
        if (this.vuorossa.equals(Merkki.RISTI)) {
            this.vuorossa = Merkki.NOLLA;
        } else {
            this.vuorossa = Merkki.RISTI;
        }
    }

    public Merkki[][] getMerkkitaulu() {
        return this.merkkitaulu;
    }

    /**
     * Metodilla tarkastetaan tuliko voitto jollekin vaakariville.
     *
     * @param merkki Tarkastettava merkki
     * @return Voiton totuusarvo
     */
    public boolean tulikoVoittoVaaka(Merkki merkki) {
        for (int y = 0; y < merkkitaulu.length; y++) {
            int maara = 0;
            for (int x = 0; x < merkkitaulu.length; x++) {
                if (merkkitaulu[y][x] == merkki) {
                    maara++;
                }
            }
            if (maara == 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodilla tarkastetaan tuliko voitto jollekin pystyriville.
     *
     * @param merkki Tarkastettava merkki
     * @return Voiton totuusarvo
     */
    public boolean tulikoVoittoPysty(Merkki merkki) {
        for (int y = 0; y < merkkitaulu.length; y++) {
            int maara = 0;
            for (int x = 0; x < merkkitaulu.length; x++) {
                if (merkkitaulu[x][y] == merkki) {
                    maara++;
                }
            }
            if (maara == 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodilla tarkastetaan tuliko voitto kulmittain.
     *
     * @param merkki Tarkastettava merkki
     * @return Voiton totuusarvo
     */
    public boolean tulikoVoittoKulma1(Merkki merkki) {
        int maara = 0;
        for (int i = 0; i < merkkitaulu.length; i++) {
            if (merkkitaulu[i][i] == merkki) {
                maara++;
            }
        }
        if (maara == 3) {
            return true;
        }
        return false;
    }

    /**
     * Metodilla tarkastetaan tuliko voitto kulmittain.
     *
     * @param merkki Tarkastettava merkki
     * @return Voiton totuusarvo
     */
    public boolean tulikoVoittoKulma2(Merkki merkki) {
        int maara = 0;
        for (int i = merkkitaulu.length - 1; i > -1; i--) {
            if (merkkitaulu[merkkitaulu.length - i - 1][i] == merkki) {
                maara++;
            }
            if (maara == 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodilla tarkastetaan tuliko tasapeli.
     *
     * @return totuusarvo tasapelistä
     */
    public boolean tasaPeli() {
        for (int i = 0; i < merkkitaulu.length; i++) {
            for (int j = 0; j < merkkitaulu.length; j++) {
                if (merkkitaulu[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Metodilla tarkastetaan onko peli päättynyt. Tarkastamiseen käytetään
     * tulikoVoitto-metodeja.
     *
     * @return totuusarvo sille loppuuko peli
     */
    public boolean pelinTarkastus() {
        if (this.vuorossa == Merkki.RISTI && (tulikoVoittoVaaka(Merkki.RISTI)) || tulikoVoittoPysty(Merkki.RISTI) || tulikoVoittoKulma1(Merkki.RISTI) || tulikoVoittoKulma2(Merkki.RISTI)) {
            xVoittaa(this.pelaaja1);
            return true;
        } else if (this.vuorossa == Merkki.NOLLA && (tulikoVoittoVaaka(Merkki.NOLLA)) || tulikoVoittoPysty(Merkki.NOLLA) || tulikoVoittoKulma1(Merkki.NOLLA) || tulikoVoittoKulma2(Merkki.NOLLA)) {
            oVoittaa(this.pelaaja2);
            return true;
        } else if (tasaPeli()) {
            tasaPeliViesti();
            return true;
        }
        return false;
    }

    /**
     * Resetoidaan taulukon arvot yhden pelin päättyessä.
     */
    public void laudanResetointi() {
        for (int i = 0; i < merkkitaulu.length; i++) {
            for (int j = 0; j < merkkitaulu.length; j++) {
                merkkitaulu[i][j] = null;
            }
        }
    }

    public Merkki getVuoro() {
        return this.vuorossa;
    }

    /**
     * Metodi asettaa merkin valittuun ruutuun.
     *
     * @param x kertoo rivin
     * @param y kertoo sarakkeen
     * @return palauttaa Merkki:nä vuorossa olevan pelaajan
     */
    public Merkki asetaMerkki(int x, int y) {
        this.merkkitaulu[x][y] = getVuoro();
        return this.vuorossa;
    }

    /**
     * Metodilla palautetaan vuorossa olevan pelaajan nimi.
     *
     * @return palauttaa vuorossa olevan pelaajan nimen
     */
    public String pelaajanVuoro() {
        if (this.vuorossa.equals(Merkki.RISTI)) {
            return this.pelaaja1.getNimi();
        }
        return this.pelaaja2.getNimi();
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
