package ristinolla.kayttaja;

/**
 * Luokalla luodaan uusi pelaaja ristinolla-peliin. Pelaajaan tallennetaan, nimi
 * ja voitetut pelit.
 */
public class Pelaaja {

    private String nimi;
    private int voitetutPelit;

    /**
     * Pelaaja-luokan konstruktori, jossa nimi ja laskuri voitoille.
     *
     */
    public Pelaaja() {
        this.nimi = "";
        this.voitetutPelit = 0;
    }

    /**
     * Metodi lisää pelaajan laskuriin voiton.
     */
    public void pelinVoitto() {
        this.voitetutPelit++;
    }

    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getVoitetutPelit() {
        return this.voitetutPelit;
    }

    @Override
    public String toString() {
        return this.nimi;
    }

}
