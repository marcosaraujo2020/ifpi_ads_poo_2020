package exerciciodois;

public class TestaDecimalNumber {

	public static void main(String[] args) {
		DecimalNumber res = new DecimalNumber();
		
		res.num = 19.45;
		
		System.out.println("A parte inteira � " + res.parteInteira());
		System.out.println("A parte decimal � " + res.parteDecimal());
		
	}

}
