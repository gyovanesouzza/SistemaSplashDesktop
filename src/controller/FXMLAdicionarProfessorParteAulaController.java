/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import org.controlsfx.control.CheckComboBox;

/**
 * FXML Controller class
 *
 * @author GYOVANEPEREIRADESOUZ
 */
public class FXMLAdicionarProfessorParteAulaController implements Initializable {

    ObservableList<String> items = FXCollections.observableArrayList();

    @FXML
    private AnchorPane acCorpo;

    @FXML
    private Pane pnTroca;

    @FXML
    private CheckComboBox<String> cbMaterias;

    @FXML
    private CheckBox cbSegMat;

    @FXML
    private CheckBox cbSegVes;

    @FXML
    private CheckBox cbSegNot;

    @FXML
    private CheckBox cbTerVes;

    @FXML
    private CheckBox cbQuaVes;

    @FXML
    private CheckBox cbQuiVes;

    @FXML
    private CheckBox cbSexVes;

    @FXML
    private CheckBox cbTerMat;

    @FXML
    private CheckBox cbQuaMat;

    @FXML
    private CheckBox cbQuiMat;

    @FXML
    private CheckBox cbSexMat;

    @FXML
    private CheckBox cbTerNot;

    @FXML
    private CheckBox cbQuaNot;

    @FXML
    private CheckBox cbQuiNot;

    @FXML
    private CheckBox cbSexNot;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        items.addAll(new String[]{"All", "Item 1", "Item 2", "Item 3", "Item 4"});
        cbMaterias.getItems().addAll(items);
    }

}
