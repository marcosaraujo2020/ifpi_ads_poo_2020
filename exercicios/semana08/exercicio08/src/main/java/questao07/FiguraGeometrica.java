package questao07;

public interface FiguraGeometrica {
    
    int calcularArea();
    int calcularPerimetro();
    
    //Obs: Por padrão a Interface é "public abstract" não havendo necessidade 
    //de incluir o termo antes da assinatura do método.
    //Interface não possui atributos.
}
