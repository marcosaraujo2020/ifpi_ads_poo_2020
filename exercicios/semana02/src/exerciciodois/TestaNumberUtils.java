package exerciciodois;

public class TestaNumberUtils {

	public static void main(String[] args) {
		NumberUtils res = new NumberUtils();
		
		res.num = 17;
		
		System.out.println(res.num + " � par? " + res.isPair());
		System.out.println(res.num + " � �mpar? " + res.isOdd());
		System.out.println(res.num + " � numero primo? " + res.isPrime());
		
	}
}
