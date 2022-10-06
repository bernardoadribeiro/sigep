package br.com.sigep.apresentacao.aplicacao_spring.atendente;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("detalhesReserva.fxml")
public class DetalhesReservaController extends Controller {
    
    public DetalhesReservaController() {
    }

}
