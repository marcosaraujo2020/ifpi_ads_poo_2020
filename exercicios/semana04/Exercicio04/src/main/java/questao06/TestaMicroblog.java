package questao06;
public class TestaMicroblog {

    public static void main(String[] args) {
        Microblog m = new Microblog(3);
        Postagem[] p = new Postagem[10];
        
        p[0] = new Postagem(15, 2, "As melhores músicas de 2020");
        p[1] = new Postagem(21, 1, "Filmes em 2020");
        p[2] = new Postagem(47, 3, "A Pandemia em 2020 do Covid-19");
        
  
        m.incluirPost(p[0]);
        m.incluirPost(p[1]);
        m.incluirPost(p[2]);
        
        
        /*
        System.out.println(p[0].toString());
        System.out.println(p[1].toString());
        System.out.println(p[2].toString());
        */
        
        m.excluirPost(57);
        
        m.exibir();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"
                + "=-=-=-=-=-=-=-=-=-");
        m.curtir(47);
        m.curtir(15);
        m.curtir(15);
        m.curtir(15);
        m.curtir(15);
        m.curtir(15);
        m.curtir(15);
        
        m.exibir();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="
                + "-=-=-=-=-=-=-=-=-");
         
        System.out.println("POST COM MAIS CURTIDAS: " + m.maisCurtida());
        
        
    }
    
}
