/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author GYOVANEPEREIRADESOUZ
 */
public class FXMLAdicionarProfessorPartePessoalController implements Initializable {

    @FXML
    private AnchorPane acCorpo;

    @FXML
    private Pane pnPrincipal;

    @FXML
    private Label lblTitulo;

    @FXML
    private Pane pnTroca;

    @FXML
    private JFXButton btnProximo;

    @FXML
    private Label lblCancelar;

    @FXML
    private JFXTextField txtNome;

    @FXML
    private JFXTextField txtNaturalidade;

    @FXML
    private JFXTextField txtNatural;

    @FXML
    private JFXTextField txtCpf;

    @FXML
    private JFXComboBox<String> cbSexo;

    @FXML
    private JFXDatePicker dpDataNasc;

    @FXML
    void clickedProximo(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/FXMLAdicionarProfessorParteContato.fxml"));
        pnTroca.getChildren().setAll(pane);
        
    }

    @FXML
    void clickedVolta(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList opc = FXCollections.observableArrayList("Masculino", "Feminino", "Outro");
        cbSexo.setItems(opc);
    }

}
