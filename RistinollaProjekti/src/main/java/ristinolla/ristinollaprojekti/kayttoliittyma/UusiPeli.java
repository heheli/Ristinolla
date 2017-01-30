
package ristinolla.ristinollaprojekti.kayttoliittyma;

import ristinolla.logiikka.RistinollaLauta1;
import ristinolla.logiikka.RistinollaLauta2;


public class UusiPeli {
    
    private int peliNro;
    
    public UusiPeli(int peliNro){
        this.peliNro = peliNro;
    }
    public void kaynnista(){
        if(this.peliNro == 1){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RistinollaLauta1().setVisible(true);
            }
        });
        } else if (this.peliNro == 2){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RistinollaLauta2().setVisible(true);
            }
        });
        }
    }
    
}
