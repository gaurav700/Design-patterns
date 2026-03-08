package com.pm;

import com.pm.Decorators.impl.CheeseDecorator;
import com.pm.Decorators.impl.MushroomDecorator;
import com.pm.Decorators.impl.PepperoniDecorator;
import com.pm.Product.PlainPizza;

/**
 * TIP The Decorator Design Pattern is a structural pattern that lets you dynamically add new behavior or responsibilities to objects without modifying their underlying code.
 * <br>Problem: Build a pizza ordering system where customers can add toppings to a base pizza. Each topping adds to the cost and description.
 * Requirements: <br>
 * Component interface: Pizza with getCost() returning a double and getDescription() returning a String<br>
 * ConcreteComponent: PlainPizza with a base cost of $5.00 and description "Plain pizza"<br>
 * Decorators: CheeseDecorator (+$1.50), PepperoniDecorator (+$2.00), MushroomDecorator (+$1.00)<br>
 * Each decorator appends its topping name to the description<br>
 */
public class Main {
    public static void main(String[] args) {
        Pizza plain = new PlainPizza();
        System.out.printf("%s | $%.2f%n", plain.getDescription(), plain.getCost());

         Pizza cheesePepperoni = new PepperoniDecorator(new CheeseDecorator(new PlainPizza()));
         System.out.printf("%s | $%.2f%n", cheesePepperoni.getDescription(), cheesePepperoni.getCost());

         Pizza loaded = new MushroomDecorator(
             new PepperoniDecorator(new CheeseDecorator(new PlainPizza())));
         System.out.printf("%s | $%.2f%n", loaded.getDescription(), loaded.getCost());
    }
}