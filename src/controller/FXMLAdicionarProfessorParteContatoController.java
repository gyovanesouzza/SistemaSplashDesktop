/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author GYOVANEPEREIRADESOUZ
 */
public class FXMLAdicionarProfessorParteContatoController implements Initializable {

    @FXML
    private AnchorPane acCorpo;

    @FXML
    private Pane pnTroca;

    @FXML
    private JFXTextField txtCep;

    @FXML
    private JFXTextField txtRua;

    @FXML
    private JFXTextField txtNumero;

    @FXML
    private JFXTextField txtComplemento;

    @FXML
    private JFXTextField txtTelefone;

    @FXML
    private JFXTextField txtCelular;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXButton btnProximo;

    @FXML
    private JFXButton btnCancelar;

    @FXML
    void clickedProximo(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/FXMLAdicionarProfessorParteAula.fxml"));
        pnTroca.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
