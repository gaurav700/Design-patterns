package com.pm.factory.impl;

import com.pm.factory.CarFactory;
import com.pm.product.Car;
import com.pm.product.CarSpecification;
import com.pm.product.impl.NorthAmericaCarSpecification;
import com.pm.product.impl.Sedan;

public class NorthAmericaCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericaCarSpecification();
    }
}
