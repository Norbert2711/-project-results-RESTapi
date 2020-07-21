package com.project.ksiazkaTest;

class GrasshopperTask10 {
public GrasshopperTask10(String n) {
         name = n;
         }
public static void main(String[] args) {
    GrasshopperTask10 one = new GrasshopperTask10("g1");
    GrasshopperTask10 two = new GrasshopperTask10("g2");
        one = two;
         two = null;
         one = null;

    System.out.println(two);}

private String name; }
