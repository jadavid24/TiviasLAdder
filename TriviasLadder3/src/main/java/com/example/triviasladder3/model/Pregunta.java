package com.example.triviasladder3.model;

public class Pregunta {
    private String pregunta;
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String respuesta;

    public Pregunta(String pregunta, String opcion1, String opcion2, String opcion3, String respuesta) {
        this.pregunta = pregunta;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public String getRespuesta() {
        return respuesta;
    }
}
