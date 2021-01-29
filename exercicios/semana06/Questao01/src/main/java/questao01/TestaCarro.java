package questao01;
public class TestaCarro {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.setModelo("Palio Celebration");
        c.setAno(2006);
        c.setPlaca("LLV-9878");
        c.detalhes();
        
        CarroEletrico ce = new CarroEletrico();
        ce.setModelo("Onix Joy");
        ce.setAno(2016);
        ce.setPlaca("NNO-1458");
        ce.setAutonomiaBateria(20);
        ce.detalhes();
        ce.mostrarAutonomia();
        
    }
    
}
