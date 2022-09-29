package br.com.sigep.apresentacao.aplicacao_spring.atendente;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("atendenteTelaPrincipal.fxml")
public class TelaPrincipalController extends Controller {
    
    @FXML
    static
    BorderPane atendenteTelaPrincipal;

    public TelaPrincipalController() {
    }

}
