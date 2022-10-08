package br.com.sigep.apresentacao.aplicacao_spring.quarto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import br.com.sigep.entidades.quarto.Quarto;
import br.com.sigep.entidades.quarto.QuartoCategoria;
import br.com.sigep.entidades.quarto.QuartoStatus;
import br.com.sigep.servicos.quarto.RepositorioQuarto;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("novoQuarto.fxml")
public class NovoQuartoController extends Controller{

    @Autowired
    private RepositorioQuarto repositorio;

    private Quarto entidade;

    Quarto novoQuarto = new Quarto();

    @FXML TextField numQuarto;
    @FXML TextField capacidadeHospedes;
    @FXML TextField valorDiaria;
    @FXML TextField qtdCamaCasal;
    @FXML TextField qtdCamaSolteiro;
    @FXML ComboBox<QuartoCategoria> seletorCategoria;
    @FXML ComboBox<QuartoStatus> seletorStatus;


    
    @Override
    public void initialize(){
        seletorCategoria.getItems().addAll(QuartoCategoria.values());
        seletorStatus.getItems().addAll(QuartoStatus.values());
    }

    public NovoQuartoController() {
    }

    public Quarto getEntidade() {
        return entidade;
    }

    public void setEntidade(Quarto entidade) {
        this.entidade = entidade;
    }

    public void carregarCampos() {
        numQuarto.setText(Integer.toString(entidade.getNumQuarto()));
        qtdCamaCasal.setText(Integer.toString(entidade.getQtdCamaCasal()));
        qtdCamaSolteiro.setText(Integer.toString(entidade.getQtdCamaSolteiro()));
        capacidadeHospedes.setText(Integer.toString(entidade.getCapacidade()));
        //valorDiaria.setText(entidade.getPrecoDiaria().toString());

        seletorCategoria.setValue(seletorCategoria.getValue());
        seletorStatus.setValue(seletorStatus.getValue());
    }

    public void carregarEntidade() {
        numQuarto.setText(Integer.toString(entidade.getNumQuarto()));
        valorDiaria.setText((entidade.getPrecoDiaria()).toString());
    }


    public void salvarNovoQuarto(ActionEvent e) {
        setEntidade(new Quarto());
        carregarCampos();
        repositorio.Salvar(entidade);
        
        
    }
    
    
    public void fecharModal(){
        Platform.exit();
    }
    
}
