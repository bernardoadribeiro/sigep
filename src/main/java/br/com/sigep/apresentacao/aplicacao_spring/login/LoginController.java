package br.com.sigep.apresentacao.aplicacao_spring.login;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import br.com.sigep.apresentacao.aplicacao_spring.atendente.AtendenteControleReservasController;
import br.com.sigep.apresentacao.aplicacao_spring.financeiro.dashboard.dashboardTelaPrincipalController;
import br.com.sigep.apresentacao.aplicacao_spring.quarto.QuartosController;

//import com.jfoenix.controls.JFXButton.ButtonType;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("login.fxml")
public class LoginController extends Controller {

    public LoginController() {
    }
    
    @FXML
    private TextField emailLogin;

    @FXML
    private PasswordField passwordLogin;

    @FXML
    BorderPane telaLogin;
    

    @FXML
    public void actionLogin(Event e){
        // Alert alert = new Alert(AlertType.INFORMATION, "Bem vindo ao sistema! "+emailLogin.getText(), ButtonType.OK);
        // alert.showAndWait();

        // if (alert.getResult() == ButtonType.OK){
        //     carregarScene(telaLogin, AtendenteControleReservasController.class);
        // }
       
        String login = emailLogin.getText();
        String senha = passwordLogin.getText();

        if (login.equals("atendente")){
            carregarScene(telaLogin, AtendenteControleReservasController.class); //abre tela de controle caso for atendente

        } else if (login.equals("financeiro")){
            carregarScene(telaLogin, dashboardTelaPrincipalController.class); //substituir pelo controller do Dashboard quando for implementado

        } else if (login.equals("proprietario")){
            carregarScene(telaLogin, QuartosController.class); //substituir pelo controller do Dashboard quando for implementado

        } else {
            Alert alert = new Alert(AlertType.ERROR, "Por favor, informe seu login corretamente! ", ButtonType.OK);
            alert.showAndWait();
        }
    }

}
