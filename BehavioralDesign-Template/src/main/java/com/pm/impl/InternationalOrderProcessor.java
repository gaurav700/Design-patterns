package com.pm.impl;

import com.pm.Order;
import com.pm.OrderProcessor;

public class InternationalOrderProcessor extends OrderProcessor {
    @Override
    protected void validateOrder(Order order) {
        System.out.println("Validating international order: customs, restricted items, address format...");
    }

    @Override
    protected void calculateOrder(Order order) {
        double shipping = 24.99;
        double customs = order.getSubtotal() * 0.15;
        double total = order.getSubtotal() + shipping + customs;
        System.out.println("International total: $" + total
                + " (shipping: $" + shipping + ", customs: $" + customs + ")");
    }

    @Override
    protected void processPayment(Order order) {
        System.out.println("Processing payment with currency conversion...");
    }

    @Override
    protected void sendConfirmation(Order order) {
        System.out.println("Sending multi-language confirmation with tracking for order " + order.getId());
    }
}