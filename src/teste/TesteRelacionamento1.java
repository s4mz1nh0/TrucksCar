package teste;

import dados.entidades.Automovel;
import dados.entidades.Servicos;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.EntityManager;
import util.JPAUtil;

public class TesteRelacionamento1 {
    public static void main(String[] args) {
        
        Servicos s1 = new Servicos();
        s1.setTiposDeLavagem("Ducha");
        
        Servicos s2 = new Servicos();
        s2.setTiposDeLavagem("Ducha completa");
        
        Automovel a1 = new Automovel();
        a1.setPorteDoAutomovel("PEQUENO");
        a1.setServicos(s1);
        a1.setServicos(s2);
        
        Automovel a2 = new Automovel();
        a2.setPorteDoAutomovel("MEDIO");
        a2.setServicos(s1);
        a2.setServicos(s2);
        
        Automovel a3 = new Automovel();
        a3.setPorteDoAutomovel("GRANDE");
        a3.setServicos(s1);
        a3.setServicos(s2);
        
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        //Iniciar a transação
        gerenciador.getTransaction().begin();
        
        //Salvando o genero
        gerenciador.persist(s1);
        gerenciador.persist(s2);
        
        //Salvar o filme 
        //(automaticamente vai persistir o genero tbm
        gerenciador.persist(a1);
        gerenciador.persist(a2);
        gerenciador.persist(a3);
        //Fazer o commit
        gerenciador.getTransaction().commit();
        //Fechando
        gerenciador.close();
        
    }  
}
