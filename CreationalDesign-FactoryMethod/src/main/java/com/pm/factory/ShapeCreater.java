package com.pm.factory;

public abstract class ShapeCreater {
    public abstract Shape createShape();

    public void describe() {
        Shape shape = createShape();
        shape.describe();
    }
}
