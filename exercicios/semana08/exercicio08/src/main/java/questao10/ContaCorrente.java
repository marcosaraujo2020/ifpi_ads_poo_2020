package questao10;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.10;
    }
    
}
