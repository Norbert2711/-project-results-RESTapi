package com.project.queque;

import java.util.ArrayDeque;

class OrdersQueueExample
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Create 3 sample books
        Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
        Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
        Book theBook3 = new Book("50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572);

        // Create 5 sample orders
        Order theOrder1 = new Order(theBook1, 2017, 6, 28);
        Order theOrder2 = new Order(theBook2, 2017, 6, 28);
        Order theOrder3 = new Order(theBook1, 2017, 6, 29);
        Order theOrder4 = new Order(theBook2, 2017, 6, 30);
        Order theOrder5 = new Order(theBook3, 2017, 6, 30);

        // Create the FIFO queue
        ArrayDeque<Order> theOrders = new ArrayDeque<Order>();

        // Check size of the queue
        System.out.println("Queue is created. It's size: " + theOrders.size());

        // Put the orders into the queue
        theOrders.push(theOrder1);
        theOrders.push(theOrder2);
        theOrders.push(theOrder3);
        theOrders.push(theOrder4);
        theOrders.push(theOrder5);

        // Check size of the queue
        System.out.println("Queue is filled. It's size: " + theOrders.size());
        System.out.println();

        // Examine the order at beginning of the queue
        //System.out.println("First order in the queue is: \n" + theOrders.peek());
        System.out.println();

        // Get objects from queue
        Order temporaryOrder;
        temporaryOrder = theOrders.pop();

        // here you can do something with order taken from the queue
        temporaryOrder = theOrders.pop();
        temporaryOrder = theOrders.pop();
        temporaryOrder = theOrders.pop();
        temporaryOrder = theOrders.pop();

        // Check size of the queue
        System.out.println("Queue is emptied. It's size: " + theOrders.size());
        System.out.println();

        // Check what was taken as last
        System.out.println("Last order deleted from queue was:\n" + temporaryOrder);
        System.out.println();
    }
}
