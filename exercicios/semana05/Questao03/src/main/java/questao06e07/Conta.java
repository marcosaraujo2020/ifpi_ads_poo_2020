package questao06e07;

public class Conta {
    //Atributos
    private String numero;
    private double saldo;

    //Construtor
    Conta(String numero, double valor) {
        this.numero = numero;
        this.saldo = valor;
    }
    
    
    //Métodos
    void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }

    void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    double consultarSaldo() {
        return this.saldo;
    }

    void transferir(Conta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }   

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
