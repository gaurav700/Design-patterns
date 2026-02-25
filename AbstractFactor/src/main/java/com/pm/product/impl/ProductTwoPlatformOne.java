package com.pm.product.impl;

import com.pm.product.AbstractProductTwo;

public class ProductTwoPlatformOne implements AbstractProductTwo {

    @Override
    public void printDescription() {
        System.out.println("Product Two running on Platform One");
    }
}