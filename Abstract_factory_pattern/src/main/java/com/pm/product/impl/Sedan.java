package com.pm.product.impl;

import com.pm.product.Car;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Sedan assemble");
    }
}
