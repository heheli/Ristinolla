package ristinolla.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ristinolla.kayttaja.Pelaaja;

public class PeliTest {

    Peli uusiEka;
    Pelaaja eka;
    Pelaaja toka;

    @Before
    public void setUp() {
        uusiEka = new Peli(1);
        eka = new Pelaaja("Pertti");
        toka = new Pelaaja("Jonne");
    }

    @Test
    public void testaaVuoroAlussa() {
        assertEquals(uusiEka.getVuoro(), "X");
    }

    @Test
    public void testaaVuoroUudestaan() {
        uusiEka.kenenVuoro();
        assertEquals(uusiEka.getVuoro(), "O");
        uusiEka.kenenVuoro();
        assertEquals(uusiEka.getVuoro(), "X");
    }

    @Test
    public void pelaajan1asetus() {
        uusiEka.setPelaaja1(eka);
        assertEquals("Pertti", uusiEka.getPelaaja1());
    }

    @Test
    public void pelaajan2asetus() {
        uusiEka.setPelaaja2(toka);
        assertEquals("Jonne", uusiEka.getPelaaja2());
    }
    
    @Test
    public void pisteetAlussaPelaaja1(){
        assertEquals(0, eka.getVoitetutPelit());
    }
    
    @Test
    public void pisteetAlussaPelaaja2(){
        assertEquals(0, toka.getVoitetutPelit());
    }

    @Test     
    public void pisteidenLisays1() {
        uusiEka.setPelaaja1(eka);
        assertEquals(0, eka.getVoitetutPelit());
        uusiEka.xVoittaa();
        assertEquals(1, eka.getVoitetutPelit());
        uusiEka.xVoittaa();
        assertEquals(2, eka.getVoitetutPelit());
        assertEquals(2, uusiEka.getPelaajan1Pisteet());
    }

    @Test
    public void pisteidenLisays2() {
        uusiEka.setPelaaja2(toka);
        assertEquals(0, toka.getVoitetutPelit());
        uusiEka.yVoittaa();
        assertEquals(1, toka.getVoitetutPelit());
        uusiEka.yVoittaa();
        assertEquals(2, toka.getVoitetutPelit());
        assertEquals(2, uusiEka.getPelaajan2Pisteet());
    }
    

}
