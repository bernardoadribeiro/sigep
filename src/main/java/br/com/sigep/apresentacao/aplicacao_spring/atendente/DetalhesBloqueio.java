package br.com.sigep.apresentacao.aplicacao_spring.atendente;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("DetalhesBloqueio.fxml")
public class DetalhesBloqueio extends Controller {
    
    public DetalhesBloqueio() {
    }

}
