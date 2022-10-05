package br.com.sigep.apresentacao.aplicacao_spring.atendente;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("detalhesBloqueio.fxml")
public class DetalhesBloqueioController extends Controller {
    
    public DetalhesBloqueioController() {
    }

}
