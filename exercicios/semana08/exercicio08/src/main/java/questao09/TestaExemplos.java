package questao09;

import questao07.Quadrado;
import questao07.Retangulo;
import questao07.Triangulo;

public class TestaExemplos {
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        Retangulo r = new Retangulo();
        Triangulo t = new Triangulo();
        
        q.lado = 5;
                
        r.base = 9;
        r.altura = 4;
        
        t.base = 3;
        t.altura = 5;
        t.l1 = 3;
        t.l2 = 4;
        t.l3 = 7;
        
        System.out.println("------------------------------------------------");
        System.out.println("Área do Quadrado: " + q.calcularArea());
        System.out.println("Perímetro do Quadrado: " + q.calcularPerimetro());
        System.out.println("Área do Retângulo: " + r.calcularArea());
        System.out.println("Perímetro do Retângulo: " + r.calcularPerimetro());
        System.out.println("Área do Triângulo: " + t.calcularArea());
        System.out.println("Perímetro do Triângulo: " + t.calcularPerimetro());
        System.out.println("------------------------------------------------");
        
        System.out.println("Resultado: " + q.comparar(15));
        System.out.println("Resultado: " + r.comparar(36));
        System.out.println("Resultado: " + t.comparar(25));
        System.out.println("------------------------------------------------");
        
        System.out.println("Resultado: " + q.comparar(r.calcularArea()));
        System.out.println("Resultado: " + r.comparar(t.calcularArea()));
        System.out.println("Resultado: " + t.comparar(q.calcularArea()));
        System.out.println("Resultado: " + t.comparar(t.calcularArea()));
        
    }
    
}
