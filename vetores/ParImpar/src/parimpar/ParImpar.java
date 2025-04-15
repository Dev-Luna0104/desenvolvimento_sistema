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
        
        int val, laI, 
                nuPar = 0,nuImpar = 0,
                indImp = 0,
                indPar = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a quintidade de valores:");
         val  = teclado.nextInt();
        int [] numeros = new int[val];
        
        for(laI = 0; laI < numeros.length ;laI++ ){
            System.out.println("informe o valor do arrey "+ (laI+1) +" :");
            numeros[laI] = teclado.nextInt();
            
            if (numeros[laI] % 2 == 0 ) {
                nuPar++;
            }else{
                nuImpar++;
            }
        }
        
        
        int impares [] = new int[nuImpar];
        int pares [] = new int[nuPar];
        
        
        for(int numero : numeros){
            if(numero % 2 == 0 ){
                pares[indPar] = numero;
                indPar++;
         
            }else {
                impares[indImp] = numero;
                indImp++;
                
            }
        }
        
        System.out.println("\n\npares");
        if(nuPar != 0){
            for(int i = 0; i < pares.length; i++){
                System.out.println("indice " +i+" valor: "+ pares[i]);
            }
        }else{
            System.out.println("não ha numeros pares");
        }
        
        System.out.println("\nimpares");
        for(int i = 0; i < impares.length; i++){
            System.out.println("indice " +i+" valor: "+ impares[i]);
        }
        
    }
    
}
