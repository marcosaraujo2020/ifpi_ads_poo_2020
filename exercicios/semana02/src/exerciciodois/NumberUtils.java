package exerciciodois;

public class NumberUtils {
	int num;
	
	boolean isPair(int num) {
		return num % 2 == 0;
	}
	
	boolean isOdd(int num) {
		if (num % 2 != 0) {
			return false;
		}
		return false;
	}
	
	boolean isPrime(int num) {
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
	
	void printCount(int num) {
		for (int i = 0; i <= num; i++) {
			System.out.print(i + " ");
		}	
	}
	
	void printReverseCount(int num) {
		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
	}

}
