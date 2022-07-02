package com.example.triviasladder3.model;

public class CasillaProgramacion extends Casilla{
    @Override
    public String getColorExterno() {
        return CasillaColores.CASILLA_AZUL_EXTERNO.getColor();
    }

    @Override
    public String getColorInterno() {
        return CasillaColores.CASILLA_AZUL_INTERNO.getColor();
    }

    @Override
    public Pregunta getPregunta() {
        return PreguntasProgramacion.getPreguntaAleatoria();
    }
}
