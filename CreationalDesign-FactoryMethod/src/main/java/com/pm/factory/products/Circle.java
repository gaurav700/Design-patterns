package com.pm.factory.products;

import com.pm.factory.Shape;

public class Circle implements Shape {
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public void describe() {
        System.out.printf("Circle with area: %.2f%n", area());
    }
}
