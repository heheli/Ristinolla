package ristinolla.kayttaja;



import kayttaja.Pelaaja;
import kayttaja.Pelaaja;
import kayttaja.PelaajaVarasto;
import kayttaja.PelaajaVarasto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PelaajaVarastoTest {
    
    Pelaaja eka;
    Pelaaja toka;
    PelaajaVarasto uusiVarasto;
    
    @Before
    public void setUp() {
        eka = new Pelaaja();
        toka = new Pelaaja();
        uusiVarasto = new PelaajaVarasto();
        eka.setNimi("Pertti");
        toka.setNimi("Maikki");
    }
    
    @Test
    public void uusiVarastoTyhja(){
        assertEquals(0, uusiVarasto.getPelaajaLista().size());
    }
    @Test
    public void lisaaPelaajanVarastoon(){
        assertEquals(0, uusiVarasto.getPelaajaLista().size());
        uusiVarasto.lisaaPelaaja(eka);
        assertEquals(1, uusiVarasto.getPelaajaLista().size());
        uusiVarasto.lisaaPelaaja(toka);
        assertEquals(2, uusiVarasto.getPelaajaLista().size());
    }
    @Test
    public void getParasPelaajaToimii(){
        uusiVarasto.lisaaPelaaja(eka);
        uusiVarasto.lisaaPelaaja(toka);
        assertEquals(eka, uusiVarasto.getParasPelaaja());
        eka.pelinVoitto();
        eka.pelinVoitto();
        toka.pelinVoitto();
        assertEquals(eka, uusiVarasto.getParasPelaaja());
        toka.pelinVoitto();
        assertEquals(eka, uusiVarasto.getParasPelaaja());
        toka.pelinVoitto();
        assertEquals(toka, uusiVarasto.getParasPelaaja());
    }

}
