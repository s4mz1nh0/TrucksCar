package teste;

import dados.entidades.Ator;
import javax.persistence.EntityManager;
import util.JPAUtil;

public class TesteBuscaAtor {
   
    public static void main(String[] args) {
        
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        
        //Buscando um ator pelo id (segundo parametro)
        Ator a = gerenciador.find(Ator.class, 1);
        
        //Imprimindo o nome do ator
        System.out.println("Nome: " + a.getNome());
        
        //Fechar o gerenciador
        gerenciador.close();
        
    }
    
}
