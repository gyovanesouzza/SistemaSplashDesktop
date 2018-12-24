/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.table;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import model.*;

/**
 *
 * @author GYOVANEPEREIRADESOUZ
 */
public class ProfessorTabela {

   

    private final SimpleIntegerProperty id;
    private final SimpleStringProperty nome;
    private final SimpleStringProperty sobrenome;
    private final SimpleIntegerProperty qtAulas;
    private final SimpleObjectProperty<Materia> materia;
    private final SimpleObjectProperty<Usuario> usuario;

    public ProfessorTabela(int id, String nome, String sobrenome, int qtAulas, Materia materia, Usuario usuario) {
       super();
        this.id = new SimpleIntegerProperty(id);
        this.nome = new SimpleStringProperty(nome);
        this.sobrenome = new SimpleStringProperty(sobrenome);
        this.qtAulas = new SimpleIntegerProperty(qtAulas);
        this.materia = new SimpleObjectProperty<>(materia);
        this.usuario = new SimpleObjectProperty<>(usuario);
    }

     public int getId() {
        return id.get();
    }

    public String getNome() {
        return nome.get();
    }

    public String getSobrenome() {
        return sobrenome.get();
    }

    public int getQtAulas() {
        return qtAulas.get();
    }

    public Materia getMateria() {
        return materia.get();
    }

    public Usuario getUsuario() {
        return usuario.get();
    }
}
