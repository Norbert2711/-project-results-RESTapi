package com.project.ksiazkaTest;

public class Man {

    public static void main(String[] args) {


        String name = "Adam";
        double age = 40.5;
        double height = 172;

        Kodilla user = new Kodilla();

        if (user.hasName(true) && user.age() > age && user.height() > height) {
            System.out.println("Man's name is: " + name + " has " + age + " years " + "and height: " + height);
        } else {
            System.out.println("Man in noname, has less than 40 years and 178 cm height");
        }
    }
}
