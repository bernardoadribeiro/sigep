package br.com.sigep.apresentacao.aplicacao_spring.quarto;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import br.com.sigep.apresentacao.aplicacao_spring.ModalController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("quartos.fxml")
public class QuartosController extends Controller {

    public QuartosController() {
    }

    /* Atributos os campos do modal */
    @FXML BorderPane quartos;


    /* Abre modal para adicionar novo quarto */
    @FXML
    private void addNovoQuarto(ActionEvent event) throws Exception{
        /* Cria instancia do modal passando como parametro o caminho para o fxml do modal de novo Quarto */
        ModalController modalNovoQuarto = new ModalController("quarto/novoQuarto.fxml");

        /* Carrega modal e salva seu retorno na controller para que seja possivel obter os dados preenchidos no modal */
        modalNovoQuarto.exibirModalDialogo((Button)event.getSource(), "Adicionar novo Quarto");
    }
    

}
