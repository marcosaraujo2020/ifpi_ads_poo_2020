package questao03;

public class Calculadora {
    //Atributos
    private int operando1;
    private int operando2;
    
    //Método Construtor
    public Calculadora(int valor1, int valor2) {
        this.operando1 = valor1;
        this.operando2 = valor2;
    }
     
    //Métodos públicos 
    public void somar() {
        int soma = this.operando1 + this.operando2;
        System.out.println("O resultado da soma é " + soma);
    }
    
    public void substrair() {
        int subtracao = this.operando1 - this.operando2;
        System.out.println("O resultado da subtração é " + subtracao);
    }

    public void multiplicar() {
        int multiplicacao = this.operando1 * this.operando2;
        System.out.println("O resultado da multiplicação é " + multiplicacao);
    }
    
    public void dividir() {
        int divisao = this.operando1 / this.operando2;
        System.out.println("O resultado da divisão é " + divisao);
    }
    
}
