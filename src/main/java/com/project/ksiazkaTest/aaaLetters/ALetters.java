package com.project.ksiazkaTest.aaaLetters;

import java.util.ArrayDeque;
import java.util.Random;

public class ALetters {

    public static String generateRandomLetters(int number) {

        String a = " ";

        for (int i = 0; i < number; i++) {
            a = a + "A";
        }

        return a;

    }

    public static void main(String[] args) {

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        Random random = new Random();

        for (int k = 0; k < 50; k++){

            int number1 = random.nextInt(50)+1;
            arrayDeque.offer(generateRandomLetters(number1));

        }

        CollectionLettersA collectionLettersA = new CollectionLettersA();
        collectionLettersA.splitLetters(arrayDeque);

    }
}
