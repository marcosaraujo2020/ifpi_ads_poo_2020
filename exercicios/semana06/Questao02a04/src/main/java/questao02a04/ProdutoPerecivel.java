package questao02a04;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    LocalDate dataAtual = LocalDate.now();
    LocalDate validade;

    public ProdutoPerecivel(int id, String descricao, 
            int quantidade, float valor, LocalDate validade) {
        super(id, descricao, quantidade, valor);
        this.validade = validade;
    }
    
    public void validar() {
        if(dataAtual.isAfter(validade)) {
            System.out.println("ATENÇÃO!! Produto Vencido!");
        } else {
            System.out.println("Produto está na validade!");
        }
    }
    
    
    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
    
    
    
}
