package ristinolla.kayttaja;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PelaajaTest {

    Pelaaja eka;
    Pelaaja toka;

    @Before
    public void setUp() {
        eka = new Pelaaja("Pertti");
        toka = new Pelaaja("Jonne");
    }

    @Test
    public void testNimi() {
        assertEquals("Pertti", eka.getNimi());
        assertEquals("Jonne", toka.getNimi());
    }

    @Test
    public void voitonLisays() {
        assertEquals(0, eka.getVoitetutPelit());
        assertEquals(0, toka.getVoitetutPelit());
        eka.pelinVoitto();
        eka.pelinVoitto();
        toka.pelinVoitto();
        assertEquals(2, eka.getVoitetutPelit());
        assertEquals(1, toka.getVoitetutPelit());
    }

}
