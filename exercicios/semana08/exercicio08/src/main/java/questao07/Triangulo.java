package questao07;

import questao08.Comparavel;
public class Triangulo implements FiguraGeometrica, Comparavel{
    public int base;
    public int altura;
    public int l1;
    public int l2;
    public int l3;
    
    @Override
    public int calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public int calcularPerimetro() {
        return this.l1 + this.l2 + this.l3;
    }

    @Override
    public int comparar(int valor) {
        int resultado;
        if (calcularArea() < valor){
            resultado = -1;
        } else if (calcularArea() > valor){
            resultado = 1;
        } else {
            resultado = 0;
        }
        return resultado;
    }
    
}
