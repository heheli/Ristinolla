package ristinolla.logiikka;


import javax.swing.JOptionPane;
import ristinolla.kayttaja.Pelaaja;
import ristinolla.ristinollaprojekti.kayttoliittyma.RistinollaLauta1;
import ristinolla.ristinollaprojekti.kayttoliittyma.RistinollaLauta2;

public class Peli {

    private String vuorossa;
    Pelaaja pelaaja1;
    Pelaaja pelaaja2;
    private int peliNro;

    public Peli(int peliNro) { //esimerkiksi kolme kokoa; 3x3, 6x6 ja 9x9
        this.pelaaja1 = null;
        this.pelaaja2 = null;
        this.vuorossa = "X";
        this.peliNro = peliNro;
    }

    public void setPelaaja1(Pelaaja eka) {
        this.pelaaja1 = eka;
    }

    public void setPelaaja2(Pelaaja toka) {
        this.pelaaja1 = toka;
    }

    public int getPelaajan1Pisteet() {
        return this.pelaaja1.getVoitetutPelit();
    }

    public int getPelaajan2Pisteet() {
        return this.pelaaja2.getVoitetutPelit();
    }

    public String getPelaaja1() {
        return this.pelaaja1.getNimi();
    }

    public String getPelaaja2() {
        return this.pelaaja2.getNimi();
    }

    public void kenenVuoro() {
        if (this.vuorossa.equalsIgnoreCase("X")) {
            this.vuorossa = "O";
        } else {
            this.vuorossa = "X";
        }
    }

    public void tasaPeli() {
        JOptionPane.showMessageDialog(null, "Tasapeli!", "Tasapeli!", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getVuoro() {
        return this.vuorossa;
    }

    public void xVoittaa() {
        JOptionPane.showMessageDialog(null, this.pelaaja1 + " voittaa!", "Voitto!", JOptionPane.INFORMATION_MESSAGE);
    }

    public void yVoittaa() {
        JOptionPane.showMessageDialog(null, this.pelaaja2 + " voittaa!", "Voitto!", JOptionPane.INFORMATION_MESSAGE);
    }

    public String informaatio() {
        String palautus = "Pelaajan " + this.getPelaaja1() + " pisteet: " + getPelaajan1Pisteet()
                + "\tPelaajan " + this.getPelaaja2() + " pisteet: " + getPelaajan2Pisteet();

        return palautus;
    }

    public void kaynnista() {
        if (peliNro == 1) {
            RistinollaLauta1 lauta1 = new RistinollaLauta1();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    lauta1.setVisible(true);
                }
            });
        } else if (peliNro == 2) {
            RistinollaLauta2 lauta2 = new RistinollaLauta2();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    lauta2.setVisible(true);
                }
            });
        }
    }
}
