package questao06;

public class Postagem {
    //Atributos
    public int id;
    public int qtdCurtidas;
    public String texto;

    public Postagem(int id, int qtdCurtidas, String texto) {
        this.id = id;
        this.qtdCurtidas = qtdCurtidas;
        this.texto = texto;
    }
    
    //Métodos públicos
    public void curtir() {
        this.qtdCurtidas++;
    }

    @Override
    public String toString() {
        return "Postagem{" + "id = " + id + ", qtdCurtidas = " + qtdCurtidas + 
                ", texto = " + texto + '}';
    }
    
    
    
}
