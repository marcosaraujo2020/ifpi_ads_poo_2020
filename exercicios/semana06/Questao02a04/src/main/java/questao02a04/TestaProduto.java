package questao02a04;

import java.time.LocalDate;

public class TestaProduto {
    public static void main(String[] args) {
        
        ProdutoPerecivel p[] = new ProdutoPerecivel[6];
        LocalDate d1 = LocalDate.of(2020, 11, 20);
        LocalDate d2 = LocalDate.of(2021, 9, 15);
        LocalDate d3 = LocalDate.of(2021, 11, 30);
        
        Estoque e = new Estoque();
        
        p[0] = new ProdutoPerecivel(15, "Macarrão", 5, 4.50f, d1);
        p[1] = new ProdutoPerecivel(25, "Farinha", 2, 2.40f, d2);
        p[2] = new ProdutoPerecivel(35, "Goma", 1, 5.90f, d2);
        p[3] = new ProdutoPerecivel(40, "Arroz integral", 5, 7.80f, d1);
        p[4] = new ProdutoPerecivel(45, "Feijão", 10, 9.90f, d3);
        p[5] = new ProdutoPerecivel(50, "Óleo de Soja", 10, 4.85f, d3);
        
        e.inserir(p[1]);
        e.inserir(p[3]);
        e.inserir(p[2]);
        e.inserir(p[0]);
        e.inserir(p[4]);
        e.inserir(p[5]);
        
        e.inserir(p[4]);
        
        e.excluir(1);
        e.consultar(2);
        e.consultar(4);
        e.produtos.get(4).darBaixa(2);
        e.consultar(4);
        
        p[1].validar();
        p[3].validar();
       
        
    }  
}
