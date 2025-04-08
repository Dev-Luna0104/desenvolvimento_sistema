/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplovetor;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExemploVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [5];
        
        //Leitura de dados
        for (int i = 05; i < 5; i++){
            System.out.println("Digite: ");
            vetor[i] = sc.nextInt();
        }
        
        //Escrita de dados
        for (int i = 0; i < 5; i++ ){
            System.out.println(vetor[i]);
        }
        
    }
    
}
