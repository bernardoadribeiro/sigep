package br.com.sigep.apresentacao.aplicacao_spring.financeiro;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;

import br.com.sigep.apresentacao.aplicacao_spring.ModalController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.layout.BorderPane;

import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("financeiroRelatorios.fxml")
public class financeiroRelatoriosController extends Controller{
    
    public financeiroRelatoriosController(){
    }

    @FXML BorderPane relatorios;

}
