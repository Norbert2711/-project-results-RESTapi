package com.project.ksiazkaTest;

public class Euklides {

    public static void main(String[] args) {

        int a = 10;
        int b = 12;

        while (a != b) {
            if (a > b) { //2
                a -= b;  //a= a-b
            } else {
                b -= a; //b= b-a //8,6,4,2
            }
        }
        System.out.println("NWD = " + a);

    }

}
