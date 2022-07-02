package com.example.triviasladder3.model;

public class CasillaMatematicas extends Casilla{

    @Override
    public String getColorExterno() {
        return CasillaColores.CASILLA_ROJA_EXTERNO.getColor();
    }
    @Override
    public String getColorInterno() {
        return CasillaColores.CASILLA_ROJA_INTERNO.getColor();
    }

    @Override
    public Pregunta getPregunta() {
        return PreguntasMatematicas.getPreguntaAleatoria();
    }
}
