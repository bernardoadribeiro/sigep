package br.com.sigep.apresentacao.aplicacao_spring.quarto;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("detalhesQuarto.fxml")
public class DetalhesQuartoController extends Controller {

    public DetalhesQuartoController() {
    }
    
}
