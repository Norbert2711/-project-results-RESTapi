package com.project.ksiazkaTest.clock;

import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {

        Clock clock1 = new Clock(12, 3);
        Clock clock2 = new Clock(11, 23);
        Clock clock3 = new Clock(9, 45);
        Clock clock4 = new Clock(8, 59);

        LinkedList<Clock> clocks = new LinkedList<>();
        clocks.add(clock1);
        clocks.add(clock2);
        clocks.add(clock3);
        clocks.add(clock4);

        for (Clock clock : clocks) {
            System.out.println(clock);
            clock.addMinute();
            System.out.println(clock);
        }

    }

}
