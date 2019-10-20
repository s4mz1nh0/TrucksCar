package teste;

import dados.entidades.Cliente;
import dados.entidades.Automovel;
import javax.persistence.EntityManager;
import util.JPAUtil;

public class BuscaAutomovelCliente {
    public static void main(String[] args) {
     
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        
        //Bucar o filme de id 1
        Automovel a = gerenciador.find(Automovel.class, 1);
        
        //Imprimir o nome do Filme
        System.out.println("Automovel: " + a.getPorteDoAutomovel());
        
        //Imprimir o genero
        System.out.println("Servicos: " + a.getServicos().getTiposDeLavagem());
        
        //Imprimindo o nome dos atores desse filme
        for(Cliente c : a.getClientes()){
            System.out.println("Cliente: " + c.getNome());
        }
        
    }
}
