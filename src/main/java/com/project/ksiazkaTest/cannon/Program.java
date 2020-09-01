package com.project.ksiazkaTest.cannon;

import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {

        LinkedList<Cannon> cannonLinkedList = new LinkedList<>();

        Cannon cannon1 = new Cannon(true);
        cannon1.fire();
        Cannon cannon2 = new Cannon(false);
        cannon2.fire();
        Cannon cannon3 = new Cannon(false);
        cannon3.fire();
        Cannon cannon4 = new Cannon(true);
        cannon4.fire();
        Cannon cannon5 = new Cannon(false);
        cannon5.fire();
        Cannon cannon6 = new Cannon(true);
        cannon6.fire();

        cannonLinkedList.add(cannon1);
        cannonLinkedList.add(cannon2);
        cannonLinkedList.add(cannon3);
        cannonLinkedList.add(cannon4);
        cannonLinkedList.add(cannon5);
        cannonLinkedList.add(cannon6);
        System.out.println(" ");

        for (Cannon list : cannonLinkedList) {
            System.out.println(list);

            if (list.loaded) {
                System.out.println("fire!");
            } else {
                System.out.println("need reload! and fire!");
            }
            System.out.println(" ");

        }
    }

}
