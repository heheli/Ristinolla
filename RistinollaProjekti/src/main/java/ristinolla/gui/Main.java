package ristinolla.gui;

import ristinolla.kayttaja.Pelaaja;

/**
 * Pääluokka, joka suorittamalla käynnistetään peli.
 *
 * @author poutihel
 */
public class Main {

    public static void main(String[] args) {

        Aloitus uusipeli = new Aloitus();
        uusipeli.aloita();

    }

}
