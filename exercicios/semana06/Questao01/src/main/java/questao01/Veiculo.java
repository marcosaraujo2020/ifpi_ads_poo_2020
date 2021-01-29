package questao01;

public abstract class Veiculo {
    /*
    Esta Classe por ser abstrada não permite a instanciação de objetos. Isso
    só é possível a partir de uma subclasse herdeira.
    */
   
    //Atributos
    private String placa;
    private int ano;
    private String modelo;

    
    //Métodos Especiais
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    } 
    
}
