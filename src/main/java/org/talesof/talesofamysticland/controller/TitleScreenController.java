package org.talesof.talesofamysticland.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class TitleScreenController {
    
    @FXML 
    public void onClickImgOpenConfigurations() throws IOException {
        
    }

    @FXML
    public void onActionBtnPlay(ActionEvent event) throws IOException {
        String fxmlPath;

        if (LoginController.userIsLogged) {
            fxmlPath = "/org/talesof/talesofamysticland/view/save-selection.fxml";
        } else {
            fxmlPath = "/org/talesof/talesofamysticland/view/login.fxml";
        }

        Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void onActionBtnExit() {
        // TODO
    }

    @FXML
    public void onActionHplRedirectToRegisterPlayer() {
        // TODO
    }

    @FXML
    public void onActionHplRedirectToLogin() {
        // TODO
    }
}
