package ristinolla.logiikka;

import java.util.HashMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import ristinolla.gui.Viestit;
import ristinolla.kayttaja.Pelaaja;

public class PeliTest extends Viestit {

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
        assertEquals(uusiEka.getVuoro(), Merkki.RISTI);
    }

    @Test
    public void testaaVuoroUudestaan() {
        uusiEka.vaihdaVuoro();
        assertEquals(uusiEka.getVuoro(), Merkki.NOLLA);
        uusiEka.vaihdaVuoro();
        assertEquals(uusiEka.getVuoro(), Merkki.RISTI);
    }

    @Test
    public void asetaMerkkiTest() {
        uusiEka.asetaMerkki(0, 0);
        assertEquals(Merkki.RISTI, uusiEka.getMerkkitaulu()[0][0]);
        uusiEka.asetaMerkki(1, 0);
        assertEquals(Merkki.RISTI, uusiEka.getMerkkitaulu()[1][0]);
        uusiEka.vaihdaVuoro();
        uusiEka.asetaMerkki(0, 0);
        assertEquals(Merkki.NOLLA, uusiEka.getMerkkitaulu()[0][0]);
        uusiEka.asetaMerkki(1, 0);
        assertEquals(Merkki.NOLLA, uusiEka.getMerkkitaulu()[1][0]);
    }

    @Test
    public void testaaMerkkitaulu() {
        Merkki[][] vara = new Merkki[3][3];
        Assert.assertArrayEquals(uusiEka.getMerkkitaulu(), vara);
        assertEquals(uusiEka.getMerkkitaulu()[0][0], null);
        assertEquals(uusiEka.getMerkkitaulu()[0][1], null);
        assertEquals(uusiEka.getMerkkitaulu()[0][2], null);
        assertEquals(uusiEka.getMerkkitaulu()[1][0], null);
        assertEquals(uusiEka.getMerkkitaulu()[1][1], null);
        assertEquals(uusiEka.getMerkkitaulu()[1][2], null);
        assertEquals(uusiEka.getMerkkitaulu()[2][0], null);
        assertEquals(uusiEka.getMerkkitaulu()[2][1], null);
        assertEquals(uusiEka.getMerkkitaulu()[2][2], null);
    }

    @Test
    public void pelaajanVuoroTest() {
        assertEquals("Pertti", uusiEka.pelaajanVuoro());
        uusiEka.vaihdaVuoro();
        assertEquals("Jonne", uusiEka.pelaajanVuoro());
        uusiEka.vaihdaVuoro();
        assertEquals("Pertti", uusiEka.pelaajanVuoro());
    }

    @Test
    public void xVoittaaTest1() {
        assertEquals(0, eka.getVoitetutPelit());
        xVoittaa(eka);
        xVoittaa(eka);
        assertEquals(2, eka.getVoitetutPelit());
    }

    @Test
    public void yVoittaaTest1() {
        assertEquals(0, toka.getVoitetutPelit());
        yVoittaa(toka);
        yVoittaa(toka);
        assertEquals(2, toka.getVoitetutPelit());
    }

    @Test
    public void xVoittaaTest2() {
        assertEquals(0, eka.getVoitetutPelit());
        xVoittaa(eka);
        xVoittaa(eka);
        assertEquals(2, eka.getVoitetutPelit());
        yVoittaa(toka);
        yVoittaa(toka);
        assertEquals(2, eka.getVoitetutPelit());
    }

    @Test
    public void yVoittaaTest2() {
        assertEquals(0, toka.getVoitetutPelit());
        yVoittaa(toka);
        yVoittaa(toka);
        assertEquals(2, toka.getVoitetutPelit());
        xVoittaa(eka);
        xVoittaa(eka);
        assertEquals(2, toka.getVoitetutPelit());
    }

    @Test
    public void voitotOikeinTasapelissa() {
        assertEquals(0, eka.getVoitetutPelit());
        assertEquals(0, toka.getVoitetutPelit());
        uusiEka.tasaPeli();
        assertEquals(0, eka.getVoitetutPelit());
        assertEquals(0, toka.getVoitetutPelit());
        xVoittaa(eka);
        uusiEka.tasaPeli();
        yVoittaa(toka);
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
        xVoittaa(eka);
        String testi = "Pelaajan " + "Pertti" + " pisteet: " + 1 + "            Vuorossa: "
                + "Pertti" + "               "
                + "Pelaajan " + "Jonne" + " pisteet: " + 0;
        assertEquals(testi, uusiEka.informaatio());

    }

    @Test
    public void informaatioTest2() {
        yVoittaa(toka);
        String testi = "Pelaajan " + "Pertti" + " pisteet: " + 0 + "            Vuorossa: "
                + "Pertti" + "               "
                + "Pelaajan " + "Jonne" + " pisteet: " + 1;
        assertEquals(testi, uusiEka.informaatio());
    }

    @Test
    public void pelinTarkastusTest1() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[0][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[0][2] = Merkki.RISTI;
        assertTrue(uusiEka.pelinTarkastus());
        assertEquals(1, this.eka.getVoitetutPelit());
    }

    @Test
    public void pelinTarkastusTest2() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.getMerkkitaulu()[0][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[0][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[0][2] = Merkki.NOLLA;
        assertTrue(uusiEka.pelinTarkastus());
    }

    @Test
    public void pelinTarkastusTest3() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[0][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[0][2] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][2] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.NOLLA;
        assertTrue(uusiEka.pelinTarkastus());
    }

    @Test
    public void pelinTarkastusTest4() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][2] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][2] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.NOLLA;
        assertFalse(uusiEka.pelinTarkastus());
    }

    @Test
    public void pelinTarkastusTest5() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][0] = Merkki.RISTI;
        assertTrue(uusiEka.pelinTarkastus());
    }

    @Test
    public void pelinTarkastusTest6() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.getMerkkitaulu()[0][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][0] = Merkki.NOLLA;
        assertTrue(uusiEka.pelinTarkastus());
    }

    @Test
    public void pelinTarkastusTest7() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.getMerkkitaulu()[0][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.NOLLA;
        assertTrue(uusiEka.pelinTarkastus());
    }

    @Test
    public void pelinTarkastusTest8() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.RISTI;
        assertTrue(uusiEka.pelinTarkastus());
    }

    @Test
    public void pelinTarkastusTest9() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.getMerkkitaulu()[2][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[0][2] = Merkki.NOLLA;
        assertTrue(uusiEka.pelinTarkastus());
    }

    @Test
    public void pelinTarkastusTest10() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.RISTI;
        assertTrue(uusiEka.pelinTarkastus());
    }

    @Test
    public void laudanResetointiTest() {
        uusiEka.getMerkkitaulu()[0][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][0] = Merkki.RISTI;
        assertEquals(Merkki.RISTI, uusiEka.getMerkkitaulu()[2][0]);
        assertEquals(Merkki.NOLLA, uusiEka.getMerkkitaulu()[0][0]);
        uusiEka.laudanResetointi();
        assertEquals(uusiEka.getMerkkitaulu()[2][0], null);
        assertEquals(uusiEka.getMerkkitaulu()[0][0], null);
    }

}
