package com.pm;

public class Order {
    private String id;
    private double subtotal;

    public Order(String id, double subtotal) {
        this.id = id;
        this.subtotal = subtotal;
    }

    public String getId() { return id; }
    public double getSubtotal() { return subtotal; }
}