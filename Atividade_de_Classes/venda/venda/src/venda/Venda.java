package venda;
 
import java.util.Scanner;
public class Venda {
 
   
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
         Produto[] item = new Produto[5];
 
        double total = 0;
 
        for (int i = 0; i < 5; i++) { 
          item[i] = new Produto();
 
  
 
            System.out.println("Digite ☼ número do produto " + (i + 1) + ": ");
 
            item[i].setNumero(teclado.nextInt());
 
            teclado.nextLine(); // Consumir a quebra de linha
 
  
 
            System.out.println("Digite a descrição do produto " + (i + 1) + ": ");
 
            item[i].setDescricao(teclado.next());
 
  
 
            System.out.println("Digite o preço do produto " + (i + 1) + ": ");
 
            item[i].setPreco(teclado.nextDouble());
 
             
 
            total += item[i].getPreco();
 
        }
 
  

        System.out.println("\nValor total dos produtos: R$ " + total);
 
        teclado.close(); 
    }
}
