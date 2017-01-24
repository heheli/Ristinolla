
package kayttaja;

import java.util.ArrayList;
import java.util.List;


public class PelaajaVarasto {
    
    private List<Pelaaja> pelaajaLista;
    
    public PelaajaVarasto(){
        this.pelaajaLista = new ArrayList<>();
    }
    public void lisaaPelaaja(Pelaaja pelaaja){
        this.pelaajaLista.add(pelaaja);
    }
    public List getPelaajaLista(){
        return this.pelaajaLista;
    }
    public Pelaaja getParasPelaaja(){
        Pelaaja paras = pelaajaLista.get(0);
        for(Pelaaja x : this.pelaajaLista){
            if(x.getVoitetutPelit() > paras.getVoitetutPelit()){
                paras = x;
            }
        }
        return paras;
    }
}
