package questao01;

public class Testar {

    public static void main(String[] args) {
        Empregado e = new Empregado();
        Diarista d = new Diarista();
        Horista h = new Horista();
        
        System.out.println("Salário do Mensalista: R$ " + e.calcularSalario());
        System.out.println("Salário do Diarista: R$ " + d.calcularSalario());
        System.out.println("Salário do Horista: R$ " + h.calcularSalario());
        
        
    }
    
}
