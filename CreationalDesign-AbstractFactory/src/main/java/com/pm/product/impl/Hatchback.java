package com.pm.product.impl;

import com.pm.product.Car;

public class Hatchback implements Car{
    @Override
    public void assemble() {
        System.out.println("Sedan assemble");
    }
}
