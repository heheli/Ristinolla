package ristinolla.logiikka;



import kayttaja.Pelaaja;
import kayttaja.PelaajaVarasto;
import logiikka.Ristinolla;
import logiikka.Ristinolla;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class RistinollaTest {
    
    Pelaaja eka;
    Pelaaja toka;
    PelaajaVarasto varasto;
    Ristinolla uusiPeli;
    
    public RistinollaTest() {
        eka = new Pelaaja();
        toka = new Pelaaja();
        varasto = new PelaajaVarasto();
        uusiPeli = new Ristinolla(1);
    }
    
    @Before
    public void setUp() {
        eka.setNimi("Pertti");
        toka.setNimi("Maikki");
        uusiPeli.setPelaajat(eka, toka);
    }
    
    @Test 
    public void alkuTilanne(){
        assertEquals(2, uusiPeli.getVarasto().getPelaajaLista().size());
    }
    

}
