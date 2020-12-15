package exerciciodois;

public class TestaDesconto {

	public static void main(String[] args) {
		Desconto res = new Desconto();
		
		res.valor = 120.00;
		res.porcentagem = 10;
		
		System.out.println("Valor com desconto é R$ " + res.calcula() + " reais.");
	}
}
