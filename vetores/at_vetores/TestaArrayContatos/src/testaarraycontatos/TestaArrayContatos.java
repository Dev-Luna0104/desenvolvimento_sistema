/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaarraycontatos;


public class TestaArrayContatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contato [] agenda = new Contato[5];
        agenda[0] = new Contato("Maria", "1234567");
        agenda[1] = new Contato("Pedro", "7894564152");
        agenda[2] = new Contato("Eduarda", "258147369");
        agenda[3] = new Contato("Renan", "147258369");
        
        System.out.println(" *** Minha agenda de contatos ***");
       for ( int i = 0; i < agenda.length; i++){
           System.out.println("Nome: " + agenda[i].getNome() + " / ");
           System.out.println("Telefone: " + agenda[i].getTelefone());
       }
        
    }
    
}
