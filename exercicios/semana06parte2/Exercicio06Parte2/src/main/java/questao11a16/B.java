package questao11a16;

public class B extends A {
    
    /*
    public String metodo1() {
        return "metodo 1, classe B";
        //return super.metodo1();
    }
    
    // Questão 15
    /*
    public String metodo1() {
        return "metodo 1 da classe B, segunda versão";
        //return super.metodo1();
    }
    
    // Questão 16
    /*
    Os métodos1 implementado duas vezes com a mesma assinatura (sem parâmetros),
    apresenta erro no segundo que foi implementado, pois já foi definido e o 
    sistema nao aceita repetição do método. Portanto, para isso ser
    possível, o Polimorfismo de Sobrecarga resolveria essa situação caso o metodo1
    que foi implementado novamente tivesse assinatura por exemplo do tipo "String texto" 
    como parâmetro.
    */
    public String metodo2() {
        return "metodo 2, classe B";
    }
    
    
    
    
}
