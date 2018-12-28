/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gyova
 */
public class FXMLBarraTituloController implements Initializable {

    @FXML
    private JFXButton btnMinimizar;

    @FXML
    private JFXButton btnMaximizar;

    @FXML
    private JFXButton btnFechar;

    @FXML
    void actionFechar(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void actionMaxinizar(ActionEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
       
    }

    @FXML
    void actionMinimizar(ActionEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setIconified(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
