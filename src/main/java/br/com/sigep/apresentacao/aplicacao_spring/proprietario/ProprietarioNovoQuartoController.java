package br.com.sigep.apresentacao.aplicacao_spring.proprietario;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("proprietarioNovoQuarto.fxml")
public class ProprietarioNovoQuartoController extends Controller{

    public ProprietarioNovoQuartoController() {
    }
    
}
