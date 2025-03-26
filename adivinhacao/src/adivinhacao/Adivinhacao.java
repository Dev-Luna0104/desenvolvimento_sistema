/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinhacao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Adivinhacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int segredo, numero, tentativas = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um numero que sera o segredo:");
        segredo = teclado.nextInt();
        
        System.out.println("descubra o segredo, coloque um numero(0 a 25): ");
        do{
            numero = teclado.nextInt();
            if(numero != segredo ){
                System.out.println("esta errado, tente novamente");
            }else;
            
            tentativas++;
        }while( numero != segredo );
        System.out.println("isso ai");
        System.out.println("conseguiu na " + tentativas + "º tentativa.");
        
    }
    
}
