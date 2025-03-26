/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoclasse01;

/**
 *
 * @author Aluno
 */
public class ProjetoClasse01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p;
        p = new Produto();
        p.setId(0);
        p.setNome("la la la");
        p.setDesc("mais alguma coisa");
        
        System.out.println("ID:    " + p.getId());
        System.out.println("Nome:  " + p.getNome());
        System.out.println("Desc.: " + p.getDesc());
        
        Produto pp;
        pp = new Produto();
        pp.setId(1);
        pp.setNome("minecraft");
        pp.setDesc("infantil");

        System.out.println("ID:    " + pp.getId());
        System.out.println("Nome:  " + pp.getNome());
        System.out.println("Desc.: " + pp.getDesc());
        
    }
    
}
