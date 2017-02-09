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
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("1.1", "X");
        uusiEka.vaihdaTaulukonArvo("1.2", "X");
        uusiEka.vaihdaTaulukonArvo("1.3", "X");

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest2X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("2.1", "X");
        uusiEka.vaihdaTaulukonArvo("2.2", "X");
        uusiEka.vaihdaTaulukonArvo("2.3", "X");

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest3X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("3.1", "X");
        uusiEka.vaihdaTaulukonArvo("3.2", "X");
        uusiEka.vaihdaTaulukonArvo("3.3", "X");

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest4X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("1.1", "X");
        uusiEka.vaihdaTaulukonArvo("2.1", "X");
        uusiEka.vaihdaTaulukonArvo("3.1", "X");

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest5X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("1.2", "X");
        uusiEka.vaihdaTaulukonArvo("2.2", "X");
        uusiEka.vaihdaTaulukonArvo("3.2", "X");

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest6X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("1.3", "X");
        uusiEka.vaihdaTaulukonArvo("2.3", "X");
        uusiEka.vaihdaTaulukonArvo("3.3", "X");

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest7X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("1.1", "X");
        uusiEka.vaihdaTaulukonArvo("2.2", "X");
        uusiEka.vaihdaTaulukonArvo("3.3", "X");

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest8X() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("1.3", "X");
        uusiEka.vaihdaTaulukonArvo("2.2", "X");
        uusiEka.vaihdaTaulukonArvo("3.1", "X");

        assertTrue(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest1Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("1.1", "O");
        uusiEka.vaihdaTaulukonArvo("1.2", "O");
        uusiEka.vaihdaTaulukonArvo("1.3", "O");

        assertFalse(uusiEka.pelinVoittoX());
        assertTrue(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest2Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("2.1", "O");
        uusiEka.vaihdaTaulukonArvo("2.2", "O");
        uusiEka.vaihdaTaulukonArvo("2.3", "O");

        assertTrue(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest3Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("3.1", "O");
        uusiEka.vaihdaTaulukonArvo("3.2", "O");
        uusiEka.vaihdaTaulukonArvo("3.3", "O");

        assertTrue(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest4Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("1.1", "O");
        uusiEka.vaihdaTaulukonArvo("2.1", "O");
        uusiEka.vaihdaTaulukonArvo("3.1", "O");

        assertTrue(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest5Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("1.2", "O");
        uusiEka.vaihdaTaulukonArvo("2.2", "O");
        uusiEka.vaihdaTaulukonArvo("3.2", "O");

        assertTrue(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest6Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("1.3", "O");
        uusiEka.vaihdaTaulukonArvo("2.3", "O");
        uusiEka.vaihdaTaulukonArvo("3.3", "O");

        assertTrue(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest7Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("1.1", "O");
        uusiEka.vaihdaTaulukonArvo("2.2", "O");
        uusiEka.vaihdaTaulukonArvo("3.3", "O");

        assertTrue(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void pelinVoittoTest8Y() {
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.tasaPeli());

        uusiEka.vaihdaTaulukonArvo("1.3", "O");
        uusiEka.vaihdaTaulukonArvo("2.2", "O");
        uusiEka.vaihdaTaulukonArvo("3.1", "O");

        assertTrue(uusiEka.pelinVoittoY());
        assertFalse(uusiEka.pelinVoittoX());
        assertFalse(uusiEka.tasaPeli());
    }

    @Test
    public void tasaPeliTest() {
        assertFalse(uusiEka.tasaPeli());
        uusiEka.vaihdaTaulukonArvo("1.3", "O");
        uusiEka.vaihdaTaulukonArvo("2.2", "O");
        uusiEka.vaihdaTaulukonArvo("3.1", "X");
        uusiEka.vaihdaTaulukonArvo("1.1", "X");
        uusiEka.vaihdaTaulukonArvo("1.2", "O");
        uusiEka.vaihdaTaulukonArvo("2.1", "O");
        uusiEka.vaihdaTaulukonArvo("3.2", "X");
        uusiEka.vaihdaTaulukonArvo("3.3", "O");
        uusiEka.vaihdaTaulukonArvo("2.3", "X");
        assertTrue(uusiEka.tasaPeli());
    }

}
