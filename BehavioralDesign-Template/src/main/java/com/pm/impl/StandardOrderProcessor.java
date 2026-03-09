package com.pm.impl;

import com.pm.Order;
import com.pm.OrderProcessor;

public class StandardOrderProcessor extends OrderProcessor {
    @Override
    protected void validateOrder(Order order) {
        System.out.println("Validating standard order: checking stock and address...");
    }

    @Override
    protected void calculateOrder(Order order) {
        double shipping = 5.99;
        double total = order.getSubtotal() + shipping;
        System.out.println("Standard total: $" + total + " (including $" + shipping + " shipping)");
    }

    @Override
    protected void processPayment(Order order) {
        System.out.println("Processing payment via standard gateway...");
    }
}
