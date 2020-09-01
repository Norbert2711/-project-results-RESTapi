package com.project.ksiazkaTest.aaLettersV2;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class AaCollection {

    ArrayList<String> parzyste = new ArrayList<>();
    ArrayList<String> nieparzyste = new ArrayList<>();
    String letterA = "";

    public void aaaCollect(ArrayDeque<String> aaaLetters) {

        while (aaaLetters.size() > 0) {
            letterA = aaaLetters.poll();
            if (letterA.length() % 2 == 0) {
                parzyste.add(letterA);
            } else {
                nieparzyste.add(letterA);
            }
        }

        System.out.println("parzyste: "+ parzyste);
        System.out.println("nieparzyste: "+ nieparzyste);

    }

}
