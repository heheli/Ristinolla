package ristinolla.logiikka;

import org.junit.Test;
import static org.junit.Assert.*;
import ristinolla.kayttaja.Pelaaja;

public class UusiPeliTest {

    @Test
    public void setPelaajaTest1() {
        UusiPeli uusiPeli = new UusiPeli(1);
        assertEquals("X", uusiPeli.getPelaaja1());
        Pelaaja eka = new Pelaaja("Pertti");
        uusiPeli.setPelaaja1(eka);
        assertEquals("Pertti", uusiPeli.getPelaaja1());
        assertEquals("Y", uusiPeli.getPelaaja2());
        Pelaaja toka = new Pelaaja("Jonne");
        uusiPeli.setPelaaja2(toka);
        assertEquals("Jonne", uusiPeli.getPelaaja2());
    }

    @Test
    public void setPelaajaTest2() {
        UusiPeli uusiPeli = new UusiPeli(2);
        assertEquals("X", uusiPeli.getPelaaja1());
        Pelaaja eka = new Pelaaja("Pertti");
        uusiPeli.setPelaaja1(eka);
        assertEquals("Pertti", uusiPeli.getPelaaja1());
        assertEquals("Y", uusiPeli.getPelaaja2());
        Pelaaja toka = new Pelaaja("Jonne");
        uusiPeli.setPelaaja2(toka);
        assertEquals("Jonne", uusiPeli.getPelaaja2());
    }

    @Test
    public void getPelaajaTest1() {
        UusiPeli uusiPeli = new UusiPeli(1);
        assertEquals("X", uusiPeli.getPelaaja1());
        uusiPeli.setPelaaja1(new Pelaaja("Pertti"));
        assertEquals("Pertti", uusiPeli.getPelaaja1());
    }

    @Test
    public void getPelaajaTest2() {
        UusiPeli uusiPeli = new UusiPeli(2);
        assertEquals("Y", uusiPeli.getPelaaja2());
        uusiPeli.setPelaaja2(new Pelaaja("Jonne"));
        assertEquals("Jonne", uusiPeli.getPelaaja2());
    }

    @Test
    public void pelaajanPisteetTest1() {
        UusiPeli uusiPeli = new UusiPeli(1);
        Pelaaja eka = new Pelaaja("Pertti");
        Pelaaja toka = new Pelaaja("Jonne");
        uusiPeli.setPelaaja1(eka);
        uusiPeli.setPelaaja2(toka);
        assertEquals(0, uusiPeli.getPelaajan1Pisteet());
        Peli uusi = new Peli(eka, toka);
        uusi.xVoittaa();
        assertEquals(1, uusiPeli.getPelaajan1Pisteet());
        uusi.yVoittaa();
        assertEquals(1, uusiPeli.getPelaajan2Pisteet());
        uusi.tasaPeli();
        assertEquals(1, uusiPeli.getPelaajan1Pisteet());
        assertEquals(1, uusiPeli.getPelaajan2Pisteet());
    }

    @Test
    public void pelaajanPisteetTest2() {
        UusiPeli uusiPeli = new UusiPeli(2);
        Pelaaja eka = new Pelaaja("Pertti");
        Pelaaja toka = new Pelaaja("Jonne");
        uusiPeli.setPelaaja1(eka);
        uusiPeli.setPelaaja2(toka);
        assertEquals(0, uusiPeli.getPelaajan1Pisteet());
        Peli uusi = new Peli(eka, toka);
        uusi.xVoittaa();
        assertEquals(1, uusiPeli.getPelaajan1Pisteet());
        uusi.yVoittaa();
        assertEquals(1, uusiPeli.getPelaajan2Pisteet());
        uusi.tasaPeli();
        assertEquals(1, uusiPeli.getPelaajan1Pisteet());
        assertEquals(1, uusiPeli.getPelaajan2Pisteet());
    }

    @Test
    public void tyhjatPelaajat1() {
        UusiPeli uusiPeli = new UusiPeli(1);
        assertEquals("X", uusiPeli.getPelaaja1());
        assertEquals("Y", uusiPeli.getPelaaja2());
        Pelaaja eka = new Pelaaja("Pertti");
        Pelaaja toka = new Pelaaja("Jonne");
        uusiPeli.setPelaaja1(eka);
        uusiPeli.setPelaaja2(toka);
        assertEquals("Pertti", uusiPeli.getPelaaja1());
        assertEquals("Jonne", uusiPeli.getPelaaja2());
    }

    @Test
    public void tyhjatPelaajat2() {
        UusiPeli uusiPeli = new UusiPeli(2);
        assertEquals("X", uusiPeli.getPelaaja1());
        assertEquals("Y", uusiPeli.getPelaaja2());
        Pelaaja eka = new Pelaaja("Pertti");
        Pelaaja toka = new Pelaaja("Jonne");
        uusiPeli.setPelaaja1(eka);
        uusiPeli.setPelaaja2(toka);
        assertEquals("Pertti", uusiPeli.getPelaaja1());
        assertEquals("Jonne", uusiPeli.getPelaaja2());
    }

}
