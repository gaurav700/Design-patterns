package com.pm.Decorators.impl;

import com.pm.Decorators.PizzaDecorator;
import com.pm.Pizza;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost()+1.50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }
}
