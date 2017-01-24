
package logiikka;

import kayttaja.Pelaaja;
import kayttaja.PelaajaVarasto;


public class Ristinolla {
    
    private int pelinKoko;
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;
    private PelaajaVarasto varasto;
    
    public Ristinolla(int koko){ //esimerkiksi kolme kokoa; 3x3, 6x6 ja 9x9
        this.pelinKoko = koko;
        this.pelaaja1 = null;
        this.pelaaja2 = null;
        this.varasto = new PelaajaVarasto();
    }
    
    public void setPelaajat(Pelaaja eka, Pelaaja toka){
        this.pelaaja1 = eka;
        this.pelaaja2 = toka;
        this.varasto.lisaaPelaaja(this.pelaaja1);
        this.varasto.lisaaPelaaja(this.pelaaja2);
    }
    public PelaajaVarasto getVarasto(){
        return varasto;
    }
    
    public void kaynnista(){
        
    }
    
    
    
    
}
