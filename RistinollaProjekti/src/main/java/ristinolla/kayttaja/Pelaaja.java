package ristinolla.kayttaja;

public class Pelaaja {

    private String nimi;
    private int voitetutPelit;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.voitetutPelit = 0;
    }

    public void pelinVoitto() {
        this.voitetutPelit++;
    }

    public String getNimi() {
        return this.nimi;
    }

    public int getVoitetutPelit() {
        return this.voitetutPelit;
    }

    @Override
    public String toString() {
        return this.nimi;
    }

}
