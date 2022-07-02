package com.example.triviasladder3.controller.listener;

import com.example.triviasladder3.model.Pregunta;

public interface TarjetaListener {
    void onOptionSelected(Pregunta pregunta,String opcionSeleccionada);
}
