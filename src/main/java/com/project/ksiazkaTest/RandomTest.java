package com.project.ksiazkaTest;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        int sumaA = 1000;
        int sumaB = 0;
        int tryCounter = 0;

        Random random = new Random();
        int addA = random.nextInt(9);
        int addB = random.nextInt(50);

        while (sumaA > sumaB) {

            tryCounter++;
            System.out.println("Counter: " + tryCounter + " SumaA = " + sumaA + " SumaB = " + sumaB );

                sumaA = sumaA + addA;
                sumaB = sumaB + addB;

        }

    }

}
