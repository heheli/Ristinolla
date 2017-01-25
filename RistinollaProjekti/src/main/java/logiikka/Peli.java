
package logiikka;

import kayttaja.Pelaaja;


public class Peli {
    
    private int pelinKoko;
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;
    
    public Peli(int koko){ //esimerkiksi kolme kokoa; 3x3, 6x6 ja 9x9
        this.pelinKoko = koko;
        this.pelaaja1 = null;
        this.pelaaja2 = null;
    }
    
    public void setPelaajat(Pelaaja eka, Pelaaja toka){
        this.pelaaja1 = eka;
        this.pelaaja2 = toka;
    }
    
    public void kaynnista(){
        
    }
    
    
    
    
}
