
package logiikka;

import kayttaja.Pelaaja;


public class Peli {
    
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;
    private Pelilauta pelilauta;
    
    public Peli(Pelilauta pelilauta, Pelaaja eka, Pelaaja toka){ //esimerkiksi kolme kokoa; 3x3, 6x6 ja 9x9
        this.pelaaja1 = eka;
        this.pelaaja2 = toka;
        this.pelilauta = pelilauta;
    }
    
    public void setPelaajat(Pelaaja eka, Pelaaja toka){
        this.pelaaja1 = eka;
        this.pelaaja2 = toka;
    }
    
    public void kaynnista(){
        
    }
    
    
    
    
}
