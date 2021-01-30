package questao04;

public class TestaPilha {

    public static void main(String[] args) {
        Pilha vetor = new Pilha();
        
        vetor.empilhar(3);
        vetor.empilhar(1);
        vetor.empilhar(5);
        vetor.empilhar(9);
        vetor.empilhar(7);
        
        vetor.empilhar(11);
        
        System.out.println("Pilha está cheia? " + vetor.estaCheia());

        vetor.exibir();
        System.out.println("Número no topo da pilha: "+ vetor.retornarTopo());
        
        vetor.desempilhar();
        vetor.exibir();
        System.out.println("Número no topo da pilha: "+ vetor.retornarTopo());
       
    }
    
}
