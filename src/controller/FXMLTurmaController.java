/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author GYOVANEPEREIRADESOUZ
 */
public class FXMLTurmaController implements Initializable {

    @FXML
    private Label lblDir;

    @FXML
    private Label lblTitulo;

    @FXML
    private TableView<?> tblTurma;

    @FXML
    private TableColumn<?, ?> tcCodigo;

    @FXML
    private TableColumn<?, ?> tcSerie;

    @FXML
    private TableColumn<?, ?> tcTurma;

    @FXML
    private TableColumn<?, ?> tcCoordenador;

    @FXML
    private TableColumn<?, ?> tcRepresentante;

    @FXML
    private TableColumn<?, ?> tcQtdAluno;

    @FXML
    private JFXButton btnAdicionar;

    @FXML
    private JFXButton btnAlterar;

    @FXML
    private JFXButton btnExcluir;

    @FXML
    private JFXButton btnVisualizar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
