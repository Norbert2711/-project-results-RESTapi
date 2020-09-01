package com.project.ksiazkaTest;

import java.util.Objects;

public class Notes {

    public double math;
    public double english;
    public double polish;
    public double geography;
    public double physicalEducation;
    public double avr;

    public Notes(double math, double english, double polish, double geography, double physicalEducation) {
        this.math = math;
        this.english = english;
        this.polish = polish;
        this.geography = geography;
        this.physicalEducation = physicalEducation;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getPolish() {
        return polish;
    }

    public void setPolish(double polish) {
        this.polish = polish;
    }

    public double getGeography() {
        return geography;
    }

    public void setGeography(double geography) {
        this.geography = geography;
    }

    public double getPhysicalEducation() {
        return physicalEducation;
    }

    public void setPhysicalEducation(double physicalEducation) {
        this.physicalEducation = physicalEducation;
    }

    public double getAvr() {
        return math + english + polish + geography + physicalEducation / 5 ;
    }

    public void setAvr(double avr) {
        this.avr = avr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notes notes = (Notes) o;
        return Double.compare(notes.math, math) == 0 &&
                Double.compare(notes.english, english) == 0 &&
                Double.compare(notes.polish, polish) == 0 &&
                Double.compare(notes.geography, geography) == 0 &&
                Double.compare(notes.physicalEducation, physicalEducation) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(math, english, polish, geography, physicalEducation);
    }

    @Override
    public String toString() {
        return "Notes{" +
                "math=" + math +
                ", english=" + english +
                ", polish=" + polish +
                ", geography=" + geography +
                ", physicalEducation=" + physicalEducation +
                '}';
    }
}
