package br.com.sigep.apresentacao.aplicacao_spring.atendente;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import javafx.fxml.FXML;
import javafx.event.Event;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("atendenteMenu.fxml")
public class MenuLateralController extends Controller{

    public MenuLateralController() {
    }

    @FXML
    public void actionLogout(Event e){

    }
    
    
}
