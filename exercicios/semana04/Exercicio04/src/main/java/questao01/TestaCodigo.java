package questao01;

public class TestaCodigo {
    public static void main(String[] args) {
       int[] a = new int[5];
       
       for (int i = 0; i < a.length; i++) {
           a[i] = i;
           System.out.println(a[i]);
       }
    }
    
    //A execução apresenta o erro: Index 5 out of bounds for length 5
    //Ou seja, "i <= a.length" fica fora dos limites do tamanho da lista, portanto
    //a correção se dar retirando a igualdade ficando: "i < a.length"
    
}
