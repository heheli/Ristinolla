
import ristinolla.kayttaja.Pelaaja;
import ristinolla.logiikka.Peli;
import ristinolla.ristinollaprojekti.kayttoliittyma.RistinollaLauta1;
import ristinolla.ristinollaprojekti.kayttoliittyma.RistinollaLauta2;

public class Main {

    public static void main(String[] args) {
        Peli uusi = new Peli(1);
        Pelaaja x = new Pelaaja("Pertti");
        Pelaaja y = new Pelaaja("Jonne");
        uusi.setPelaaja1(x);
        uusi.setPelaaja2(y);
        uusi.kaynnista();
    }

}
