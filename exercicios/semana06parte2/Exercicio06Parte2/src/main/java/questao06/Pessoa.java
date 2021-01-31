package questao06;

public class Pessoa {
    //Atributos
    private String nome;
    private String sobrenome;
    
    //Construtor sem parâmetros
    public Pessoa() {
    }
    
    //Construtor com parâmetros e com atributo a ser alterados
    public Pessoa(String nome, String sobrenome) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
    }
       
    
    //Método público
    public String getNomeCompleto() {
        return this.getNome() + " " + this.getSobrenome();
    }
    
    
    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
    
    
    
}
