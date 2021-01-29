package questao04;

public class TestaConta {
    public static void main(String[] args) {
        ContaImposto c = new ContaImposto(200.0f, 12546);
        
        c.creditar(300);
        c.debitar(100);
        
        System.out.println("Saldo: R$ " + c.getSaldo());
    }
    
}
