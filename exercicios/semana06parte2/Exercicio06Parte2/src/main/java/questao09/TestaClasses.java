package questao09;

import questao06.Pessoa;
import questao07.Funcionario;
import questao08.Professor;

public class TestaClasses {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Marcos", "Araújo Silva");
        Funcionario f = new Funcionario();
        Professor prof = new Professor();
        
        p1.setNome("Antonio");
        p1.setSobrenome("Silva Santos");
        
        f.setNome(p2.getNome());
        f.setSobrenome(p2.getSobrenome());
        f.setMatricula(73831);
        f.setSalario(12000.0f);
        
        prof.setNome(f.getNome());
        prof.setSobrenome(f.getSobrenome());
        prof.setMatricula(f.getMatricula());
        prof.setTitulacao("Mestre em Química");
        prof.setSalario(f.getSalario());
       
        System.out.println("----------------------------------------------");
        System.out.println("Nome do Funcionario: " + prof.getNomeCompleto());
        System.out.println("Matricula: " + prof.getMatricula());
        System.out.println("Titulação: " + prof.getTitulacao());
        System.out.println("Salário: R$ " + prof.getSalario());
        System.out.println("----------------------------------------------");
        System.out.println("Primeira Parcela Salário: R$ " + prof.getSalarioPrimeiraParcela());
        System.out.println("Segunda Parcela Salário: R$ " + prof.getSalarioSegundaParcela());
        
        
        
    }
    
}
