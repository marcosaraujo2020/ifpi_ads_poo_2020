package questao07;

import questao08.Comparavel;
public class Retangulo implements FiguraGeometrica, Comparavel {
    public int base;
    public int altura;
    
    @Override
    public int calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public int calcularPerimetro() {
        return 2 * (this.base + this.altura);
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
