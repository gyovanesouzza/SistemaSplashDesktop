/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.gluonhq.charm.glisten.control.Avatar;
import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import home.TelaLogin;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;
import model.Usuario;

/**
 * FXML Controller class
 *
 * @author GYOVANEPEREIRADESOUZ
 */
public class FXMLTelaPrincipalController implements Initializable {
    
    Usuario usuario = new Usuario();
    
    @FXML
    private Label lblNome;
    
    @FXML
    private Label lblEmail;
    
    @FXML
    private Avatar avUsuario;
    
    @FXML
    private JFXButton btnHome;
    
    @FXML
    private JFXButton btnTurmas;
    
    @FXML
    private FontAwesomeIconView btnTurmas1;
    
    @FXML
    private JFXButton btnProfessores;
    
    @FXML
    private JFXButton btnUsuarios;
    
    @FXML
    private JFXButton btnRelatorio;
    
    @FXML
    private JFXButton btnConfiguracoes;
    
    @FXML
    private Pane paneTitulo;
    
    @FXML
    private Label lblTitulo;
    
    @FXML
    private AnchorPane rootPaneMudar;
    
    @FXML
    void actionHome(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/FXMLTurma.fxml"));
        rootPaneMudar.getChildren().setAll(pane);
    }
    @FXML
    void actionTurma(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/FXMLTurma.fxml"));
        rootPaneMudar.getChildren().setAll(pane);
    }
    
    @FXML
    void actionProfessor(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/FXMLProfessores.fxml"));
        rootPaneMudar.getChildren().setAll(pane);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        usuario = FXMLControllerTelaLogin.usuario;
        lblNome.setText(usuario.getNome());
        lblEmail.setText(usuario.getEmail());
        
    }
    
}
