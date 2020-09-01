package com.project.ksiazkaTest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

public class SumLetters {

    ArrayList<String> parzyste = new ArrayList<>();
    ArrayList<String> nieparzyste = new ArrayList<>();
    String letter = "";

    public void przydzialLiczbyDoOdpowiedniejKolekcji(ArrayDeque<String> liczba) {

        while (liczba.size() > 0) {
            System.out.println(liczba.size());
            letter = liczba.poll();
            if (letter.length() % 2 == 0) {
                nieparzyste.add(letter);
            } else {
                parzyste.add(letter);
            }

        }

        System.out.println("nieparzyste: " + parzyste);
        System.out.println("parzyste: " + nieparzyste);

    }

}
