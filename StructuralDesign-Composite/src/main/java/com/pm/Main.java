package com.pm;

/**
 * TIP The Composite Design Pattern is a structural pattern that lets you treat individual objects and compositions of objects uniformly.
 * <br>Problem: Build a restaurant menu system where individual menu items and submenus share a common interface. A MenuItem is a leaf with a name and price. A SubMenu is a composite with a name that contains menu items and other submenus.
 * Requirements: <br>
 * Component interface: Menu with display(indent) and getItemCount() returning an int<br>
 * Leaf: MenuItem with a name and price. display() prints the item. getItemCount() returns 1.<br>
 * Composite: SubMenu with a name. display() prints its name then delegates to children. getItemCount() sums children's counts.<br>
 */
public class Main {
    public static void main(String[] args) {
        MenuItem burger = new MenuItem("Burger", 8.99);
        MenuItem fries = new MenuItem("Fries", 3.99);
        MenuItem cola = new MenuItem("Cola", 1.99);
        MenuItem water = new MenuItem("Water", 0.99);

         SubMenu drinks = new SubMenu("Drinks");
         drinks.addItem(cola);
         drinks.addItem(water);

         SubMenu mainMenu = new SubMenu("Main Menu");
         mainMenu.addItem(burger);
         mainMenu.addItem(fries);
         mainMenu.addItem(drinks);

         mainMenu.display("");
         System.out.println("\nTotal items: " + mainMenu.getItemCount());
    }
}