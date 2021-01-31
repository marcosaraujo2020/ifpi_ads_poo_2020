package questao04;

import questao03.Animal;
import questao03.Bovino;
import questao03.Peixe;

public class TestaAnimal2 {

    public static void main(String[] args) {
        /*
        a)
        Animal a = new Bovino();
        a.setProducaoLeite(5);
        
        Essa implementação gerou Erro de Compilação. Pois o objeto a criado 
        só tem acesso ao atributo da Classe Animal, não sendo possível ter o acesso
        aos metódo da Classe Bovino.
        
        O problema é solucionado Instanciando o objeto "a" apartir Classe Bovino
        */
        
        Bovino a = new Bovino();
        a.setProducaoLeite(5);
        System.out.println("Litros de leite: " + a.getProducaoLeite() + " L");
        
           /* 
        Bovino b = new Bovino();
        
        b.setProducaoLeite(5);
        System.out.println("Litros de leite: " + b.getProducaoLeite());
        
        b)
        Peixe p = new Animal();
        
        Apresenta também erro de compilação, falha na construção. Informa que 
        são de tipos incompatível. Animal nao pode convertido para Peixe.
        
        Ou seja, o construtor deve obrigatoriamente ter o mesmo nome da Classe.
        Nessa Situação Animal é a classe super.
        
        o Erro é corrigido quando o construtor tem o mesmo nome da CLasse. 
        O correto seria: Peixe p = new Peixe();
        
        */
           
        Peixe p = new Animal();
           
    }
    
}
