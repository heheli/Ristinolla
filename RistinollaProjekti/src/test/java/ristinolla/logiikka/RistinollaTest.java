package ristinolla.logiikka;


import kayttaja.Pelaaja;
import logiikka.Peli;
import org.junit.Before;



public class RistinollaTest {
    
    Pelaaja eka;
    Pelaaja toka;
    Peli uusiPeli;
    
    public RistinollaTest() {
        eka = new Pelaaja();
        toka = new Pelaaja();
        uusiPeli = new Peli(1);
    }
    
    @Before
    public void setUp() {
        eka.setNimi("Pertti");
        toka.setNimi("Maikki");
        uusiPeli.setPelaajat(eka, toka);
    }
    
    

}
