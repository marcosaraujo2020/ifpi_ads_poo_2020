package questao06;

public class Microblog {
    //Atributos
    Postagem[] postagens = new Postagem[10];
    public int indice;
    public int numPostagens;
    private int tam = 0;
    
    //Construtor
    public Microblog(int numMax) {
        this.numPostagens = numMax;
    }
    
    //Métodos 
    public void incluirPost(Postagem post) {
       if (this.tam < this.postagens.length) {
           for (int i = 0; i < this.postagens.length; i++) {
                if (this.postagens[i] == null) {
                    this.postagens[i] = post;
                    this.tam++;
                    break;
                }
            }
        } else {
            System.out.println("Pilha cheia. Não é possivel adicionar.");
        }
    }
    
    public void excluirPost(int id) {
        int encontrado = 0;
        for(int i = 0; i < this.tam; i++) {
            if (this.postagens[i].id == id) {
                this.postagens[i] = this.postagens[i+1];
                this.postagens[i+1] = this.postagens[this.tam];
                this.tam--;
                encontrado++;
            }
        }
        if (encontrado == 0) {
            System.out.println("Id não encontrado!");
        }
    }
    
    public String maisCurtida() {
        int maior = 0;
        Postagem l = null;
        for (int i = 0; i < this.tam; i++) {
            if (this.postagens[i].qtdCurtidas > maior) {
                maior = this.postagens[i].qtdCurtidas;
                l = this.postagens[i];
            }
        }
        return l.toString();
    }
    
    public void curtir(int id) {
        for (int i = 0; i < this.tam; i++) {
            if (this.postagens[i].id == id) {
                postagens[i].curtir();
            }
        }
    }
    
    public void exibir() {
        for (int i = 0; i < this.tam; i++) {
            System.out.println(this.postagens[i].toString());
        }
    }
    
}
