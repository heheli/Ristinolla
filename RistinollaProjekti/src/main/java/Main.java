
import ristinolla.kayttaja.Pelaaja;
import ristinolla.logiikka.Peli;
import ristinolla.logiikka.RistinollaLauta1;
import ristinolla.logiikka.RistinollaLauta2;
import ristinolla.ristinollaprojekti.kayttoliittyma.UusiPeli;

public class Main {

    public static void main(String[] args) {
        UusiPeli uusipeli = new UusiPeli(1);
        uusipeli.kaynnista();
    }

}
