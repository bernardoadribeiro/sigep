package br.com.sigep.apresentacao.aplicacao_spring.quarto;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import br.com.sigep.entidades.quarto.Quarto;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("novoQuarto.fxml")
public class NovoQuartoController extends Controller{

    Quarto novoQuarto = new Quarto();

    public NovoQuartoController() {
    }
    
}
