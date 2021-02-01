package questao04;

public class Quadrado extends FiguraGeometrica{
    
    
    @Override
    public int calcularArea(){
        return this.base * this.altura;
    }

    @Override
    public int calcularPerimetro() {
        return 4 * this.base;
    }
}
