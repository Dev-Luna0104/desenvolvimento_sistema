/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensagem;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Mensagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto;
        texto = JOptionPane.showInputDialog("digite um numero: ");
        JOptionPane.showMessageDialog(null, "um texto qualquer -> " + texto );
    
    }
    
}
