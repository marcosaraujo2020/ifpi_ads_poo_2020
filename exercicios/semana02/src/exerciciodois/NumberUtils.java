package exerciciodois;

public class NumberUtils {
	int num;
	
	boolean isPair() {
		return num % 2 == 0;
	}
	
	boolean isOdd() {
		if (num % 2 != 0) {
			return false;
		}
		return false;
	}
	
	boolean isPrime() {
		int total = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				total += 1;
			}
		}
			
		if (total == 2) {
			return true;
		}
		return false;
		
	}
	
	String printCount() {
		for (int i = 0; i <= num; i++) {
			System.out.print(i + " ");
		}	
	}
	
	String printReverseCount() {
		int i = num;
		String s = null;
		s = s + " ";
		while (i >= 0) {
			s = s + i + " ";
			i--;
		}
		return s;
	}

}
