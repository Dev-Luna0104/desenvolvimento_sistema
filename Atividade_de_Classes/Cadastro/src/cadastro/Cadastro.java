/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Cadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        Scanner teclado = new Scanner(System.in);
        
        Pessoa registro01 = new Pessoa(), 
                registro02 = new Pessoa(), 
                registro03 = new Pessoa();
        
        registro01.setCodigo(teclado.nextInt());
        registro01.setNome(teclado.next());
        registro01.setIdade(teclado.nextInt());

///////////
        
        registro02.setCodigo(teclado.nextInt());
        registro02.setNome(teclado.next());
        registro02.setIdade(teclado.nextInt());
        
/////////////

        registro03.setCodigo(teclado.nextInt());
        registro03.setNome(teclado.next());
        registro03.setIdade(teclado.nextInt());
        
        if(registro01.getIdade() >= registro02.getIdade()){
            if(registro01.getIdade() >= registro03.getIdade()){
                System.out.println(registro01.getNome());
            }else{
                System.out.println(registro03.getNome());
            }
        }else{
            if(registro02.getIdade() >= registro03.getIdade()){
                System.out.println(registro02.getNome());
            }else{
                System.out.println(registro03.getNome());
            }
        }
        
        
    }
    
}
