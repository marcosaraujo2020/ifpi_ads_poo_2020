package questao06e07;

public class Banco {
    //Atributos
    private Conta[] contas;
    private int indice = 0;
    
    //Construtor 1
    public Banco() {
        this.contas = new Conta[50];
    }
    
    //Construtor 2
    public Banco(int tamanho) {
        this.contas = new Conta[tamanho];
    }

    public void inserir(Conta c) {
        this.contas[indice] = c;
        indice++;
    }

    public Conta consultar(String numero) {
        Conta c = null;
        for (int i = 0; i < indice; i++) {
            if (this.getContas()[i].getNumero().equals(numero)) {
                c = this.contas[i];
                break;
            }
        }
        return c;
    }

    public int consultarIndice(String numero) {
        int pos = -1;
        for (int i = 0; i < getIndice(); i++) {
            if (this.getContas()[i].getNumero().equals(numero)) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    //Métodos
    public void debitar(String numero, double valor) {
        Conta c;
        c = consultar(numero);
        if (c != null)
            c.sacar(valor);
        else
            System.out.println("Conta inexistente.");
    }

    public void alterar(Conta c) {
        int indice2 = consultarIndice(c.getNumero());
        if (indice != -1) {
            this.contas[indice] = c;
        }

    }

    public void excluir(String numero) {
        int posicao = consultarIndice(numero);
        if (posicao != -1) {
            for (int i = posicao; i < indice; i++) {
                this.getContas()[i] = this.getContas()[i + 1];
            }

            indice--;
        }
    }

    public Conta[] getContas() {
        return contas;
    }

    public void setContas(Conta[] contas) {
        this.contas = contas;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    
    
}
