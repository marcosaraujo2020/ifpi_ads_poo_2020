package questao05;

public class Hora {
    //Atributos
    private int hora;
    private int minutos;
    private int segundos;
    
    
    //Método construtor
    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    //Métodos públicos
    public void lerHora() {
       
    }
    
    public void lerMinutos() {
                
    }
    
    public void lerSegundos() {
        
    }
    
    public void formatoHora() {
        System.out.println(this.getHora()+":"+this.getMinutos()+":"+this.getSegundos());
    }
    
    //Métodos especiais de acesso e alteração
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    
    
}
