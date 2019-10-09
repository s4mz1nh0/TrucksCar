package servicos;

import dados.daos.AtorDAO;
import dados.entidades.Ator;

public class AtorServico {
    
    //Atributo para representar a camada de dados
    private AtorDAO dao = new AtorDAO();
    
    public void salvar(Ator a){
        //Fazer qualquer regra de negócio
        
        //Mandar o ator para a camada de dados
        //para ser salvo no banco de dados
        dao.salvar(a);
    }    
    
}
