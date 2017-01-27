package ristinolla.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PeliTest {

    Peli uusi;

    @Before
    public void setUp() {
        uusi = new Peli();
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

}
