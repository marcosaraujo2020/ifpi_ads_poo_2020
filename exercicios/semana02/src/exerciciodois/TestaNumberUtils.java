package exerciciodois;

public class TestaNumberUtils {

	public static void main(String[] args) {
		NumberUtils res = new NumberUtils();
		
		res.num = 17;
		
		System.out.println(res.num + " é par? " + res.isPair());
		System.out.println(res.num + " é ímpar? " + res.isOdd());
		System.out.println(res.num + " é numero primo? " + res.isPrime());
		
	}
}
