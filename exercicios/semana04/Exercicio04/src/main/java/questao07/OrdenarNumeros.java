package questao07;

import java.util.Arrays;

public class OrdenarNumeros {

    public static void main(String[] args) {
        args = new String[5];
        
        args[0] = "9";
        args[1] = "11";
        args[2] = "5";
        args[3] = "17";
        args[4] = "2";
        
        int[] listaNumeros = new int[5];
        
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            listaNumeros[i] = num;
            System.out.print(num + " ");
        }
        
        System.out.println();
        
        Arrays.sort(listaNumeros);
        
        System.out.println("Números ordenados: ");
        for (int i: listaNumeros) {
            System.out.print(i + " ");
        }
            
    }
    
}
