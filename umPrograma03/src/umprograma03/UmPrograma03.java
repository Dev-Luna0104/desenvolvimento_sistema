/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umprograma03;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class UmPrograma03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String seuNome;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        seuNome = teclado.nextLine();
        System.out.println("Olá, " + seuNome + ".");
    }
    
}
