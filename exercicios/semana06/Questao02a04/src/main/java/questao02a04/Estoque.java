package questao02a04;

import java.util.ArrayList; 

public class Estoque {
    ArrayList<ProdutoPerecivel> produtos = new ArrayList<>();
      
    
    //Métodos públicos
    public void inserir(ProdutoPerecivel novo) {
        if (produtos.contains(novo)) {
            System.out.println(novo.getDescricao() + " não adicionado. Já contém no carrinho!");
        } else {
            produtos.add(novo);
            System.out.println(novo.getDescricao() + " adicionado na cesta!!");
        }   
    }            
        
    public void excluir(int posicao) {
        System.out.println(produtos.get(posicao).getDescricao() + " removido com sucesso!");
        produtos.remove(posicao); 
    }
    
    public void consultar(int pos) {
        System.out.println("Produto consultado:");
        System.out.println(">> " + produtos.get(pos).getDescricao() + " --> Valor: R$ " + 
            produtos.get(pos).getValor() + " Quantidade: " + produtos.get(pos).getQuantidade() + " <<");
    }

}


