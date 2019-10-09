package teste;

import dados.entidades.Ator;
import dados.entidades.Filme;
import javax.persistence.EntityManager;
import util.JPAUtil;

public class TestaRelacionamento3 {
    public static void main(String[] args) {
     
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        
        //Buscar 2 atores (tem que estar cadastrados no BD)
        Ator a1 = gerenciador.find(Ator.class, 1);
        Ator a2 = gerenciador.find(Ator.class, 2);
        
        //Buscar um filme no BD
        Filme f = gerenciador.find(Filme.class, 1);
        
        //Associando atores com o filme
        f.getAtores().add(a1);
        f.getAtores().add(a2);
        
        //Iniciar a transação, commit e fechar
        gerenciador.getTransaction().begin();
        gerenciador.getTransaction().commit();
        gerenciador.close();
        
    }
}
