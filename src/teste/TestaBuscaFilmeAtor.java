package teste;

import dados.entidades.Ator;
import dados.entidades.Filme;
import javax.persistence.EntityManager;
import util.JPAUtil;

public class TestaBuscaFilmeAtor {
    public static void main(String[] args) {
     
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        
        //Bucar o filme de id 1
        Filme f = gerenciador.find(Filme.class, 1);
        
        //Imprimir o nome do Filme
        System.out.println("Filme: " + f.getNome());
        
        //Imprimir o genero
        System.out.println("Genero: " + f.getGenero().getNome());
        
        //Imprimindo o nome dos atores desse filme
        for(Ator a : f.getAtores()){
            System.out.println("Ator: " + a.getNome());
        }
        
    }
}
