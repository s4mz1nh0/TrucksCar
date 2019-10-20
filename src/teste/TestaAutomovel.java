package teste;

import dados.entidades.Automovel;
import javax.persistence.*;
import util.JPAUtil;

public class TestaAutomovel {
    
    public static void main(String[] args) {
        
        //Criando um objeto ator
        Automovel a1 = new Automovel();
        a1.setPorteDoAutomovel("Medio");
      a1.setCliente("Luis");
       a1.setServicos("Ducha");
        Automovel a2 = new Automovel();
        a2.setPorteDoAutomovel("Grande");
       a2.setCliente("Juliano");
       a2.setServicos("Ducha completa");
      //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        
        //Iniciar a transação
        gerenciador.getTransaction().begin();
        
        //Mandando persistir o objeto
        gerenciador.persist(a1);
        gerenciador.persist(a2);
        
        //Finalizo a transação
        gerenciador.getTransaction().commit();
        
        //Fechar o gerenciador
        gerenciador.close();
        
    }
    
}
