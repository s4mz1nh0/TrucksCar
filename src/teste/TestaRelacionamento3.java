package teste;

import dados.entidades.Cliente;
import dados.entidades.Automovel;
import javax.persistence.EntityManager;
import util.JPAUtil;

public class TestaRelacionamento3 {
    public static void main(String[] args) {
     
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        
        //Buscar 2 atores (tem que estar cadastrados no BD)
        Cliente a1 = gerenciador.find(Cliente.class, 1);
        Cliente a2 = gerenciador.find(Cliente.class, 2);
        
        //Buscar um filme no BD
        Automovel f = gerenciador.find(Automovel.class, 1);
        
        //Associando atores com o filme
        f.getClientes().add(a1);
        f.getClientes().add(a2);
        
        //Iniciar a transação, commit e fechar
        gerenciador.getTransaction().begin();
        gerenciador.getTransaction().commit();
        gerenciador.close();
        
    }
}
