package questao04;

public class Pilha {
    //Atributo do tipo vetor
    int[] lista = new int[5];
    int tam = 0;
    
    
    
    //Métodos públicos
    public void empilhar(int num){
        if (this.tam < this.lista.length) {
            for (int i = 0; i < this.lista.length; i++) {
                if (this.lista[i] == 0) {
                    this.lista[i] = num;
                    this.tam++;
                    break;
                }
            }
        } else {
            System.out.println("Pilha cheia. Não é possivel adicionar.");
        }
        
    }
    
    public boolean estaCheia(){       
        return this.tam == this.lista.length;
    }
    
    public void desempilhar() {
        this.tam--;
    }
    
    public int retornarTopo(){
        return this.lista[this.tam-1];
    }
    
    public void exibir() {
        //System.out.print("[ ");
        for (int i = this.tam-1; i >= 0; i--) {
            //char c = (char) this.lista[i];
            System.out.println(this.lista[i]);
        }
        //System.out.println("]");
    }
    
}
