package ristinolla.logiikka;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import ristinolla.kayttaja.Pelaaja;

public class PeliTestPelinvoitto {

    Peli uusiEka;
    Pelaaja eka;
    Pelaaja toka;

    public PeliTestPelinvoitto() {
        eka = new Pelaaja("Pertti");
        toka = new Pelaaja("Jonne");
        uusiEka = new Peli(eka, toka);
    }

//    @Test
//    public void tulikoVoittoVaakaRisti() {
//        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.RISTI));
//        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.NOLLA));
//        assertFalse(uusiEka.tasaPeli());
//
//        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
//        uusiEka.getMerkkitaulu()[0][1] = Merkki.RISTI;
//        uusiEka.getMerkkitaulu()[0][2] = Merkki.RISTI;
//
//        assertTrue(uusiEka.tulikoVoittoVaaka(Merkki.RISTI));
//        assertEquals(1, eka.getVoitetutPelit());
//        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.NOLLA));
//        assertEquals(0, toka.getVoitetutPelit());
//        assertFalse(uusiEka.tasaPeli());
//    }
    @Test
    public void pelinVoittoTest2X() {
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[1][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][2] = Merkki.RISTI;

        assertTrue(uusiEka.tulikoVoittoVaaka(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest3X() {
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[2][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.RISTI;

        assertTrue(uusiEka.tulikoVoittoVaaka(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest4X() {
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][0] = Merkki.RISTI;

        assertTrue(uusiEka.tulikoVoittoPysty(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest5X() {
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][1] = Merkki.RISTI;

        assertTrue(uusiEka.tulikoVoittoPysty(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest6X() {
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][2] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][2] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.RISTI;

        assertTrue(uusiEka.tulikoVoittoPysty(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest7X() {
        assertFalse(uusiEka.tulikoVoittoKulma1(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoKulma1(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.RISTI;

        assertTrue(uusiEka.tulikoVoittoKulma1(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoKulma1(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest8X() {
        assertFalse(uusiEka.tulikoVoittoKulma2(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoKulma2(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[2][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[0][2] = Merkki.RISTI;

        assertTrue(uusiEka.tulikoVoittoKulma2(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoKulma2(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest1Y() {
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[0][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[0][2] = Merkki.NOLLA;

        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.RISTI));
        assertTrue(uusiEka.tulikoVoittoVaaka(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest2Y() {
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[1][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][2] = Merkki.NOLLA;

        assertTrue(uusiEka.tulikoVoittoVaaka(Merkki.NOLLA));
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.RISTI));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest3Y() {
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[2][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.NOLLA;

        assertTrue(uusiEka.tulikoVoittoVaaka(Merkki.NOLLA));
        assertFalse(uusiEka.tulikoVoittoVaaka(Merkki.RISTI));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest4Y() {
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][0] = Merkki.NOLLA;

        assertTrue(uusiEka.tulikoVoittoPysty(Merkki.NOLLA));
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.RISTI));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest5Y() {
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][1] = Merkki.NOLLA;

        assertTrue(uusiEka.tulikoVoittoPysty(Merkki.NOLLA));
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.RISTI));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest6Y() {
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][2] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][2] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.NOLLA;

        assertTrue(uusiEka.tulikoVoittoPysty(Merkki.NOLLA));
        assertFalse(uusiEka.tulikoVoittoPysty(Merkki.RISTI));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest7Y() {
        assertFalse(uusiEka.tulikoVoittoKulma1(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoKulma1(Merkki.RISTI));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.NOLLA;

        assertTrue(uusiEka.tulikoVoittoKulma1(Merkki.NOLLA));
        assertFalse(uusiEka.tulikoVoittoKulma1(Merkki.RISTI));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest8Y() {
        assertFalse(uusiEka.tulikoVoittoKulma2(Merkki.RISTI));
        assertFalse(uusiEka.tulikoVoittoKulma2(Merkki.NOLLA));
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[2][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[0][2] = Merkki.NOLLA;

        assertTrue(uusiEka.tulikoVoittoKulma2(Merkki.NOLLA));
        assertFalse(uusiEka.tulikoVoittoKulma2(Merkki.RISTI));
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void tasaPeliTest() {
        assertFalse(uusiEka.tasaPeli());
        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[0][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[0][2] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][2] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.NOLLA;
        assertTrue(uusiEka.tasaPeli());
    }

}
