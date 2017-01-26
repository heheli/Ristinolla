
package kayttaja;


public class Pelaaja {
    
    private String nimi;
    private int voitetutPelit;
    
    public Pelaaja() {
        this.nimi = null;
        this.voitetutPelit = 0;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
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
    
}
