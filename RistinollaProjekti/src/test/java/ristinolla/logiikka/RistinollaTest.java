package ristinolla.logiikka;


import ristinolla.kayttaja.Pelaaja;
import org.junit.Before;



public class RistinollaTest {
    
    Pelaaja eka;
    Pelaaja toka;
    Peli uusiPeli;
    
    public RistinollaTest() {
        eka = new Pelaaja();
        toka = new Pelaaja();
    }
    
    @Before
    public void setUp() {
        eka.setNimi("Pertti");
        toka.setNimi("Maikki");
        uusiPeli.setPelaajat(eka, toka);
    }
    
    

}
