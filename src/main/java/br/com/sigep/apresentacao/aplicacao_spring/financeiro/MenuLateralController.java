package br.com.sigep.apresentacao.aplicacao_spring.financeiro;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;

import br.com.sigep.apresentacao.aplicacao_spring.financeiro.dashboard.dashboardTelaPrincipalController;
import br.com.sigep.apresentacao.aplicacao_spring.financeiro.despesas.despesasTelaPrincipalController;
import br.com.sigep.apresentacao.aplicacao_spring.login.LoginController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("financeiroMenuLateral.fxml")
public class MenuLateralController extends Controller {

    public MenuLateralController() {
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
            carregarScene(menuLateral, LoginController.class);
        }
    }

    @FXML
    public void abrirDashboards(Event e){

        carregarScene(menuLateral, dashboardTelaPrincipalController.class);

    }

    @FXML
    public void abrirDespesas(Event e){

        carregarScene(menuLateral, despesasTelaPrincipalController.class);

    }

    @FXML
    public void abrirRelatorios(Event e){

        carregarScene(menuLateral, financeiroRelatoriosController.class);

    }

}
