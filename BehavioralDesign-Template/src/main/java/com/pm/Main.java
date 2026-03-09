package com.pm;

import com.pm.impl.InternationalOrderProcessor;
import com.pm.impl.PrimeOrderProcessor;
import com.pm.impl.StandardOrderProcessor;

//TIP The Template Method Design Pattern is a behavioral design pattern that defines the skeleton of an algorithm in a base class, but allows subclasses to override specific steps of the algorithm without changing its overall structure.
public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("ORD-001", 49.99);
        Order order2 = new Order("ORD-002", 149.99);
        Order order3 = new Order("ORD-003", 89.99);

        OrderProcessor standard = new StandardOrderProcessor();
        standard.processOrder(order1);

        System.out.println();

        OrderProcessor prime = new PrimeOrderProcessor();
        prime.processOrder(order2);

        System.out.println();

        OrderProcessor international = new InternationalOrderProcessor();
        international.processOrder(order3);
    }
}