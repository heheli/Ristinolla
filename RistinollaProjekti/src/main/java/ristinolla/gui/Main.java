package ristinolla.gui;

import ristinolla.logiikka.UusiPeli;
import ristinolla.kayttaja.Pelaaja;

public class Main {

    public static void main(String[] args) {
        Pelaaja x = new Pelaaja("Pertti");
        Pelaaja y = new Pelaaja("Jonne");
        UusiPeli uusiPeli = new UusiPeli(1);
        uusiPeli.setPelaaja1(x);
        uusiPeli.setPelaaja2(y);
        uusiPeli.kaynnista();
    }

}
