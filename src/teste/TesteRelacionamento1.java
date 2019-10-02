package teste;

import dados.entidades.Filme;
import dados.entidades.Genero;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import javax.persistence.EntityManager;
import util.JPAUtil;

public class TesteRelacionamento1 {
    public static void main(String[] args) {
        
        Genero g = new Genero();
        g.setNome("Drama");
        
        Filme f = new Filme();
        f.setNome("Les Miserables");
        f.setArrecadacao(new BigDecimal("20000"));
        f.setDataDeLancamento(LocalDate.of(2000, 7, 1));
        f.setGenero(g);
        
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        //Iniciar a transação
        gerenciador.getTransaction().begin();
        
        //Salvando o genero
        gerenciador.persist(g);
        
        //Salvar o filme 
        //(automaticamente vai persistir o genero tbm
        gerenciador.persist(f);
        
        //Fazer o commit
        gerenciador.getTransaction().commit();
        //Fechando
        gerenciador.close();
        
    }  
}
