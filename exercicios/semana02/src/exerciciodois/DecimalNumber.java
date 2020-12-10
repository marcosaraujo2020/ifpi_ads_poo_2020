package exerciciodois;

public class DecimalNumber {
	double num;
	
	double parteInteira(double num) {
		return (int) num;
	}
	
	double parteDecimal(double num) {
		return num - (int) num;
	}

}
