package com.project.ksiazkaTest.DeerTest8;

public class DeerTest8 {

    public DeerTest8(){
        System.out.print("Deer");
    }
    public DeerTest8(int age){
        System.out.print("DeerAge");
    }
    private boolean hasHorn(){
        return false;
    }

    public static void main(String[] args) {
        DeerTest8 deerTest8 = new Reindeer(5);
        System.out.print(", " + deerTest8.hasHorn());
    }
}
//obiekt deerTest8 jest zwrocony jako: "DeerReindeer, false"
//odp A w zadaniu 8