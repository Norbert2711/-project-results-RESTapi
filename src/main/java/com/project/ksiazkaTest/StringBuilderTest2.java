package com.project.ksiazkaTest;

public class StringBuilderTest2 {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Ja").append("va");
        System.out.println(stringBuilder);
        System.out.println(s1 == s2);         //- true
        System.out.println(s1.equals(s2));      //- true
        System.out.println(stringBuilder.toString() == s1);    //in valures of String use .equals not "==". value after compile - false
        System.out.println(stringBuilder.toString().equals(s1));        //- true
    }

}
//odp C.
