package com.pm;

public abstract class OrderProcessor {
    public final void processOrder(Order order){
        validateOrder(order);
        calculateOrder(order);
        processPayment(order);
        applyDiscount(order);
        sendConfirmation(order);
    }

    protected abstract void validateOrder(Order order);
    protected abstract void calculateOrder(Order order);

    protected abstract void processPayment(Order order);

    protected void applyDiscount(Order order){}
    protected void sendConfirmation(Order order){
        System.out.println("Sending email confirmation for order " + order.getId());
    }

}
