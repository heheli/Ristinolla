package ristinolla.logiikka;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import ristinolla.kayttaja.Pelaaja;

public class PeliTest {

    Peli uusiEka;
    Pelaaja eka;
    Pelaaja toka;

    @Before
    public void setUp() {
        eka = new Pelaaja("Pertti");
        toka = new Pelaaja("Jonne");
        uusiEka = new Peli(eka, toka);
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
    public void pelaajanVuoroTest() {
        assertEquals("Pertti", uusiEka.pelaajanVuoro());
        uusiEka.kenenVuoro();
        assertEquals("Jonne", uusiEka.pelaajanVuoro());
        uusiEka.kenenVuoro();
        assertEquals("Pertti", uusiEka.pelaajanVuoro());
    }

    @Test
    public void xVoittaaTest1() {
        assertEquals(0, eka.getVoitetutPelit());
        uusiEka.xVoittaa();
        uusiEka.xVoittaa();
        assertEquals(2, eka.getVoitetutPelit());
    }

    @Test
    public void yVoittaaTest1() {
        assertEquals(0, toka.getVoitetutPelit());
        uusiEka.yVoittaa();
        uusiEka.yVoittaa();
        assertEquals(2, toka.getVoitetutPelit());
    }

    @Test
    public void xVoittaaTest2() {
        assertEquals(0, eka.getVoitetutPelit());
        uusiEka.xVoittaa();
        uusiEka.xVoittaa();
        assertEquals(2, eka.getVoitetutPelit());
        uusiEka.yVoittaa();
        uusiEka.yVoittaa();
        assertEquals(2, eka.getVoitetutPelit());
    }

    @Test
    public void yVoittaaTest2() {
        assertEquals(0, toka.getVoitetutPelit());
        uusiEka.yVoittaa();
        uusiEka.yVoittaa();
        assertEquals(2, toka.getVoitetutPelit());
        uusiEka.xVoittaa();
        uusiEka.xVoittaa();
        assertEquals(2, toka.getVoitetutPelit());
    }

    @Test
    public void voitotOikeinTasapelissa() {
        assertEquals(0, eka.getVoitetutPelit());
        assertEquals(0, toka.getVoitetutPelit());
        uusiEka.tasaPeli();
        assertEquals(0, eka.getVoitetutPelit());
        assertEquals(0, toka.getVoitetutPelit());
        uusiEka.xVoittaa();
        uusiEka.tasaPeli();
        uusiEka.yVoittaa();
        assertEquals(1, eka.getVoitetutPelit());
        assertEquals(1, toka.getVoitetutPelit());
    }

    @Test
    public void informaatioAlussaOikein() {
        String testi = "Pelaajan " + "Pertti" + " pisteet: " + 0 + "            Vuorossa: "
                + "Pertti" + "               "
                + "Pelaajan " + "Jonne" + " pisteet: " + 0;
        assertEquals(testi, uusiEka.informaatio());
    }

    @Test
    public void informaatioTest1() {
        uusiEka.xVoittaa();
        String testi = "Pelaajan " + "Pertti" + " pisteet: " + 1 + "            Vuorossa: "
                + "Pertti" + "               "
                + "Pelaajan " + "Jonne" + " pisteet: " + 0;
        assertEquals(testi, uusiEka.informaatio());

    }

    @Test
    public void informaatioTest2() {
        uusiEka.yVoittaa();
        String testi = "Pelaajan " + "Pertti" + " pisteet: " + 0 + "            Vuorossa: "
                + "Pertti" + "               "
                + "Pelaajan " + "Jonne" + " pisteet: " + 1;
        assertEquals(testi, uusiEka.informaatio());
    }

}
