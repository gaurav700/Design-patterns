package com.pm;


interface Shape{
    Shape clone();
    void draw();
}

class Rectangle implements Shape{

    private final String color;

    public Rectangle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a "+ color + " rectangle.");
    }
}


class  Circle implements Shape{
    private final String color;
    public Circle(String color) {
        this.color = color;
    }
    @Override
    public Shape clone() {
        return new Circle(this.color);
    }
    @Override
    public void draw() {
        System.out.println("Drawing a "+ color + " circle.");
    }
}

class ShapeClient{
    private Shape shapePrototype;

    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    public Shape createShape(){
        return shapePrototype.clone();
    }
}



public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("red");
        ShapeClient shapeClient = new ShapeClient(circle);
        Shape redCirle = shapeClient.createShape();
        redCirle.draw();

        Shape rectangle = new Rectangle("blue");
        ShapeClient shapeClient1 = new ShapeClient(rectangle);
        Shape blueRectangele = shapeClient1.createShape();
        blueRectangele.draw();
    }
}