package com.example.triviasladder3.model;

import java.util.List;
import java.util.Random;

public enum PreguntasIdiomas {
    PREGUNTA_1(new Pregunta("1.TONY ......... UP EARLY ON SUNDAY MORNINGS", "is get sometimes", "sometimes get", "sometimes gets","sometimes gets")),
    PREGUNTA_2(new Pregunta("AT THE MOMENT HE .......", "is sleeping", "sleep", "sleeping","is sleeping")),
    PREGUNTA_3(new Pregunta("SHE ......... A NEW LAPTOP LAST MONTH.", "buy", "is buying", "bought","bought")),
    PREGUNTA_4(new Pregunta("HE..........TO WORK. HE’S ILL IN BED.", "can’t go", "isn’t go", "can’t to go","can’t go")),
    PREGUNTA_5(new Pregunta("SUE: ......... SOME SANDWICHES?", "Are you liking", "Would you like", "Does she want","Would you like")),
    PREGUNTA_6(new Pregunta("I’M GOING TO SEE HIM..........TUESDAY.", "in", "on", "of","on")),
    PREGUNTA_7(new Pregunta("YOUR IDEA IS..........MINE.", "more good than", "better than", "better that","better than")),
    PREGUNTA_8(new Pregunta("THERE ISN’T..........BREAD. I CAN’T MAKE SANDWICHES.", "any", "a", "many","any")),
    PREGUNTA_9(new Pregunta("......VERY CLOUDY TODAY. LET’S HOPE IT DOESN’T RAIN.", "They are", "There are", "It’s","It’s")),
    PREGUNTA_10(new Pregunta("WE’D LIKE TO SEE YOU AGAIN. CAN YOU GIVE ..... YOUR PHONE NUMBER?", "us", "our", "ours","us")),
    PREGUNTA_11(new Pregunta("HELLO! HOW ARE YOU?", "I’m an engineer.", "Pleased to meet you.", "Fine, thanks. And you?","Fine, thanks. And you?")),
    PREGUNTA_12(new Pregunta("EXCUSE ME. CAN YOU TELL ME THE WAY TO THE BUS STATION?", "Yes. You can catch a bus near the bus station", "Turn left at the traffic lights. It’s on the right. You can’t miss it.", "I don’t like travelling by bus.","Turn left at the traffic lights. It’s on the right. You can’t miss it.")),
    PREGUNTA_13(new Pregunta("DID YOU HAVE A GOOD HOLIDAY?", "Yes, but it was too short!", "Yes, I’m going on holiday tomorrow.", "Yes, I want a long holiday at the seaside.","Yes, but it was too short!")),
    PREGUNTA_14(new Pregunta("HOW OFTEN DO YOU SEE HER?", "I never look at her. She lives in another town", "Not very often. She doesn’t live near me.", "Yes, I do.","Not very often. She doesn’t live near me.")),
    PREGUNTA_15(new Pregunta("WHAT DOES SHE DO?", "She does secretary.", "She’s a secretary.", "She’s cooking dinner","She’s a secretary."));

    private final Pregunta pregunta;

    PreguntasIdiomas(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public static Pregunta getPreguntaAleatoria() {
        return List.of(values()).get(new Random().nextInt(List.of(values()).size())).pregunta;
    }
}
