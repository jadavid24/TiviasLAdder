package com.example.triviasladder3.model;

import java.util.List;
import java.util.Random;

public enum PreguntasMatematicas {
    PREGUNTA_1(new Pregunta ("¿Qué es un polinomio?", "Una ecuación irracional", "Una ecuación canónica", "Es la suma – resta de un conjunto de monomios","Es la suma – resta de un conjunto de monomios")),
    PREGUNTA_2(new Pregunta ("¿Qué es un Dominio?", "Someter a una persona a tu voluntad.", "Conjunto de valores de la variable independiente para los cuales existe la función.", "Tener posesión de un objeto.","Conjunto de valores de la variable independiente para los cuales existe la función.")),
    PREGUNTA_3(new Pregunta ("¿Qué es una incógnita?", "Un número del que desconocemos su valor.", "Un número del que conocemos su valor.", "Un conjunto de números con relación mediante una ecuación.","Un número del que desconocemos su valor.")),
    PREGUNTA_4(new Pregunta ("¿Qué es una raíz de índice n?", "Un número multiplicado por otro que es primo.", "Un número que dividido por n da como resultado el radicando.", "Un número que elevado a n da como resultado el radicando.","Un número que elevado a n da como resultado el radicando.")),
    PREGUNTA_5(new Pregunta ("¿Qué es un exponente?", "Un número que se expone a un alto riesgo.", "Un número que tiende a infinito.", "En una potencia, es el número que expresa cuántas veces hay que multiplicar la base por sí misma.","En una potencia, es el número que expresa cuántas veces hay que multiplicar la base por sí misma.")),
    PREGUNTA_6(new Pregunta ("¿Qué es un radián?", "Es una conjunción numérica que converge en el centro.", "En una circunferencia es la medida de un ángulo central que abarca en ella un arco igual al radio.", "Es una circunferencia perfecta.","En una circunferencia es la medida de un ángulo central que abarca en ella un arco igual al radio.")),
    PREGUNTA_7(new Pregunta ("¿Cuál es la función inversa de y=sen(x)?", "y=arc.sen (x)", "y=x/sen (x)", "y=cos (x)","y=arc.sen (x)")),
    PREGUNTA_8(new Pregunta ("¿Cómo se llaman los triángulos con dos los lados iguales y uno desigual?", "Escaleno.", "Equilátero.", "Isósceles.","Isósceles.")),
    PREGUNTA_9(new Pregunta ("¿Qué es un vector?", "Dirección que toma una línea recta.", "Un segmento orientado cuyo origen es un punto A y su terminación es un punto B.", "En el eje de coordenadas es la línea paralela al eje.","Un segmento orientado cuyo origen es un punto A y su terminación es un punto B.")),
    PREGUNTA_10(new Pregunta ("Sabiendo las coordenadas A(5,2) y B(-1,4) obtenemos un vector...", "(6,-2)", "(4,6)", "(-6,2)","(-6,2)")),
    PREGUNTA_11(new Pregunta ("¿Qué es el número e?", "Es un número primo.", "Es un número trascendente que viene dado por el límite de la expresión, (x+1/x) elevada a x, cuando x tiende a infinito.", "Es un número racional parecido a 2/5.","Es un número trascendente que viene dado por el límite de la expresión, (x+1/x) elevada a x, cuando x tiende a infinito.")),
    PREGUNTA_12(new Pregunta ("¿Qué es el número pi?", "Es una suma de vectores.", "Es el número primo 11.", "Es un número trascendente que viene dado por el cociente entre la longitud de la circunferencia y su diámetro.","Es un número trascendente que viene dado por el cociente entre la longitud de la circunferencia y su diámetro.")),
    PREGUNTA_13(new Pregunta ("¿Qué es un número racional?", "Es el que se puede expresar como como cociente de dos números enteros irreducibles.", "Una raíz.", "Una suma.","Es el que se puede expresar como como cociente de dos números enteros irreducibles.")),
    PREGUNTA_14(new Pregunta ("¿Qué es un sistema de ecuación lineal?", "Es un conjunto de ecuaciones de cualquier grado.", "Es un conjunto de ecuaciones de primer grado.", "Es un conjunto de ecuaciones de segundo grado.","Es un conjunto de ecuaciones de primer grado.")),
    PREGUNTA_15(new Pregunta ("¿Cuál es el eje de ordenadas?", "El eje de las x.", "Ambos ejes juntos.", "El eje de las y.","El eje de las x."));

    private final Pregunta pregunta;

    PreguntasMatematicas(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public static Pregunta getPreguntaAleatoria() {
        return List.of(values()).get(new Random().nextInt(List.of(values()).size())).pregunta;
    }
}
