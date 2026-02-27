package com.pm.factory;

import com.pm.product.Car;
import com.pm.product.CarSpecification;

/* Abstract Factory Interface */
public interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}