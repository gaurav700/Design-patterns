package com.pm.Decorators.impl;

import com.pm.Decorators.PizzaDecorator;
import com.pm.Pizza;

public class MushroomDecorator extends PizzaDecorator {

    public MushroomDecorator(Pizza p) {
        super(p);
    }

    @Override
    public double getCost() {
        return super.getCost()+1.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mushroom";
    }


}
