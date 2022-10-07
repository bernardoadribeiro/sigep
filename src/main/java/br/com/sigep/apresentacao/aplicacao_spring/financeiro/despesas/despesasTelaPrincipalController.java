package br.com.sigep.apresentacao.aplicacao_spring.financeiro.despesas;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;

import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("despesasTelaPrincipal.fxml")
public class despesasTelaPrincipalController extends Controller {
    
    public despesasTelaPrincipalController(){

    }

}
