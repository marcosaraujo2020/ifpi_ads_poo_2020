package questao04;

public class ContaImposto {
    private double saldo;
    private int numero;
    
    //Contrutor
    public ContaImposto(double saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }
    
    //Métodos públicos
    public void creditar(double valor) {
        this.saldo += valor;
    }
    
    public void debitar(double valor) {
        this.saldo -= valor;
        retemImposto(valor);
    }
    
    private void retemImposto(double valorDebito) {
        this.saldo = this.saldo - valorDebito * 0.0038;
    }
    
    
    //Métodos públicos especiais
    public double getSaldo() {
        return saldo;
    } 
    
}
