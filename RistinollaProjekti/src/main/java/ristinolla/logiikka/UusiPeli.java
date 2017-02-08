package ristinolla.logiikka;

import ristinolla.kayttaja.Pelaaja;
import ristinolla.gui.RistinollaLauta1;
import ristinolla.gui.RistinollaLauta2;

public class UusiPeli {

    private int peliNro;
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;

    public UusiPeli(int peliNro) {
        this.peliNro = peliNro;
        this.pelaaja1 = null;
        this.pelaaja2 = null;
    }

    public void setPelaaja1(Pelaaja eka) {
        this.pelaaja1 = eka;
    }

    public void setPelaaja2(Pelaaja toka) {
        this.pelaaja2 = toka;
    }

    public int getPelaajan1Pisteet() {
        return this.pelaaja1.getVoitetutPelit();
    }

    public int getPelaajan2Pisteet() {
        return this.pelaaja2.getVoitetutPelit();
    }

    public String getPelaaja1() {
        if (this.pelaaja1 == null) {
            setPelaaja1(new Pelaaja("X"));
        }
        return this.pelaaja1.getNimi();
    }

    public String getPelaaja2() {
        if (this.pelaaja2 == null) {
            setPelaaja2(new Pelaaja("Y"));
        }
        return this.pelaaja2.getNimi();
    }

    public void kaynnista() {
        if (peliNro == 1) {
            RistinollaLauta1 lauta1 = new RistinollaLauta1(this.pelaaja1, this.pelaaja2);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    lauta1.setVisible(true);
                }
            });
        } else if (peliNro == 2) {
            RistinollaLauta2 lauta2 = new RistinollaLauta2(this.pelaaja1, this.pelaaja2);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    lauta2.setVisible(true);
                }
            });
        }
    }

}
