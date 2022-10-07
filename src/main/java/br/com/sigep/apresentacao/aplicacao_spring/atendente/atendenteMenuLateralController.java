package br.com.sigep.apresentacao.aplicacao_spring.atendente;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import br.com.sigep.apresentacao.aplicacao_spring.login.LoginController;
import br.com.sigep.apresentacao.aplicacao_spring.quarto.QuartosController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("atendenteMenu.fxml")
public class atendenteMenuLateralController extends Controller{

    public atendenteMenuLateralController() {
    }

    @FXML
    AnchorPane menuLateral; // Nome e tipo do componente que esta no fxml como componente pai (parent).

    @FXML private Label labelApelido;
    @FXML private Label labelCargo;

    @FXML
    public void actionLogout(Event e){
        Alert alert = new Alert(AlertType.CONFIRMATION, "Deseja sair do sistema?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            carregarScene(getAncora(), LoginController.class);
        }
    }
    
    @FXML
    public void abrirPagControleReservas(Event e){
        carregarScene(menuLateral, atendenteControleReservasController.class);
    }

    @FXML
    public void abrirPagQuartos(Event e){
        carregarScene(menuLateral, QuartosController.class);

    }
    
}
