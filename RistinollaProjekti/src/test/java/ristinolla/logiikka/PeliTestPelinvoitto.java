package ristinolla.logiikka;

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

    @Test
    public void pelinVoittoTest1X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[0][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[0][2] = Merkki.RISTI;

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest2X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[1][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][2] = Merkki.RISTI;

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest3X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[2][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.RISTI;

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest4X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][0] = Merkki.RISTI;

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest5X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][1] = Merkki.RISTI;

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest6X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][2] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][2] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.RISTI;

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest7X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.RISTI;

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest8X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[2][0] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.RISTI;
        uusiEka.getMerkkitaulu()[0][2] = Merkki.RISTI;

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest1Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[0][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[0][2] = Merkki.NOLLA;

        assertFalse(uusiEka.pelinVoittoX());
        assertTrue(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest2Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[1][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][2] = Merkki.NOLLA;

        assertTrue(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest3Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[2][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.NOLLA;

        assertTrue(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest4Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][0] = Merkki.NOLLA;

        assertTrue(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest5Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][1] = Merkki.NOLLA;

        assertTrue(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest6Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][2] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][2] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.NOLLA;

        assertTrue(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest7Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[0][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[2][2] = Merkki.NOLLA;

        assertTrue(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest8Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.getMerkkitaulu()[2][0] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[1][1] = Merkki.NOLLA;
        uusiEka.getMerkkitaulu()[0][2] = Merkki.NOLLA;

        assertTrue(uusiEka.pelinVoittoO());
        assertFalse(uusiEka.pelinVoittoX());
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
