package ristinolla.logiikka;

import org.junit.Test;
import static org.junit.Assert.*;

public class MerkkiTest {

    @Test
    public void toStringTest() {
        assertEquals("X", Merkki.RISTI.toString());
        assertEquals("O", Merkki.NOLLA.toString());
    }

}
