package ristinolla.logiikka;

import java.util.HashMap;
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

    @Test
    public void taulukkoTest() {
        int vaarin = 0;
        for (String avain : uusiEka.getPistetaulukko().values()) {
            if (avain.equals("")) {
                vaarin++;
            }
        }
        assertEquals(9, vaarin);
        assertEquals(9, uusiEka.getPistetaulukko().size());
    }

    @Test
    public void vaihdaTaulukonArvoTest1() {
        uusiEka.vaihdaTaulukonArvo("1.1", uusiEka.getVuoro());
        uusiEka.vaihdaTaulukonArvo("1.2", uusiEka.getVuoro());
        uusiEka.vaihdaTaulukonArvo("1.3", uusiEka.getVuoro());
        uusiEka.vaihdaTaulukonArvo("2.1", uusiEka.getVuoro());
        uusiEka.vaihdaTaulukonArvo("2.2", uusiEka.getVuoro());
        uusiEka.kenenVuoro();
        uusiEka.vaihdaTaulukonArvo("2.3", uusiEka.getVuoro());
        uusiEka.vaihdaTaulukonArvo("3.1", uusiEka.getVuoro());
        uusiEka.vaihdaTaulukonArvo("3.2", uusiEka.getVuoro());
        uusiEka.vaihdaTaulukonArvo("3.3", uusiEka.getVuoro());
        assertEquals("X", uusiEka.getPistetaulukko().get("1.1"));
        assertEquals("X", uusiEka.getPistetaulukko().get("1.2"));
        assertEquals("X", uusiEka.getPistetaulukko().get("1.3"));
        assertEquals("X", uusiEka.getPistetaulukko().get("2.1"));
        assertEquals("X", uusiEka.getPistetaulukko().get("2.2"));
        assertEquals("O", uusiEka.getPistetaulukko().get("2.3"));
        assertEquals("O", uusiEka.getPistetaulukko().get("3.1"));
        assertEquals("O", uusiEka.getPistetaulukko().get("3.2"));
        assertEquals("O", uusiEka.getPistetaulukko().get("3.3"));
    }

    @Test
    public void getPistetaulukkoTest() {
        HashMap<String, String> varaTaulu = new HashMap();

        varaTaulu.put("1.1", "");
        varaTaulu.put("1.2", "");
        varaTaulu.put("1.3", "");
        varaTaulu.put("2.1", "");
        varaTaulu.put("2.2", "");
        varaTaulu.put("2.3", "");
        varaTaulu.put("3.1", "");
        varaTaulu.put("3.2", "");
        varaTaulu.put("3.3", "");

        assertEquals(varaTaulu, uusiEka.getPistetaulukko());
        uusiEka.vaihdaTaulukonArvo("1.1", uusiEka.getVuoro());
        uusiEka.vaihdaTaulukonArvo("3.2", uusiEka.getVuoro());
        uusiEka.vaihdaTaulukonArvo("2.1", uusiEka.getVuoro());
        uusiEka.vaihdaTaulukonArvo("1.3", uusiEka.getVuoro());

        varaTaulu.put("1.1", uusiEka.getVuoro());
        varaTaulu.put("3.2", uusiEka.getVuoro());
        varaTaulu.put("2.1", uusiEka.getVuoro());
        varaTaulu.put("1.3", uusiEka.getVuoro());

        assertEquals(varaTaulu, uusiEka.getPistetaulukko());
    }

    @Test
    public void pelinTarkastusTest1() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.vaihdaTaulukonArvo("1.3", "X");
        uusiEka.vaihdaTaulukonArvo("2.2", "X");
        uusiEka.vaihdaTaulukonArvo("3.1", "X");
        assertTrue(uusiEka.pelinTarkastus());
    }

    @Test
    public void pelinTarkastusTest2() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.vaihdaTaulukonArvo("1.3", "O");
        uusiEka.vaihdaTaulukonArvo("2.2", "O");
        uusiEka.vaihdaTaulukonArvo("3.1", "O");
        assertTrue(uusiEka.pelinTarkastus());
    }

    @Test
    public void pelinTarkastusTest3() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.vaihdaTaulukonArvo("1.3", "O");
        uusiEka.vaihdaTaulukonArvo("2.2", "O");
        uusiEka.vaihdaTaulukonArvo("3.1", "X");
        uusiEka.vaihdaTaulukonArvo("1.1", "X");
        uusiEka.vaihdaTaulukonArvo("1.2", "O");
        uusiEka.vaihdaTaulukonArvo("2.1", "O");
        uusiEka.vaihdaTaulukonArvo("3.2", "X");
        uusiEka.vaihdaTaulukonArvo("3.3", "O");
        uusiEka.vaihdaTaulukonArvo("2.3", "X");
        assertTrue(uusiEka.pelinTarkastus());
    }

    @Test
    public void pelinTarkastusTest4() {
        assertFalse(uusiEka.pelinTarkastus());
        uusiEka.vaihdaTaulukonArvo("1.3", "O");
        uusiEka.vaihdaTaulukonArvo("2.2", "O");
        uusiEka.vaihdaTaulukonArvo("3.1", "X");
        uusiEka.vaihdaTaulukonArvo("1.1", "X");
        uusiEka.vaihdaTaulukonArvo("3.3", "O");
        uusiEka.vaihdaTaulukonArvo("2.3", "X");
        assertFalse(uusiEka.pelinTarkastus());
    }

    @Test
    public void laudanResetointiTest() {
        uusiEka.vaihdaTaulukonArvo("1.3", "O");
        uusiEka.vaihdaTaulukonArvo("2.2", "O");
        uusiEka.vaihdaTaulukonArvo("3.1", "X");
        uusiEka.vaihdaTaulukonArvo("1.1", "X");
        uusiEka.vaihdaTaulukonArvo("1.2", "O");
        uusiEka.vaihdaTaulukonArvo("2.1", "O");
        uusiEka.vaihdaTaulukonArvo("3.2", "X");
        uusiEka.vaihdaTaulukonArvo("3.3", "O");
        uusiEka.vaihdaTaulukonArvo("2.3", "X");
        uusiEka.laudanResetointi();
        int oikein = 0;
        for (String avain : uusiEka.getPistetaulukko().values()) {
            if (avain.equals("")) {
                oikein++;
            }
        }
        assertEquals(9, oikein);
    }

}
