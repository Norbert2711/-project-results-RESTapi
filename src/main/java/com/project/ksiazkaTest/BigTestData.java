package com.project.ksiazkaTest;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BigTestData
{
    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<Integer> theBigList = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for (int n=0; n<2000000; n++){
            theBigList.add(theGenerator.nextInt(50000));
        }
        // Check the list size
        System.out.println("The Big List contains now " + theBigList.size() + " objects");

//        for(Integer list: theBigList){
//            System.out.println( list);
//        }
    }

}
