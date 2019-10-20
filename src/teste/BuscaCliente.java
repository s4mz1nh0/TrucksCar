package teste;

import dados.entidades.Cliente;
import javax.persistence.EntityManager;
import util.JPAUtil;

public class BuscaCliente {
   
    public static void main(String[] args) {
        
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        
        //Buscando um ator pelo id (segundo parametro)
        Cliente c = gerenciador.find(Cliente.class, 1);
        
        //Imprimindo o nome do ator
        System.out.println("Nome: " + c.getNome());
        
        //Fechar o gerenciador
        gerenciador.close();
        
    }
    
}
