package com.example.triviasladder3.controller;

import com.example.triviasladder3.model.Casilla;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Objects;

public class CasillaController {

    @FXML
    private HBox HboxInterno;

    @FXML
    private VBox VboxExterno;

    @FXML
    private Label number;

    @FXML
    private ImageView jugador1;

    @FXML
    private ImageView jugador2;

    public void setData (Casilla casilla){
        number.setText(""+casilla.getNumero());
        HboxInterno.setStyle("-fx-background-color:"+ casilla.getColorInterno());
        VboxExterno.setStyle("-fx-background-color: "+casilla.getColorExterno());
        Image image= new Image(Objects.requireNonNull(getClass().getResourceAsStream("/ficha_negra.png")));
        Image image2= new Image(Objects.requireNonNull(getClass().getResourceAsStream("/ficha_naranja.png")));
        jugador2.setImage(image2);
        jugador1.setImage(image);
        jugador2.setVisible(false);
        jugador1.setVisible(false);
        if(casilla.getNumero() == 1){
            jugador1.setVisible(true);
            jugador2.setVisible(true);
        }
    }

}
