package questao03;

public class TestaSenha {

    public static void main(String[] args) {
        Senha key = new Senha();
        
        key.valor = "Amordecoracao";
        
        key.iguais("amor ");
        
        key.iguaisTrim(" Amormeu ");
        
        System.out.println("Tamanho da senha é seguro? " + key.tamanhoSeguro());
        
        System.out.println("Possui pelo menos um caractere Maiúsculo ou Minúsculo? " + 
                key.possuiMaiusculaMinuscula());
        
        System.out.println("Possui pelo menos um número? " + 
                key.possuiNumero());
        
        System.out.println("A senha é válida? " + key.ehValida());

    }
    
}
