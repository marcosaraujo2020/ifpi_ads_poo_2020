package questao01;

public class Horista extends Diarista {
    
    
    @Override
    public double calcularSalario() {
       return super.calcularSalario()/ 24;
    }
    
}
