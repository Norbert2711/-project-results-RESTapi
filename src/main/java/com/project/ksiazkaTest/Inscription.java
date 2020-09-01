package com.project.ksiazkaTest;

import java.util.ArrayList;
import java.util.List;

public class Inscription {

    public static void main(String[] args) {

        String result = " ";
        List<String> companies = new ArrayList();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        for (int i = 0; i < companies.size(); i++) {
            result = result + companies.get(i);

            if (companies.size() - 1 != i) {
                result = result+ ", ";
            }
        }
        System.out.println(result);

    }

}
