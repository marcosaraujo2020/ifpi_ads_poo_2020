package questao11a16;

public class TesteAB {

    public static void main(String[] args) {
        // Questão 11
        B b = new B();
        A a = new A();
        
        System.out.println(b instanceof A); //true  (V)
        System.out.println(a instanceof B); //false (V)
        
        /*
        
        //B possui o atributo 1 >>> (F)
        b.; //false  (atributo private, não fica visível para "b").  (V)
        b.atributo1 = 10; // Atributo modificado para protected fica disponivel para "b".  (V)
        
        // Questão 12
        A aa = new B();
        System.out.println(aa.metodo1());
        // exibiu: "metodo 1, classe B"
        
        // Questão 13
        System.out.println(aa.metodo2());
        /*
        System.out.println(a.metodo2());
        Apresenta Erro de compilação. A justificativa é que o objeto "a" é 
        uma instância da Classe A no qual não possui o "método2";
        */
        
        
        // Questão 14
       // A aa = new B();
        //System.out.println(aa.metodo1());
        
        /*
    '   A saída exibiu: "metodo 1, Classe A"
        Ou seja, o uso do "super" no metodo sobreescrito na Classe B utilizou-se
        do método da Classe Mãe.
        */
        
    }
    
}
