package teste;

import dados.entidades.Cliente;
import javax.persistence.EntityManager;
import util.JPAUtil;

public class EditaAtor {
    
    public static void main(String[] args) {
        
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        
        //Buscando um ator pelo id (segundo parametro)
        Cliente a = gerenciador.find(Cliente.class, 1);
        
        //Editando o nome (colocando um novo nome)
        a.setNome("Samuel Santana");
        
        //Iniciar a transação
        gerenciador.getTransaction().begin();
        
        //Commit na transação
        gerenciador.getTransaction().commit();
        
        //fechar o gerenciador
        gerenciador.close();
        
    }
    
}
