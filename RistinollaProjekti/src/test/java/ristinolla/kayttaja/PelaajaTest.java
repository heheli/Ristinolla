package ristinolla.kayttaja;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PelaajaTest {

    Pelaaja eka;
    Pelaaja toka;

    @Before
    public void setUp() {
        eka = new Pelaaja();
        toka = new Pelaaja();
    }

    @Test
    public void testNimi() {
        assertEquals(null, eka.getNimi());
        eka.setNimi("Pertti");
        assertEquals("Pertti", eka.getNimi());
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
