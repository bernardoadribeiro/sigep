package br.com.sigep.apresentacao.aplicacao_spring.atendente;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import javafx.fxml.FXML;
import javafx.event.Event;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("atendenteMenu.fxml")
public class atendenteMenuLateralController extends Controller{

    public atendenteMenuLateralController() {
    }

    @FXML
    public void actionLogout(Event e){

    }
    
    
}
