package ristinolla.logiikka;

import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import ristinolla.kayttaja.Pelaaja;

public class Peli {

    private String vuorossa;
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;
    private HashMap<String, String> taulu;

    public Peli(Pelaaja pelaaja1, Pelaaja pelaaja2) { //esimerkiksi kolme kokoa; 3x3, 6x6
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
        this.vuorossa = "X";
        this.taulu = new HashMap();

        taulu.put("1.1", "");
        taulu.put("1.2", "");
        taulu.put("1.3", "");
        taulu.put("2.1", "");
        taulu.put("2.2", "");
        taulu.put("2.3", "");
        taulu.put("3.1", "");
        taulu.put("3.2", "");
        taulu.put("3.3", "");

    }

    public void kenenVuoro() {
        if (this.vuorossa.equalsIgnoreCase("X")) {
            this.vuorossa = "O";
        } else {
            this.vuorossa = "X";
        }
    }

    public void vaihdaTaulukonArvo(String ruutu, String xy) {
        this.taulu.put(ruutu, xy);
    }

    public HashMap<String, String> getPistetaulukko() {
        return this.taulu;
    }

    public boolean pelinVoittoX() {
        if (taulu.get("1.1").equals("X") && taulu.get("1.2").equals("X") && taulu.get("1.3").equals("X")) {
            return true;
        } else if (taulu.get("2.1").equals("X") && taulu.get("2.2").equals("X") && taulu.get("2.3").equals("X")) {
            return true;
        } else if (taulu.get("3.1").equals("X") && taulu.get("3.2").equals("X") && taulu.get("3.3").equals("X")) {
            return true;
        } else if (taulu.get("1.1").equals("X") && taulu.get("2.1").equals("X") && taulu.get("3.1").equals("X")) {
            return true;
        } else if (taulu.get("1.2").equals("X") && taulu.get("2.2").equals("X") && taulu.get("3.2").equals("X")) {
            return true;
        } else if (taulu.get("1.3").equals("X") && taulu.get("2.3").equals("X") && taulu.get("3.3").equals("X")) {
            return true;
        } else if (taulu.get("1.1").equals("X") && taulu.get("2.2").equals("X") && taulu.get("3.3").equals("X")) {
            return true;
        } else if (taulu.get("3.1").equals("X") && taulu.get("2.2").equals("X") && taulu.get("1.3").equals("X")) {
            return true;
        }
        return false;

    }

    public boolean pelinVoittoY() {
        if (taulu.get("1.1").equals("O") && taulu.get("1.2").equals("O") && taulu.get("1.3").equals("O")) {
            return true;
        } else if (taulu.get("2.1").equals("O") && taulu.get("2.2").equals("O") && taulu.get("2.3").equals("O")) {
            return true;
        } else if (taulu.get("3.1").equals("O") && taulu.get("3.2").equals("O") && taulu.get("3.3").equals("O")) {
            return true;
        } else if (taulu.get("1.1").equals("O") && taulu.get("2.1").equals("O") && taulu.get("3.1").equals("O")) {
            return true;
        } else if (taulu.get("1.2").equals("O") && taulu.get("2.2").equals("O") && taulu.get("3.2").equals("O")) {
            return true;
        } else if (taulu.get("1.3").equals("O") && taulu.get("2.3").equals("O") && taulu.get("3.3").equals("O")) {
            return true;
        } else if (taulu.get("1.1").equals("O") && taulu.get("2.2").equals("O") && taulu.get("3.3").equals("O")) {
            return true;
        } else if (taulu.get("3.1").equals("O") && taulu.get("2.2").equals("O") && taulu.get("1.3").equals("O")) {
            return true;
        }
        return false;
    }

    public boolean tasaPeli() {
        for (String xy : this.taulu.values()) {
            if (xy.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean pelinTarkastus() {

        if (pelinVoittoX()) {
            xVoittaa();
            return true;
        }
        if (pelinVoittoY()) {
            yVoittaa();
            return true;
        }
        if (tasaPeli()) {
            tasaPeliViesti();
            return true;
        }
        return false;
    }

    public void laudanResetointi() {
        taulu.put("1.1", "");
        taulu.put("1.2", "");
        taulu.put("1.3", "");
        taulu.put("2.1", "");
        taulu.put("2.2", "");
        taulu.put("2.3", "");
        taulu.put("3.1", "");
        taulu.put("3.2", "");
        taulu.put("3.3", "");
    }

    public void tasaPeliViesti() {
        JOptionPane.showMessageDialog(null, "Tasapeli!", "Tasapeli!", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getVuoro() {
        return this.vuorossa;
    }

    public String pelaajanVuoro() {
        if (this.vuorossa.equals("X")) {
            return this.pelaaja1.getNimi();
        }
        return this.pelaaja2.getNimi();
    }

    public void xVoittaa() {
        this.pelaaja1.pelinVoitto();
        JOptionPane.showMessageDialog(null, this.pelaaja1 + " voittaa!", "Voitto!", JOptionPane.INFORMATION_MESSAGE);
    }

    public void yVoittaa() {
        this.pelaaja2.pelinVoitto();
        JOptionPane.showMessageDialog(null, this.pelaaja2 + " voittaa!", "Voitto!", JOptionPane.INFORMATION_MESSAGE);
    }

    public String informaatio() {
        String palautus = "Pelaajan " + this.pelaaja1 + " pisteet: " + this.pelaaja1.getVoitetutPelit() + "            Vuorossa: "
                + pelaajanVuoro() + "               "
                + "Pelaajan " + this.pelaaja2 + " pisteet: " + this.pelaaja2.getVoitetutPelit();
        return palautus;
    }

}
