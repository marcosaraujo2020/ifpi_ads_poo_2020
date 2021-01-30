package questao03;

public class Senha {
    //Atributo
    public String valor;
    
    
    //Métodos públicos
    // a)
    public void iguais(String valor) {
        if (this.valor.equals(valor)) {
            System.out.println("Senha correta!");
        }
        else {
            System.out.println("Senha inválida.");
        }
    }
    
    // b)
    public void iguaisTrim(String valor) {
        if (this.valor.trim().equals(valor.trim())) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
    
    // c)
    public boolean tamanhoSeguro() {
        return this.valor.length() >= 6;
    }
    
    // d)
    public boolean possuiMaiusculaMinuscula(){
        //String[] letras = this.valor.split(valor);
        for (int i = 0; i < this.valor.length(); i++){
            char resultado = this.valor.charAt(i);
            if (resultado >= 'A' && resultado <= 'Z' || resultado >= 'a' && resultado <= 'z'){
                return true;
            }
        }
        return false;
    }
    
    // e)
    public boolean possuiNumero() {
        for (int i = 0; i < this.valor.length(); i++) {
            char res = this.valor.charAt(i);
            if (res >= '0' && res <= '9') {
                return true;
            }
        }
        return false;
    }
    
    // f)
    public boolean ehValida() {
         return tamanhoSeguro() && possuiMaiusculaMinuscula() && possuiNumero();
    }
    
    
}
