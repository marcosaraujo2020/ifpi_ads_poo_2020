package questao02;

public class TestaCodigo2 {
    public static void main(String[] args) {
        /*
        O programa apresentou a mensagem: COMPILATION ERROR
        Motivo: Foi instanciado um objeto contas do tipo Array de uma Classe 
        Conta inexistente.
        
        A alternativa para correção PRIMEIRO criar a Classe Conta com seus atributos
        e método construtor, e depois instanciar um objeto Conta "c" construido 
        a partir do construtor. Em seguida o Vetor contas no indice 0 passou a 
        receber o objeto c para assim ser possível imprimir o valor do saldo.        
        */      
        
        Conta[] contas = new Conta[5];
        Conta c = new Conta("Marcos", 25878, 10);
                
        contas[0] = c;
                
        System.out.println("Saldo em conta: R$ " + contas[0].saldo);
        
    }
    
}
