package br.com.sigep.apresentacao.aplicacao_spring;

import org.springframework.stereotype.Service;

//import com.jfoenix.controls.JFXButton.ButtonType;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("login.fxml")
public class LoginController {

    public LoginController() {
    }
    
    @FXML
    private TextField emailLogin;

    @FXML
    private PasswordField passwordLogin;

    @FXML
    public void botaoClicar(Event e){
        Alert alert = new Alert(AlertType.INFORMATION, "Bem vindo ao sistema! "+emailLogin.getText(), ButtonType.OK);
        alert.showAndWait();
    }

}