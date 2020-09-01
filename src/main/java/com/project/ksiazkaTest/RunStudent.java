package com.project.ksiazkaTest;

import java.util.HashMap;
import java.util.Map;

public class RunStudent {

    public static void main(String[] args) {

        Student student1 = new Student("Adam", "Gigol");
        Student student2 = new Student("Tomasz", "Pala");
        Student student3 = new Student("Zbigniew", "Komp");
        Student student4 = new Student("Tadeusz", "Dluzynski");

        Notes notesStudents1 = new Notes(2.0, 3.0,4.0, 3.0, 5.0);
        Notes notesStudents2 = new Notes(3.0, 5.0,5.0, 2.0, 3.0);
        Notes notesStudents3 = new Notes(5.0, 3.0,4.0, 3.0, 4.0);
        Notes notesStudents4 = new Notes(3.0, 4.0,5.0, 6.0, 2.0);


        HashMap<Student, Notes> studentHashMap = new HashMap<>();

        studentHashMap.put(student1,notesStudents1);
        studentHashMap.put(student2,notesStudents2);
        studentHashMap.put(student3,notesStudents3);
        studentHashMap.put(student4,notesStudents4);

       for( Map.Entry<Student,Notes> entry: studentHashMap.entrySet()) {

           System.out.println("Students: "+ entry.getKey()+ "notes: "+ entry.getValue());

           System.out.println("Average notes every student: " + entry.getKey() + " Avr:  " + entry.getValue().getAvr());
       }

    }
}
