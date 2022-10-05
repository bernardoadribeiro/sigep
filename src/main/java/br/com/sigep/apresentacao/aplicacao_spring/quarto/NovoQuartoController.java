package br.com.sigep.apresentacao.aplicacao_spring.quarto;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("novoQuarto.fxml")
public class NovoQuartoController extends Controller{

    public NovoQuartoController() {
    }
    
}
