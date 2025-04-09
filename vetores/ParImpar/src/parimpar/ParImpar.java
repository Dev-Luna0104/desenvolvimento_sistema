/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int val, nuPar = 0,nuImpar = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a quintidade de valores:");
         val  = teclado.nextInt();
        int [] numeros = new int[val];
        
        for(int i = 0; i < numeros.length ;i++ ){
            System.out.println("informe o valor do arrey "+ (i+1) +" :");
            numeros[i] = teclado.nextInt();
            
            if (numeros.length % 2 == 0 ) {
                nuPar++;
            }else{
                nuImpar++;
            }
        }
        
        int pares [] = new int[nuPar];
        int impares [] = new int[nuImpar];
        
        for(int i = 0; i < pares.length; i++){
            if(numeros[i] % 2 == 0 ){
                System.out.println("indice "+numeros[i]+" com valor ");
            }
        }
        

        
        
    }
    
}
