package com.project.ksiazkaTest.aaLettersV2;

import java.util.ArrayDeque;
import java.util.Random;

public class aaaGenerator {

    public static String aGenerator(int numberOfAa) {


        String aaGener = "";

        for (int i = 0; i < numberOfAa; i++) {
            aaGener = aaGener + "A";
        }

        return aaGener;
    }

    public static void main(String[] args) {

        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>();
        Random random = new Random();

        for (int k = 0; k < 50; k++) {
            int number = random.nextInt(50) + 1;
            stringArrayDeque.offer(aGenerator(number));
        }

        AaCollection collection = new AaCollection();
        collection.aaaCollect(stringArrayDeque);

    }

}
