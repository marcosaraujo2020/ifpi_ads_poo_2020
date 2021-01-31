package questao02;

public class TestaCalculadora {

    public static void main(String[] args) {
        //Calculadora num = new Calculadora(6, 2);
       CalculadoraCientifica c = new CalculadoraCientifica(79, 9);
        
        System.out.println("Soma: " + c.somar());
        System.out.println("Subtração: " + c.subtrair());
        System.out.println("Divisão: " + c.dividir());
        System.out.println("Multiplicação: " + c.multiplicar());
        System.out.println("Potenciação: " + c.exponenciar(5, 2));
        
        System.out.println("Resultado divisao: " + c.dividir());
        
    }
    
}
