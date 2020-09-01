package com.project.ksiazkaTest.littleShop;

import java.util.HashMap;
import java.util.Map;

public class Order {

    public static void main(String[] args) {

        ProductNumber productNumber1 = new ProductNumber(120, new Product("Buty nike", 234));
        ProductNumber productNumber2 = new ProductNumber(10, new Product("Laprop Acer", 3342));
        ProductNumber productNumber3 = new ProductNumber(17, new Product("Koszulka Puma", 100));
        ProductNumber productNumber4 = new ProductNumber(14, new Product("Telewizor Samsung", 4000));
        ProductNumber productNumber5 = new ProductNumber(11, new Product("Walizka", 200));
        ProductNumber productNumber6 = new ProductNumber(11, new Product("Walizka", 200));

        HashMap<Integer, ProductNumber> order = new HashMap<>();

        order.put(1, productNumber1);
        order.put(2, productNumber2);
        order.put(3, productNumber3);
        order.put(4, productNumber4);
        order.put(5, productNumber5);   //duplicate
        order.put(5, productNumber6);   //duplicate

        for(Map.Entry<Integer, ProductNumber> loop : order.entrySet()){
            System.out.println("Order: " +loop.getKey() + " " + loop.getValue());
        }

        System.out.println("We have duplicate? = " + productNumber5.equals(productNumber6));
        System.out.println("Order size: " + order.size());

    }

}
