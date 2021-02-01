package questao04;

public class Retangulo extends Quadrado {
    
    
    @Override
    public int calcularArea(){
        return super.calcularArea();
    }

    @Override
    public int calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
}
