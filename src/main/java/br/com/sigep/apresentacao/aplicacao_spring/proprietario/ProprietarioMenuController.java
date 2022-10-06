package br.com.sigep.apresentacao.aplicacao_spring.proprietario;


import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("proprietarioMenu.fxml")
public class ProprietarioMenuController extends Controller {

    public ProprietarioMenuController() {
    }
    
}
