package questao01;

public class Carro extends Veiculo {
    /*
    Carro é uma subclasse que herda atributos da Super Classe Veiculo.
    Portanto, na Classe Main o objeto poderá ser instanciado a partir da 
    Classe Carro.
    */
    
    public void detalhes() {
        System.out.println("===============================");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Placa: " + this.getPlaca());
        
    }
    
}
