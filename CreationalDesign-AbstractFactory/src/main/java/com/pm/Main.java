package com.pm;

import com.pm.factory.CarFactory;
import com.pm.factory.impl.EuropeCarFactory;
import com.pm.factory.impl.NorthAmericaCarFactory;
import com.pm.product.Car;
import com.pm.product.CarSpecification;
import com.pm.product.impl.NorthAmericaCarSpecification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarFactory northAmericaCarFactory = new NorthAmericaCarFactory();
        Car northAmericaCar =  northAmericaCarFactory.createCar();
        CarSpecification northAmericaCarSpecification = northAmericaCarFactory.createSpecification();
        northAmericaCar.assemble();
        northAmericaCarSpecification.display();


        CarFactory europeCarFactory = new EuropeCarFactory();
        Car europeCar =  europeCarFactory.createCar();
        CarSpecification europeCarSpecification = europeCarFactory.createSpecification();
        europeCar.assemble();
        europeCarSpecification.display();


    }
}