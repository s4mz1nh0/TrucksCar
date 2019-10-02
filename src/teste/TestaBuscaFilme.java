package teste;

import dados.entidades.Filme;
import javax.persistence.EntityManager;
import util.JPAUtil;

public class TestaBuscaFilme {
    public static void main(String[] args) {
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        
        //Buscando um filme pelo id
        Filme f = gerenciador.find(Filme.class, 1);
        
        //Imprimindo o nome do filme
        System.out.println("Filme: " + f.getNome());
        
        //Imprimindo o nome do genero do filme
        System.out.println("Genero: " + f.getGenero().getNome());
    }
}
