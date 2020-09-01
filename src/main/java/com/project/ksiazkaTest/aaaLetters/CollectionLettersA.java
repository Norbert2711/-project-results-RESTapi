package com.project.ksiazkaTest.aaaLetters;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class CollectionLettersA {

    ArrayList<String> parzyste = new ArrayList<>();
    ArrayList<String> nieparzyste = new ArrayList<>();
    String letter = "";

    public void splitLetters(ArrayDeque<String> letters) {

        while (letters.size() > 0) {
            letter = letters.poll();
            if (letter.length() % 2 == 0) {
                parzyste.add(letter);
            } else {
                nieparzyste.add(letter);
            }
        }
        System.out.println("parzyste" + parzyste);
        System.out.println("nieparzyste" + nieparzyste);
    }
}
