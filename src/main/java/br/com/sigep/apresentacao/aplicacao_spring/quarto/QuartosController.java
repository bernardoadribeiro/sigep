package br.com.sigep.apresentacao.aplicacao_spring.quarto;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("quartos.fxml")
public class QuartosController extends Controller {

    public QuartosController() {
    }

    @FXML BorderPane quartos;


    @FXML
    private void addNovoQuarto(ActionEvent event) throws Exception{
        carregarModal("novoQuarto.fxml", "Adicionar novo quarto");
    }
    

}
