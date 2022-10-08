package br.com.sigep.apresentacao.aplicacao_spring.financeiro.dashboard;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;

import br.com.sigep.apresentacao.aplicacao_spring.ModalController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.layout.BorderPane;

import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("dashboardTelaPrincipal.fxml")
public class dashboardTelaPrincipalController extends Controller {

    public dashboardTelaPrincipalController(){
    }
    
    /* Atributos os campos do modal */
    @FXML BorderPane dash;

    @FXML
	private void modalAjusteManual(ActionEvent event) throws Exception{

        ModalController modalAjusteManual = new ModalController("financeiro/dashboard/dashboardAjusteManual.fxml");

        modalAjusteManual.exibirModalDialogo((Button)event.getSource(), "Ajuste Manual");

	}

}
