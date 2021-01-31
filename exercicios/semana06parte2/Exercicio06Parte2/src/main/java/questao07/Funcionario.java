package questao07;

import questao06.Pessoa;

public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;
    
    
    public double getSalarioPrimeiraParcela() {
        return getSalario() * 0.60;
    }
    
    public double getSalarioSegundaParcela() {
        return getSalario() * 0.40;
    }
    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    

}
