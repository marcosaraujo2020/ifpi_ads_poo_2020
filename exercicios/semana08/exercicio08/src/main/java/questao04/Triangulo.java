package questao04;

public class Triangulo extends Quadrado{
    public int l1, l2, l3;
    
    @Override
    public int calcularArea(){
        return super.calcularArea()/2;
    }

    @Override
    public int calcularPerimetro() {
        return this.l1 + this.l2 + this.l3;
    }
}
