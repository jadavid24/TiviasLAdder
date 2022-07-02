package com.example.triviasladder3.model;

public abstract class Casilla {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public abstract String getColorExterno();
    public abstract String getColorInterno();

    public abstract Pregunta getPregunta();
}
