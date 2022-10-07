package br.com.sigep.apresentacao.aplicacao_spring.financeiro.despesas;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;

import br.com.sigep.apresentacao.aplicacao_spring.ModalController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("despesasTelaPrincipal.fxml")
public class despesasTelaPrincipalController extends Controller {
    
    public despesasTelaPrincipalController(){

    }

}
