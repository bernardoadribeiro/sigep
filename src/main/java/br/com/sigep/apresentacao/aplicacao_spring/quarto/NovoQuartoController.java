package br.com.sigep.apresentacao.aplicacao_spring.quarto;

import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import br.com.sigep.entidades.quarto.Quarto;
import br.com.sigep.entidades.quarto.QuartoCategoria;
import br.com.sigep.entidades.quarto.QuartoStatus;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("novoQuarto.fxml")
public class NovoQuartoController extends Controller{

    Quarto novoQuarto = new Quarto();

    @FXML TextField numQuarto;
    @FXML TextField capacidadeHospedes;
    @FXML TextField valorDiaria;
    @FXML TextField qtdCamaCasal;
    @FXML TextField qtdCamaSolteiro;
    @FXML ComboBox<QuartoCategoria> seletorCategoria;
    @FXML ComboBox<QuartoStatus> seletorStatus;

    // private List<QuartoCategoria> categorias = new ArrayList<QuartoCategoria>();

    
    @Override
    public void initialize(){
        seletorCategoria.getItems().addAll(QuartoCategoria.values());
        seletorStatus.getItems().addAll(QuartoStatus.values());
    }

    public NovoQuartoController() {
    }

    public boolean salvarNovoQuarto() {
        return false;
    }
    
    public void fecharModal(){
        Platform.exit();
    }
    
}
