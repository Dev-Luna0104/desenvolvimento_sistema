/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabuada, resultado, acertos = 0, erros = 0;
        int continuar;
        boolean valor;
        
        Scanner teclado = new Scanner(System.in);
        
        
        do{
            System.out.println("digite o numero da tabuada: ");
            tabuada = teclado.nextInt();
            
            
            for(int i = 0 ; i <= 10; i++){
                System.out.println( tabuada + " x " + i + " = ");
                
                        resultado = teclado.nextInt();
                        //valor = resultado * i;
                    if(resultado != (tabuada * i)){
                        System.out.println("resultado esta errado.");
                        erros++;
                    }else{
                        System.out.println("Acertou :)");
                        acertos++;
                    }              
                    
                
            };
            System.out.println("obteve " + erros + " erros.");
            System.out.println("obteve " + acertos + " acertos.");

            System.out.println("deseja continuar? caso sim digite '1' ");
            continuar = teclado.nextInt();
            acertos = 0;
            erros = 0;
        }while ( continuar == 1);
        
        
    }
    
}
