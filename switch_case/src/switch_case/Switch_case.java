/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_case;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Switch_case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Descubras quantas letras tem seu nome...");
        
        Scanner teclado;
        teclado = new Scanner(System.in);
       
        String firstName ;
        System.out.println("escreva seu primeiro nome: ");
        firstName = teclado.nextLine();
      
        int firstNameL = firstName.length();
        System.out.println("Segundo nome: ");
        String lastName = teclado.nextLine();
        
        int lastNameL = lastName.length();
        
        
        
        System.out.println(firstName + lastName + ", seu nome possui " + (firstNameL + lastNameL) + " caracter" );
        
        
        /**
        int x = 0;
        switch(x) {
            case 0:
                System.out.println("x é 0");
                break;
            case 1:
                System.out.println("x é 1");
                break;
            default:
                System.out.println("x tem um valor diferente de 0 e 1");
                break;
        }
        
        for(int i = 0; i <= 50; i++){
            System.out.println("produto: " + i);
        }
        */
        
    }
    
}
