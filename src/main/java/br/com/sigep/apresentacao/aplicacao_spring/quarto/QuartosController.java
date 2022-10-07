package br.com.sigep.apresentacao.aplicacao_spring.quarto;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sigep.apresentacao.aplicacao_spring.Controller;
import br.com.sigep.apresentacao.aplicacao_spring.ModalController;
import br.com.sigep.entidades.quarto.Quarto;
import br.com.sigep.entidades.quarto.QuartoCategoria;
import br.com.sigep.entidades.quarto.QuartoStatus;
import br.com.sigep.servicos.quarto.RepositorioQuarto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("quartos.fxml")
public class QuartosController extends Controller {

    @Autowired
    RepositorioQuarto repositorio;

    public QuartosController() {
    }

    /* Atributos os campos do modal */
    @FXML BorderPane quartos;
    @FXML private TableView<Quarto> tabelaQuartos;
    @FXML private TableColumn<Quarto, Integer> numQuarto;
    @FXML private TableColumn<Quarto, Integer> qtdCamaCasal;
    @FXML private TableColumn<Quarto, Integer> qtdCamaSolteiro;
    @FXML private TableColumn<QuartoCategoria, String> categoria;
    @FXML private TableColumn<Quarto, BigDecimal> valorDiaria;
    @FXML private TableColumn<QuartoStatus, String> status; 

    @FXML private TextField filtroNumQuarto;
    @FXML private ComboBox<QuartoCategoria> filtroCategoria;
    @FXML private ComboBox<QuartoStatus> filtroStatus;


    @Override
    public void initialize() {
        /* Metodos que irao iniciar junto com a inicializacao da tela */

        configTabela();

        // filtroCategoria.getItems().addAll(QuartoCategoria.values());
        // filtroStatus.getItems().addAll(QuartoStatus.values());
        
    }

    public void configTabela(){
        /* Associando colunas com os respectivos atributos. O nome do atributo deve ser igual ao que esta no BD */
        numQuarto.setCellValueFactory(new PropertyValueFactory<>("numQuarto"));
        qtdCamaCasal.setCellValueFactory(new PropertyValueFactory<>("qtdCamaCasal"));
        qtdCamaSolteiro.setCellValueFactory(new PropertyValueFactory<>("qtdCamaSolteiro"));
        categoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        valorDiaria.setCellValueFactory(new PropertyValueFactory<>("precoDiaria"));
        status.setCellValueFactory(new PropertyValueFactory<>("status"));

        /*  Configura modo de selecao */
        TableViewSelectionModel<Quarto> selectionModel = tabelaQuartos.getSelectionModel();
        selectionModel.setSelectionMode(SelectionMode.MULTIPLE);
        tabelaQuartos.setSelectionModel(selectionModel);

        buscarQuartos();

    }


    /* Abre modal para adicionar novo quarto */
    @FXML
    private void modalNovoQuarto(ActionEvent event) throws Exception{
        /* Cria instancia do modal passando como parametro o caminho para o fxml do modal de novo Quarto */
        ModalController modalNovoQuarto = new ModalController("quarto/novoQuarto.fxml");

        /* Carrega modal e salva seu retorno na controller para que seja possivel obter os dados preenchidos no modal */
        modalNovoQuarto.exibirModalDialogo((Button)event.getSource(), "Adicionar novo Quarto");
    }
    
    public void buscarQuartos(){
        Quarto filtro = new Quarto();
        
        /* 
         * TO-DO
         * Aplica filtros a partir do que foi informado nos filtros da pagina 
         * */
        // Integer nQuarto     = Integer.parseInt(filtroNumQuarto.getText());
        // QuartoCategoria cat = filtroCategoria.getValue();
        // QuartoStatus stat   = filtroStatus.getValue();
        // if(nQuarto != null)
        //     filtro.setNumQuarto(nQuarto);
        // if (cat != null)
        //     filtro.setCategoria(cat);
        // if (stat != null)
        //     filtro.setStatus(stat);

        /* Retorna resultado da busca */
        List<Quarto> resultado = repositorio.Buscar(filtro);
        tabelaQuartos.getItems().removeAll(tabelaQuartos.getItems());
        tabelaQuartos.getItems().addAll(resultado);
    }

    public void limpaFiltros(){
        filtroNumQuarto.setText(null);
        // filtroCategoria.setValue(null);
        // filtroStatus.setValue(null);
    }

}
