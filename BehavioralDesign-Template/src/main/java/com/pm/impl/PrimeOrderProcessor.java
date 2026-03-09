package com.pm.impl;

import com.pm.Order;
import com.pm.OrderProcessor;

public class PrimeOrderProcessor extends OrderProcessor {
    @Override
    protected void validateOrder(Order order) {
        System.out.println("Validating Prime order: checking membership and stock...");
    }

    @Override
    protected void calculateOrder(Order order) {
        System.out.println("Prime total: $" + order.getSubtotal() + " (free shipping)");
    }

    @Override
    protected void processPayment(Order order) {
        System.out.println("Processing payment via Prime billing...");
    }

    @Override
    protected void applyDiscount(Order order) {
        System.out.println("Applying 10% Prime member discount...");
    }
}