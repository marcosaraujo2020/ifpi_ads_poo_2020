package questao02;

public class Calculadora {
    private int op1;
    private int op2;

    public Calculadora(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }
    
    public double somar() {
        return this.getOp1() + this.getOp2();
    }
    
    public double subtrair() {
        return this.getOp1() - this.getOp2();
    }

    public double multiplicar() {
        return this.getOp1() * this.getOp2();
    }
    
    public double dividir() {
        return this.getOp1() / this.getOp2();
    }
    
                

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }
}
