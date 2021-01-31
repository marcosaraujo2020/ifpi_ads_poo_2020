package questao03;

public class Teste {

    public static void main(String[] args) {
        Bovino b = new Bovino();
        Peixe p = new Peixe();
        
                
        b.setProducaoLeite(5);
        b.setEspecie("Gato");
        
        System.out.println(b.getEspecie());
        System.out.println("Quantos liros de leite? " + b.getProducaoLeite());

    }
    
}
