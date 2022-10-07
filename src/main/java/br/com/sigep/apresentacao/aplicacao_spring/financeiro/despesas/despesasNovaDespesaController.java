package br.com.sigep.apresentacao.aplicacao_spring.financeiro;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;

import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("despesas/despesasNovaDespesa.fxml")

public class financeiroNovaDespesaController extends Controller {
    
    public financeiroNovaDespesaController(){

    }

}
