package questao04;

public class TestaFiguraGeometrica {

    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();
        Retangulo r = new Retangulo();
        
        FiguraGeometrica[] f = new FiguraGeometrica[10];
        
        f[0].altura = 0;
        
        q.base = 4;
        q.altura = 4;
        
        t.base = 3;
        t.altura = 6;
        t.l1 = 3;
        t.l2 = 3;
        t.l3 = 3;
        
        r.base = 6;
        r.altura = 4;
        
        System.out.println("Área do Quadrado: " + q.calcularArea());
        System.out.println("Perímetro do Quadrado: " + q.calcularPerimetro());
        System.out.println("Área do Triângulo: " + t.calcularArea());
        System.out.println("Perímetro do Triângulo: " + t.calcularPerimetro());
        System.out.println("Área do Retângulo: " + r.calcularArea());
        System.out.println("Perímetro do Retângulo: " + r.calcularPerimetro());
                
        
    }
    
}
