package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Service.WebServiceUsuario;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import home.TelaLogin;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author GYOVANEPEREIRADESOUZ
 */
public class FXMLControllerTelaLogin implements Initializable {

    @FXML
    private AnchorPane acBarraTitulo;

    @FXML
    private JFXTextField txtUsuario;

    @FXML
    private JFXPasswordField txtSenha;

    @FXML
    private JFXButton btnEntrar;
    @FXML
    private JFXButton btnClose;

    FXMLControllerTelaLogin controller;
    static Usuario usuario = new Usuario();
    private WebServiceUsuario serviceUsuario = new WebServiceUsuario();
    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    private void handlerButtonCliecks(MouseEvent evt) {
        if (evt.getSource() == btnEntrar) {

            try {
                usuario.setLogin(txtUsuario.getText());
                usuario.setSenha(txtSenha.getText());

                if (serviceUsuario.logar(usuario)) {
                    usuario = serviceUsuario.informacoesConta(usuario);
                    try {
                        Node node = (Node) evt.getSource();
                        Stage stage = (Stage) node.getScene().getWindow();
                        stage.close();
                        Parent root = FXMLLoader.load(getClass().getResource("/fxml/FXMLTelaPrincipal.fxml"));

                        root.setOnMousePressed((MouseEvent event) -> {
                            xOffset = event.getSceneX();
                            yOffset = event.getSceneY();
                        });
                        root.setOnMouseDragged((MouseEvent event) -> {
                            stage.setX(event.getScreenX() - xOffset);
                            stage.setY(event.getScreenY() - yOffset);
                        });

                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    } catch (IOException ex) {
                        System.out.println("Err" + ex.getMessage());
                        ex.printStackTrace();
                    }
                } else {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Informação");
                    alert.setHeaderText(null);
                    alert.setContentText("Usuario Errado");
                    alert.showAndWait();

                }
            } catch (IOException ex) {
                Logger.getLogger(FXMLControllerTelaLogin.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            AnchorPane barra = FXMLLoader.load(getClass().getResource("/fxml/FXMLBarraTitulo.fxml"));
            acBarraTitulo.getChildren().setAll(barra);
        } catch (IOException ex) {
            Logger.getLogger(FXMLControllerTelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
