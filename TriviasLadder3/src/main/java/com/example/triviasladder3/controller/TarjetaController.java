package com.example.triviasladder3.controller;

import com.example.triviasladder3.controller.listener.TarjetaListener;
import com.example.triviasladder3.model.Casilla;
import com.example.triviasladder3.model.CasillaColores;
import com.example.triviasladder3.model.Juego;
import com.example.triviasladder3.model.Pregunta;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class TarjetaController {

    @FXML
    private Button opcion1;

    @FXML
    private Button opcion2;

    @FXML
    private Button opcion3;

    @FXML
    private Label pregunta;

    @FXML
    private VBox VBoxExterno;

    @FXML
    private VBox VBoxInterno;

    private TarjetaListener tarjetaListener;

    public void setData(Pregunta pregunta, TarjetaListener tarjetaListener){
        this.tarjetaListener = tarjetaListener;
        this.pregunta.setText(pregunta.getPregunta());
        VBoxInterno.setStyle("-fx-background-color: rgb(255,218,180)");
        VBoxExterno.setStyle("-fx-background-color: rgb(255,138,29)");
        opcion1.setText(pregunta.getOpcion1());
        opcion2.setText(pregunta.getOpcion2());
        opcion3.setText(pregunta.getOpcion3());
        opcion1.setOnAction(e -> {
            tarjetaListener.onOptionSelected(pregunta, opcion1.getText());
            ((Node)(e.getSource())).getScene().getWindow().hide();
        });
        opcion2.setOnAction(e -> {
            tarjetaListener.onOptionSelected(pregunta, opcion2.getText());
            ((Node)(e.getSource())).getScene().getWindow().hide();
        });
        opcion3.setOnAction(e -> {
            tarjetaListener.onOptionSelected(pregunta, opcion3.getText());
            ((Node)(e.getSource())).getScene().getWindow().hide();
        });
    }

}
