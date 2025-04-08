package listagem;

import java.util.Scanner;

public class Listagem {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        int[] valores = new int[4];
        for(i=0; i < valores.length; i++ ){
            System.out.println("Entre com o numero para guardar em valores["+i+"]=");
            valores[i] = teclado.nextInt();
        }
        
        for(i=0; i < valores.length; i++){
            System.out.println("valores["+i+"]="+ valores[i] );
        }
    }    
}
