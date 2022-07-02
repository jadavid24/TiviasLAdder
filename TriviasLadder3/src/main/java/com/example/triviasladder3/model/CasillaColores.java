package com.example.triviasladder3.model;

public enum CasillaColores {

    CASILLA_ROJA_EXTERNO("#ff8080"),
    CASILLA_ROJA_INTERNO("#fc0000"),

    CASILLA_AMARILLO_EXTERNO("#ffff00"),
    CASILLA_AMARILLO_INTERNO("#e7cc64"),

    CASILLA_AZUL_EXTERNO("#0800ff"),
    CASILLA_AZUL_INTERNO("#5ab7e5");

    private final String color;

    CasillaColores(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
