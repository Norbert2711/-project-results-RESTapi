package com.project.ksiazkaTest;

import java.util.ArrayDeque;
import java.util.Random;

public class Letters {

    public static String generateRandomString(int number) {
        String a = "";
        for (int i = 0; i < number; i++) {
            a = a + " A ";
        }
        return a;
    }

    public static void main(String[] args) {

        Random randomNote = new Random();
        int loopNumber = 0;
        ArrayDeque<String> lettersA = new ArrayDeque<>();

        System.out.println("*** Ilosc liter: 'A' jest losowana losowo z przedzialu liczb od 0 do 50. ***");

        for (int n = 0; n < 50; n++) {
            int number1 = randomNote.nextInt(50) + 1;
            lettersA.offer(generateRandomString(number1)); //wskazanie wartosci ''number''
                                                             // metody generateRandomString... od 0 do 50
//dodany jest obiekt skladajacy sie z liter ''A'' o dlugosci zaleznej od wartosci 'number'
        }
        for (String a : lettersA) {
            loopNumber++;
            System.out.println("Nr. petli: " + loopNumber + "    " + a);
        }

        SumLetters sumLetters = new SumLetters();
        sumLetters.przydzialLiczbyDoOdpowiedniejKolekcji(lettersA); //metoda 'przydzialLiczbyDoOdpowiedniejKolekcji',
        // w swojej wlasciwosci wymaga elementow, zostaje jej przekazane 50 alementow czyli liter 'A'.

    }
}

