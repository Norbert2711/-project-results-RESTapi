package com.project.ksiazkaTest;

import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {

        double sum = 0;

        ArrayList<Integer> notes = new ArrayList<>();

        notes.add(3);
        notes.add(4);
        notes.add(5);
        notes.add(2);
        notes.add(6);
        notes.add(2);
        notes.add(4);
        notes.add(3);
        notes.add(1);

        double min = notes.get(0);
        double max = notes.get(0);

        for (double note : notes) {

                if (note <= min) {
                    min = note;
                }
                if (note >= max) {
                    max = note;
                }

                sum = note + sum;
            System.out.println("* " +note);
            System.out.println("///////");
            System.out.println(min);
            System.out.println(max);

        }
        System.out.println(sum);

    }
}
