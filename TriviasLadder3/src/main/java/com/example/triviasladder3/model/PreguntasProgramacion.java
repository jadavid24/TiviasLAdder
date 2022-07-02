package com.example.triviasladder3.model;

import java.util.List;
import java.util.Random;

public enum PreguntasProgramacion {
    PREGUNTA_1(new Pregunta("¿Qué define la estructura de las expresiones de un lenguaje de programación?", "Sus palabras reservadas", "Sus reglas sintácticas","Sus reglas semánticas","Sus reglas semánticas")),
    PREGUNTA_2(new Pregunta("¿En qué consiste el proceso de programación?", "Escritura, compilación y verificación del código fuente de un programa", "Compilación del código fuente de un programa","Compilación y verificación del código Bytecode de un programa","Escritura, compilación y verificación del código fuente de un programa")),
    PREGUNTA_3(new Pregunta("Un algoritmo es:", "Un conjunto ordenado de operaciones que permite hallar la solución de\n" +
            "un problema", "Un conjunto ordenado y finito de operaciones que permite hallar la\n" +
            "solución de un problema","Un conjunto aleatorio y finito de operaciones que permite hallar la solución de\n" +
            "un problema","Un conjunto ordenado y finito de operaciones que permite hallar la\n" +
            "solución de un problema")),
    PREGUNTA_4(new Pregunta("Un programa Java compilado es portable porque:", "El código Bytecode es ejecutable por los principales sistemas operativos del\n" +
            "mercado", "El entorno de ejecución de Java incluye una máquina virtual que interpreta\n" +
            "el código Bytecode","El entorno de ejecución interpreta el código\n" +
            "Java, independientemente de la máquina virtual","El código Bytecode es ejecutable por los principales sistemas operativos del\n" +
            "mercado")),
    PREGUNTA_5(new Pregunta("Java es:", "Un lenguaje de programación exclusivamente", "SUn lenguaje de programación Java, una plataforma de desarrollo, un\n" +
            "entorno de ejecución y un conjunto de librerías para desarrollo de programas\n" +
            "sofisticados","Un sistema para ejecutar programas en distintas plataformas informáticas","Un lenguaje de programación Java, una plataforma de desarrollo, un\n" +
            "entorno de ejecución y un conjunto de librerías para desarrollo de programas\n" +
            "sofisticados")),
    PREGUNTA_6(new Pregunta("El entorno de ejecución de Java (Java Runtime Environment)", "Es un conjunto de librerías para desarrollo de aplicaciones Java", "Es una pieza intermedia entre el código Bytecode y los distintos sistemas\n" +
            "operativos existentes en el mercado. Incluye la máquina virtual de Java","Es la máquina virtual de Java","Es una pieza intermedia entre el código Bytecode y los distintos sistemas\n" +
            "operativos existentes en el mercado. Incluye la máquina virtual de Java")),
    PREGUNTA_7(new Pregunta("El proceso clásico de desarrollo de software se compone de las siguientes fases:", "Codificación, diseño, pruebas y validación", "Especificación, diseño, codificación, prueba y mantenimiento","Diseño, pruebas, validación y mantenimiento","Especificación, diseño, codificación, prueba y mantenimiento")),
    PREGUNTA_8(new Pregunta("El compilador de Java analiza el código fuente y:", "Comprueba que todos sus elementos son palabras válidas en Java y su\n" +
            "semántica", "Comprueba que todos sus elementos son palabras válidas en Java","Comprueba que todos sus elementos son palabras válidas en Java, verifica\n" +
            "la estructura sintáctica del programa y su semántica\n","Comprueba que todos sus elementos son palabras válidas en Java, verifica\n" +
            "la estructura sintáctica del programa y su semántica\n")),
    PREGUNTA_9(new Pregunta("La legibilidad de un programa Java es importante porque:", "Facilita el mantenimiento del software y permite corregir errores o\n" +
            "modificar la funcionalidad con menor coste\n", "Evita errores del compilador","Permite corregir errores, aunque no facilita el proceso de mantenimiento\n" +
            "de una aplicación","Facilita el mantenimiento del software y permite corregir errores o\n" +
            "modificar la funcionalidad con menor coste\n")),
    PREGUNTA_10(new Pregunta("¿Cuál de las siguientes expresiones es correcta?", "double radio = 2;", "double radio = 2,0;","double radio = 2.0;","double radio = 2.0;")),
    PREGUNTA_11(new Pregunta("Cuando se ejecuta el método constructor de una clase:", "Se crea un alias y se inicializan los atributos del objeto", "Se asigna un espacio de memoria al objeto instanciado y se inicializan los\n" +
            "atributos del objeto","Se asigna un espacio de memoria al objeto instanciado, pero no se inicializan\n" +
            "los atributos del objeto","Se asigna un espacio de memoria al objeto instanciado y se inicializan los\n" +
            "atributos del objeto")),
    PREGUNTA_12(new Pregunta("Un objeto se compone de:", "Atributos", "Atributos y métodos","Atributos y métodos constructores","Atributos y métodos")),
    PREGUNTA_13(new Pregunta("Un método es una función que:", "Determina el comportamiento de una clase", "Determina el comportamiento de una clase y de sus objetos","Determina el comportamiento de un objeto","Determina el comportamiento de un objeto")),
    PREGUNTA_14(new Pregunta("Es necesario utilizar el enunciado break en una estructura switch para que el programa\n" +
            "compile", "Sí, es estrictamente necesario", "No, no es necesario","Sí, si hay condiciones que no se puedan dar","Sí, es estrictamente necesario")),
    PREGUNTA_15(new Pregunta("¿Es Java un lenguaje orientado a objetos?", "Si", "No","Depende del Compilador","Si"));

    private final Pregunta pregunta;

    PreguntasProgramacion(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public static Pregunta getPreguntaAleatoria() {
        return List.of(values()).get(new Random().nextInt(List.of(values()).size())).pregunta;
    }
}

