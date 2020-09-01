package com.project.ksiazkaTest;

import java.time.LocalDate;
import java.util.Objects;

public class Books {


    public String author;
    public String title;
    public LocalDate yearOfPublication;

    public Books(String author, String title, int year, int month, int day) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = LocalDate.of(year,month,day);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Objects.equals(author, books.author) &&
                Objects.equals(title, books.title) &&
                Objects.equals(yearOfPublication, books.yearOfPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, yearOfPublication);
    }

    @Override
    public String toString() {
        return "author= " + author + '\'' +
                ", title= " + title + '\'' +
                ", yearOfPublication= " + yearOfPublication;
    }
}
