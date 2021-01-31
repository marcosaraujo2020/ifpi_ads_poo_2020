package questao08;

import questao07.Funcionario;

public class Professor extends Funcionario {
    private String titulacao;

    
    @Override
    public double getSalarioPrimeiraParcela() {
        return getSalario();
    }
    
    @Override
    public double getSalarioSegundaParcela() {
        double total = super.getSalarioPrimeiraParcela() + super.getSalarioSegundaParcela();
        return getSalario() - total;
    }
    
    
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    
    
}
