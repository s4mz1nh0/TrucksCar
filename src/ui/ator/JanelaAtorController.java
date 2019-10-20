package ui.ator;

import com.jfoenix.controls.JFXTextField;
import dados.entidades.Cliente;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import servicos.AtorServico;

/**
 * FXML Controller class
 *
 * @author lusst
 */
public class JanelaAtorController implements Initializable {

    @FXML
    private JFXTextField textFieldId;
    
    @FXML
    private JFXTextField textFieldNome;
    
    //Atributo para representar o servico
    private AtorServico servico = new AtorServico();
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salvar(ActionEvent event) {
        
        //Pega os dados do fomulário
        //e cria um objeto ator
        Cliente a = new Cliente(textFieldNome.getText());
        
        //Mandar o ator para a camada de servico
        servico.salvar(a);
        //Exibindo mensagem
        mensagemSucesso("Ator salvo com sucesso!");
        //Limpando o form
        textFieldNome.setText("");
    }
    
    public void mensagemSucesso(String m){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("SUCESSO!"); 
        alerta.setHeaderText(null); 
        alerta.setContentText(m);
        alerta.showAndWait(); 
    }
    
}
