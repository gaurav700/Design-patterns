package com.pm;

public class MenuItem implements Menu{
    private final String name;
    private final double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display(String indent) {
        System.out.printf("%s%s - $%.2f%n", indent, name, price);
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
