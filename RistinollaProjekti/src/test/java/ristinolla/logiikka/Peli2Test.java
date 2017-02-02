package ristinolla.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ristinolla.kayttaja.Pelaaja;

public class Peli2Test {

    Peli uusi;

    @Before
    public void setUp() {
        uusi = new Peli(2);
    }

    public void testaaVuoroAlussa() {
        assertEquals(uusi.getVuoro(), "X");
    }

    public void testaaVuoroUudestaan() {
        uusi.kenenVuoro();
        assertEquals(uusi.getVuoro(), "Y");
        uusi.kenenVuoro();
        assertEquals(uusi.getVuoro(), "X");
    }

    public void pelaajan1asetus() {
        Pelaaja eka = new Pelaaja("Pertti");
        uusi.setPelaaja1(eka);
        assertEquals("Pertti", uusi.getPelaaja1());
    }

    public void pelaajan2asetus() {
        Pelaaja toka = new Pelaaja("Jonne");
        uusi.setPelaaja1(toka);
        assertEquals("Jonne", uusi.getPelaaja2());
    }

    public void nimetonPelaaja1() {
        assertEquals("", uusi.getPelaaja1());
    }

    public void nimetonPelaaja2() {
        assertEquals("", uusi.getPelaaja2());
    }
}
