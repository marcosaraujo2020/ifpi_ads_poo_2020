package exerciciodois;

public class Desconto {
	double valor, valorCalculado;
	double porcentagem;
	
	double calcula(double valor, double porcentagem) {
		valorCalculado = valor - valor * porcentagem / 100;	
		return valorCalculado;
		
	}

}
