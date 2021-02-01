package questao11;

import java.util.ArrayList;
import questao10.Tributavel;

public class AuditoriaInterna implements Tributavel {
    ArrayList<Tributavel> tibutaveis = new ArrayList<>();
    
    public void adicionar(Tributavel obj) {
        this.tibutaveis.add(obj);
        /*
        for (int i = 0; i < this.tibutaveis.size(); i++) {
            if(this.tibutaveis.get(i) == null) {
                this.tibutaveis.add(obj);
            }
        }     
        */
    }

    @Override
    public double calculaTributos() {
        double soma = 0;
        for (int i = 0; i < this.tibutaveis.size(); i++) {
            soma += this.tibutaveis.get(i).calculaTributos();
        }
        return soma;
    }
    
    public void exibir() {
        for (Tributavel i: this.tibutaveis) {
            System.out.println(i.calculaTributos());
        }
        
     }
}
