package teste;

import javax.persistence.*;

public class TestaAtor {
    
    public static void main(String[] args) {
        
        //Testando a Criação da tabela ator
        
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = Persistence.
                createEntityManagerFactory("projeto").
                createEntityManager();
        
    }
    
}
