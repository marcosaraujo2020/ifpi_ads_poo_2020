package questao02;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class CalculadoraCientifica extends Calculadora {

    public CalculadoraCientifica(int op1, int op2) {
        super(op1, op2);
    }
    
    public double exponenciar(int base, int exp) {
        return (double) pow(base, exp);
    }
    
    @Override
    public double dividir(){
        double resultado = super.dividir();
        double res = resultado - abs(resultado);
        if (res > 0.5) {
            return (int) resultado;
        }
        else {
            return (int) resultado+1;
        }
    }
    
}
