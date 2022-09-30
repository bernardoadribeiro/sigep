package br.com.sigep.apresentacao.aplicacao_spring.atendente;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import javafx.event.Event;
import javafx.fxml.FXML;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("atendenteControleReservas.fxml")
public class ControleReservasController extends Controller {
    

    public ControleReservasController() {
    }

}
