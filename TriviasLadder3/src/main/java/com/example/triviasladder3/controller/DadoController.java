package com.example.triviasladder3.controller;

import com.example.triviasladder3.controller.listener.DadoListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.util.Random;

public class DadoController {

        Random random = new Random();

        @FXML
        private ImageView diceImage;

        @FXML
        private Button rollButton;

        private DadoListener dadoListener;

        @FXML
        void roll(ActionEvent event) {

            rollButton.setDisable(true);
            Thread thread = new Thread(){
                public void run(){
                    try {
                        for (int i = 0; i < 15; i++) {
                            File file = new File("src/main/java/com/example/triviasladder3/image/dice" +(random.nextInt(6)+1)+".png");
                            diceImage.setImage(new Image(file.toURI().toString()));
                            Thread.sleep(50);
                        }
                        rollButton.setDisable(false);
                        int numeroFinal = random.nextInt(6)+1;
                        File file = new File("src/main/java/com/example/triviasladder3/image/dice" +numeroFinal+".png");
                        diceImage.setImage(new Image(file.toURI().toString()));
                        dadoListener.onDiceResult(numeroFinal);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
        }

        public void setListener(DadoListener dadoListener){
                this.dadoListener = dadoListener;
        }
    }

