package com.example.triviasladder3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Juego {
    private int casillaAnteriorJugador1;
    private int casillaJugador1;
    private int casillaAnteriorJugador2;
    private int casillaJugador2;
    private int turno;
    private List<Casilla> casillas;
    private Integer ganador;

    public Juego(int tamano) {
        this.casillaJugador1 = 1;
        this.casillaJugador2 = 1;
        this.turno = 1;
        this.casillaAnteriorJugador1 = 1;
        this.casillaAnteriorJugador2 = 1;
        this.casillas = new ArrayList<>();
        crearCasillas(tamano);
    }

    public List<Casilla> getCasillas() {
        return casillas;
    }

    public Integer getGanador() {
        return ganador;
    }

    private void crearCasillas(int tamanoJuego){
        Casilla casilla;
        for (int i=tamanoJuego; i>0; i--){
            int numero = (int)(Math.random()*3+1);
            casilla = CasillaFactory.getCasilla(numero);
            casilla.setNumero(i);
            casillas.add(casilla);
        }
    }

    private boolean jugadorGano(int resultadoDado){
        if(turno == 1){
            if(casillas.size() == (casillaJugador1 + resultadoDado)){
                casillaAnteriorJugador1 = casillaJugador1;
                casillaJugador1 = casillas.size();
                ganador = 1;
                return true;
            } else {
                return false;
            }
        } else {
            if(casillas.size() == (casillaJugador2 + resultadoDado)){
                casillaAnteriorJugador2 = casillaJugador2;
                casillaJugador2 = casillas.size();
                ganador = 2;
                return true;
            } else {
                return false;
            }
        }
    }

    public int getTurno(){
        return turno;
    }

    public int getCasillaJugadorActual(){
        if(turno == 1){
            return casillaJugador1;
        }else {
            return casillaJugador2;
        }
    }

    public int getCasillaAnteriorJugador() {
        if (turno == 1){
            return casillaAnteriorJugador1;
        }else {
            return casillaAnteriorJugador2;
        }
    }

    public void moverJugadorActual(int resultadoDado) {
        if(!jugadorGano(resultadoDado)){
            if(turno == 1){
                if(((casillaJugador1+resultadoDado) < casillas.size())){
                    casillaAnteriorJugador1 = casillaJugador1;
                    casillaJugador1 = casillaJugador1 + resultadoDado;
                }
            } else if(turno == 2) {
                if(((casillaJugador2+resultadoDado) < casillas.size())){
                    casillaAnteriorJugador2 = casillaJugador2;
                    casillaJugador2 = casillaJugador2+resultadoDado;
                }
            }
        }
    }

    private void cambiarTurno(){
        if(turno == 1){
            turno = 2;
        }
        else {
            turno = 1;
        }

    }

    public Pregunta getPregunta(int numero) {
        Optional<Casilla> casillaOptional = casillas.stream().filter(c -> c.getNumero() == numero).findFirst();
        return casillaOptional.map(Casilla::getPregunta).orElse(null);
    }

    public boolean analizarPregunta(Pregunta pregunta, String opcionSeleccionada) {
        if(pregunta.getRespuesta().equals(opcionSeleccionada)){
            return true;
        } else {
            cambiarTurno();
            return false;
        }
    }
}
