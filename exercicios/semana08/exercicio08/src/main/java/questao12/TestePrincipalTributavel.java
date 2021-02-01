package questao12;

import questao10.ContaCorrente;
import questao10.SeguroDeVida;
import questao11.AuditoriaInterna;

public class TestePrincipalTributavel {
    
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaCorrente cc1 = new ContaCorrente();
        SeguroDeVida sv = new SeguroDeVida();
        SeguroDeVida sv1 = new SeguroDeVida();
        
        AuditoriaInterna a = new AuditoriaInterna();
        
        cc.setNome("Marcos");
        cc.setSaldo(890);
        
        cc1.setNome("Ana Maria");
        cc1.setSaldo(1800);
        
        a.adicionar(cc);
        a.adicionar(sv);
        a.adicionar(cc1);
        a.adicionar(sv1);
        
        System.out.println("Valor total de tributos: R$ " + a.calculaTributos());
        
        a.exibir();
        
    }
}
