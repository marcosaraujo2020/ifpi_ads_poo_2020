package exerciciodois;

public class Desconto {
	double valor, valorCalculado, porcentagem;
	
	double calcula() {
		valorCalculado = valor * (1-porcentagem / 100);	
		return valorCalculado;	
	}
}
