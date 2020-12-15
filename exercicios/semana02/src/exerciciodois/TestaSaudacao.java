package exerciciodois;

public class TestaSaudacao {

	public static void main(String[] args) {
		Saudacao msg = new Saudacao();
		
		msg.texto = "Bom dia";
		msg.destinatario = "Marcos";
		
		System.out.println(msg.obterSaudacao());

	}

}
