package com.project.ksiazkaTest.clock;

import java.time.LocalTime;

public class Clock {

    public LocalTime time;

    public Clock(int hour, int minutes) {
        this.time = LocalTime.of(hour, minutes);
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Clock: " +
                "time= " + time;
    }

    public void addMinute() {
        time = time.plusMinutes(1);
    }

}
