package com.project.ksiazkaTest;

import java.util.ArrayList;
import java.util.List;

public class CollectionsRepeat {

    public static void main(String[] args) {

        String dot = " ";
        List<String> companies = new ArrayList();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        for (int i = 0; i < companies.size(); i++) {
            dot = dot + " " + companies.get(i);
            System.out.println(dot);

            System.out.println(companies.size());

            if (companies.size() -1 != i) { // jezli rozmiar companies -1 nie jest rowne "i" (5) to dodaj ","
                System.out.println(companies.size()-1);
                dot = dot + ", ";
            }

        }
        System.out.println(dot);
    }
}
