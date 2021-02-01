package questao07;

import questao08.Comparavel;

public class Quadrado implements FiguraGeometrica, Comparavel{
    public int lado;
    
    @Override
    public int calcularArea() {
        return this.lado * this.lado;
    }
    
    @Override
    public int calcularPerimetro() {
        return 4 * this.lado;
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
