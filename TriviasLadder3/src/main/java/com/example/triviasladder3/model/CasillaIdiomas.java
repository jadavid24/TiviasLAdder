package com.example.triviasladder3.model;

public class CasillaIdiomas extends Casilla{


    @Override
    public String getColorExterno() {
        return CasillaColores.CASILLA_AMARILLO_EXTERNO.getColor();
    }

    @Override
    public String getColorInterno() {
        return CasillaColores.CASILLA_AMARILLO_INTERNO.getColor();
    }

    @Override
    public Pregunta getPregunta() {
        return PreguntasIdiomas.getPreguntaAleatoria();
    }
}
