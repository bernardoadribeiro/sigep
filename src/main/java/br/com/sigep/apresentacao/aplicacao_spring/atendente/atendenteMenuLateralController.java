package br.com.sigep.apresentacao.aplicacao_spring.atendente;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import br.com.sigep.apresentacao.aplicacao_spring.quarto.QuartosController;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("atendenteMenu.fxml")
public class AtendenteMenuLateralController extends Controller{

    @FXML
    BorderPane atendenteControle;

    public AtendenteMenuLateralController() {
    }

    @FXML
    public void actionLogout(Event e){
        Alert alert = new Alert(AlertType.CONFIRMATION, "Deseja sair do sistema?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            Platform.exit();
        }
    }
    
    @FXML
    public void abrirPagControleReservas(Event e){
        
    }

    @FXML
    public void abrirPagQuartos(Event e){
        carregarScene(atendenteControle, QuartosController.class);

    }
    
}
