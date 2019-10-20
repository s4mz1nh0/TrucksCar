package servicos;

import dados.daos.AtorDAO;
import dados.entidades.Cliente;

public class AtorServico {
    
    //Atributo para representar a camada de dados
    private AtorDAO dao = new AtorDAO();
    
    public void salvar(Cliente a){
        //Fazer qualquer regra de negócio
        
        //Mandar o ator para a camada de dados
        //para ser salvo no banco de dados
        dao.salvar(a);
    }    
    
}
