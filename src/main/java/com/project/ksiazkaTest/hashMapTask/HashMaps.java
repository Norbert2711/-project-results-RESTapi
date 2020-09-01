package com.project.ksiazkaTest.hashMapTask;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {

        Map<Integer,String> myFavoriteColors = new HashMap<>();
        Map<Integer,String> myFriendsFavoriteColors = new HashMap<>();

        myFavoriteColors.put(1, "Red");
        myFavoriteColors.put(2, "Green");
        myFavoriteColors.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColors);

        myFriendsFavoriteColors.put(4, "White");
        myFriendsFavoriteColors.put(5, "Blue");
        myFriendsFavoriteColors.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendsFavoriteColors);

        Map<Integer,String> ourFavoriteColors = new HashMap<>();

        ourFavoriteColors.put(1, myFavoriteColors  +" "+  myFriendsFavoriteColors);

        System.out.println("Third collection: " + ourFavoriteColors);








    }
}
