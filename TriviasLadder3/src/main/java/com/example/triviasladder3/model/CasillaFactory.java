package com.example.triviasladder3.model;

public class CasillaFactory {
    public static Casilla getCasilla (int tipo){
        if (tipo == 1){
            return new CasillaMatematicas();
        } else if (tipo == 2){
            return new CasillaProgramacion();
        } else {
            return new CasillaIdiomas();
        }
    }
}
