package com.example.triviasladder3.controller;

import com.example.triviasladder3.Main;
import com.example.triviasladder3.controller.listener.DadoListener;
import com.example.triviasladder3.controller.listener.TarjetaListener;
import com.example.triviasladder3.model.Juego;
import com.example.triviasladder3.model.Pregunta;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TableroController implements Initializable {

    @FXML
    private GridPane grid;

    @FXML
    private Pane campoDado;

    @FXML
    private VBox fondoTablero;

    private DadoListener dadoListener;
    private TarjetaListener tarjetaListener;

    private final Juego juego = new Juego(70);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        inicializarCasillas();
        inicializarDadoListener();
        inicializarTarjetaListener();
        inicializarDado();
    }

    private void inicializarDadoListener(){
        dadoListener = new DadoListener() {
            @Override
            public void onDiceResult(int resultadoDado) {
                juego.moverJugadorActual(resultadoDado);
                cambiarVisibilidadJugador(juego.getCasillaAnteriorJugador(),juego.getTurno(),false);
                cambiarVisibilidadJugador(juego.getCasillaJugadorActual(),juego.getTurno(),true);
                if(juego.getGanador() == null){
                    mostrarPregunta(juego.getCasillaJugadorActual());
                } else {
                    avisoGanador();
                }
            }
        };
    }

    private void inicializarTarjetaListener(){
        tarjetaListener = new TarjetaListener() {
            @Override
            public void onOptionSelected(Pregunta pregunta, String opcionSeleccionada) {
                boolean correcta = juego.analizarPregunta(pregunta, opcionSeleccionada);
                avisoRespuesta(correcta);
            }
        };
    }

    private void avisoGanador(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("FELICITACIONES!!!!!");
                alert.setContentText("El jugador "+juego.getGanador()+" ha ganado el juego");
                alert.show();
                grid.getScene().getWindow().hide();
            }
        });
    }

    private void avisoRespuesta(boolean correcta){
        Alert alert;
        if(correcta){
            alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Respuesta Correcta");
            alert.setContentText("La respuesta fue correcta, \n puedes seguir jugando");
        }else{
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Respuesta Incorrecta");
            alert.setContentText("La respuesta fue incorrecta, \n ahora es el turno del siguiente jugador");
        }
        alert.show();
    }

    private void mostrarPregunta(int numeroCasilla){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(Main.class.getResource("tarjeta.fxml"));
                    AnchorPane anchorPane = fxmlLoader.load();
                    TarjetaController tarjetaController = fxmlLoader.getController();
                    tarjetaController.setData(juego.getPregunta(numeroCasilla),tarjetaListener);
                    Stage stage = new Stage();
                    stage.setTitle("Pregunta");
                    stage.setScene(new Scene(anchorPane, 600, 450));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void inicializarDado() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(Main.class.getResource("dado.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            DadoController dadoController = fxmlLoader.getController();
            dadoController.setListener(dadoListener);
            campoDado.getChildren().add(anchorPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cambiarVisibilidadJugador(final int numeroCasilla, final int numeroJugador, final boolean visibilidad){
        for(Node n:grid.getChildren()){
            AnchorPane anchorPane = (AnchorPane) n;
            VBox vBox = (VBox) anchorPane.getChildren().get(0);
            HBox hBox = (HBox) vBox.getChildren().get(0);
            VBox vBox2 = (VBox) hBox.getChildren().get(0);
            HBox hBox2 = (HBox) vBox2.getChildren().get(0);
            Label label = (Label) vBox2.getChildren().get(1);
            if(label.getText().equals(""+numeroCasilla))
            {
                if(numeroJugador == 1){
                    ImageView imageView = (ImageView) hBox2.getChildren().get(0);
                    imageView.setVisible(visibilidad);
                }else{
                    ImageView imageView2 = (ImageView) hBox2.getChildren().get(1);
                    imageView2.setVisible(visibilidad);
                }
                return;
            }
        }
    }

    private void inicializarCasillas() {
        int column = -1;
        int row = 1;
        try {
        for(int i=0; i<juego.getCasillas().size();i++) {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(Main.class.getResource("casilla.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            fondoTablero.setStyle("-fx-background-color: rgba(178,196,175,0.99)");
            CasillaController casillaController = fxmlLoader.getController();
            casillaController.setData(juego.getCasillas().get(i));

            if (row % 2 != 0) {
                column++;
            }

            if (column == 10 && row % 2 != 0) {
                row++;
            }

            if (row % 2 == 0) {
                column--;
            }

            if (column == -1 && row % 2 == 0) {
                row++;
                column++;
            }

            grid.add(anchorPane, column, row);
            grid.setMinWidth(Region.USE_COMPUTED_SIZE);
            grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
            grid.setMaxWidth(Region.USE_PREF_SIZE);

            grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
            grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
            grid.setPrefHeight(Region.USE_PREF_SIZE);

            GridPane.setMargin(anchorPane, new Insets(5));
        }
        } catch (IOException e) {
                e.printStackTrace();
            }
    }
}



