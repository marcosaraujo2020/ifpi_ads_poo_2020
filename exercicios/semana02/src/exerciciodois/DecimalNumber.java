package exerciciodois;

public class DecimalNumber {
	double num;
		
	int parteInteira() {
		return (int) num;
	}
	
	double parteDecimal() {
		return num - (int) num;
	}
}
