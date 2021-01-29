package questao01;

public class CarroEletrico extends Carro {
    /*
    CarroEletrico é uma subclasse que herda atributos da Super Classe Carro.
    Portanto, na Classe Main o objeto poderá ser instanciado a partir da 
    Classe CarroEletrico.
    */
    
    //Atributo
    private int autonomiaBateria;

    //Métodos 
    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }    
    
    public void mostrarAutonomia() {
        System.out.println("Autonomia da bateria: " + this.getAutonomiaBateria() + " horas.");
    }
}
