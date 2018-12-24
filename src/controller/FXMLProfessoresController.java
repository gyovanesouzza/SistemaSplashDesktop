/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import model.Professor;
import model.table.ProfessorTabela;

/**
 * FXML Controller class
 *
 * @author GYOVANEPEREIRADESOUZ
 */
public class FXMLProfessoresController implements Initializable {

    @FXML
    private Pane paneTitulo;
    @FXML
    private Pane paneCorpo;
    @FXML
    private Label lblDir;

    @FXML
    private JFXButton btnAdicionar = new JFXButton();

    @FXML
    private JFXButton btnAlterar = new JFXButton();

    @FXML
    private JFXButton btnExcluir = new JFXButton();

    @FXML
    private JFXButton btnVisualizar = new JFXButton();
    @FXML
    private TableView<ProfessorTabela> tblProfessor;

    @FXML
    private TableColumn<ProfessorTabela, Integer> tcCodigo;

    @FXML
    private TableColumn<ProfessorTabela, String> tcNome;

    @FXML
    private TableColumn<ProfessorTabela, String> tcMateria;

    @FXML
    private TableColumn<ProfessorTabela, Integer> tcQtdAulas;

    @FXML
    void actionAdicionar(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/FXMLAdicionarProfessorPartePessoal.fxml"));
        lblDir.setText(lblDir.getText()+"/novo");
        paneCorpo.getChildren().setAll(pane);

    }

    @FXML
    void actionAlterar(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/FXMLAdicionarProfessor.fxml"));
        paneCorpo.getChildren().setAll(pane);
    }

    @FXML
    void actionExcluir(ActionEvent event) {

    }

    @FXML
    void actionVisualizar(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/FXMLAdicionarProfessor.fxml"));
        paneCorpo.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
