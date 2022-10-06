package br.com.sigep.apresentacao.aplicacao_spring;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ModalController {
    private String fxmlURL;

    public ModalController(String fxmlUrl){
        fxmlURL = fxmlUrl;
    }

    /* 
     * Exibir modal de dialogo
     * Carrega modal e retorna controller.
     * No controller retornado havera os dados para ser usado na tela root (parent)
     */
    public <T> T exibirModalDialogo(Button root, String titulo) throws IOException {
        Stage modalDialog = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlURL));
        Parent modalDialogRoot = loader.load();
        T controller = loader.getController();
        Scene modalScene = new Scene(modalDialogRoot);

        modalDialog.initOwner(root.getScene().getWindow());
        modalDialog.setScene(modalScene);
        modalDialog.setTitle(titulo);
        modalDialog.setResizable(false);
        modalDialog.showAndWait();

        return controller;
    }

    /* 
     * Exibir modal
     * Apenas abre uma janela modal do sistema 
    */
    public void exibirModal(String titulo) throws Exception {               
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlURL));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle(titulo);
            stage.setScene(new Scene(root1));  
            stage.setResizable(false);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
