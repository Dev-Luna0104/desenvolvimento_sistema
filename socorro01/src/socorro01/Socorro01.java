/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socorro01;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Socorro01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String textNum, op;
        textNum = JOptionPane.showInputDialog("Digite um número de 1 a 100");
        int val = Integer.parseInt(textNum);
        op = JOptionPane.showInputDialog( "digite umas das opições: 2-dobro, 3-triplo, 4-quadruplo.");
        int opNum = Integer.parseInt(op);
        switch (opNum) {
            case 2:
                JOptionPane.showMessageDialog(null,  opNum * 2);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,  opNum * 3);
                break;
            case 4:
                JOptionPane.showMessageDialog(null,  opNum * 4);
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
