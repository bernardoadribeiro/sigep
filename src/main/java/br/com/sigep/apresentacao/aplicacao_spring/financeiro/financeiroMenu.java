package br.com.sigep.apresentacao.aplicacao_spring.financeiro;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("financeiroMenu.fxml")
public class financeiroMenu extends Controller {
    

    public financeiroMenu() {
    }

}
