package com.pm.Decorators.impl;

import com.pm.Decorators.PizzaDecorator;
import com.pm.Pizza;

public class PepperoniDecorator extends PizzaDecorator {

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost()+2.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pepperoni";
    }
}
