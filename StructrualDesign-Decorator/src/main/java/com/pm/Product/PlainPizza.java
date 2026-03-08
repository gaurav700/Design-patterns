package com.pm.Product;

import com.pm.Pizza;

public class PlainPizza implements Pizza {
    @Override
    public double getCost() {
        return 5.00;
    }

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }
}
