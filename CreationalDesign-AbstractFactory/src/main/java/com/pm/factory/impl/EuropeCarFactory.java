package com.pm.factory.impl;

import com.pm.factory.CarFactory;
import com.pm.product.Car;
import com.pm.product.CarSpecification;
import com.pm.product.impl.EuropeCarSpecification;
import com.pm.product.impl.Hatchback;

public class EuropeCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeCarSpecification();
    }
}
