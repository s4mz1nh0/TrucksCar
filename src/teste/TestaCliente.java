package teste;

import dados.entidades.Cliente;
import javax.persistence.*;
import util.JPAUtil;

public class TestaCliente {
    
    public static void main(String[] args) {
        
        //Criando um objeto ator
        Cliente c1 = new Cliente();
        c1.setNome("Luiz");
        c1.setCpf("00000000000");
        c1.setTelefone(998570579);
        c1.setEmail("luiz@gmail.com");
        Cliente c2 = new Cliente();
        c2.setNome("Juliano");
        c2.setCpf("00000000000");
        c2.setTelefone(999477634);
        c2.setEmail("juliano@gmail.com");
        
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        
        //Iniciar a transação
        gerenciador.getTransaction().begin();
        
        //Mandando persistir o objeto
        gerenciador.persist(c1);
        gerenciador.persist(c2);
        
        //Finalizo a transação
        gerenciador.getTransaction().commit();
        
        //Fechar o gerenciador
        gerenciador.close();
        
    }
    
}
