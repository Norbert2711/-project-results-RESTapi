package com.project.ksiazkaTest;

import java.util.HashSet;

public class HashSetBooks {

    public static void main(String[] args) {

        HashSet<Books> booksHashSet = new HashSet<>();

        booksHashSet.add(new Books("Adam Malysz", "Pinokio", 1999, 2, 2));
        booksHashSet.add(new Books("Henryk Sienkiewicz", "Dzieci z bulerbyn", 2009, 4, 4));
        booksHashSet.add(new Books("Adam Mickiewicz", "Lalka", 2011, 8, 12));
        booksHashSet.add(new Books("Czeslaw Niemen", "Kamizelka", 2008, 1, 23));
        booksHashSet.add(new Books("Zdzislaw Krecina", "Koniec Swiata", 2012, 12, 12));

        System.out.println("All books before 2010r: ");
        for (Books books : booksHashSet) {
            if (books.getYearOfPublication().getYear() < 2010) {
                System.out.println(books);
            }
        }

        System.out.println("All books here: ");
        for (Books books : booksHashSet) {
            System.out.println(books);
        }

    }

}
