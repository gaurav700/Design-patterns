package com.pm.factory.obj;

import com.pm.factory.Shape;
import com.pm.factory.ShapeCreater;
import com.pm.factory.products.Circle;

public class CircleCreater extends ShapeCreater {

    @Override
    public Shape createShape() {
        return new Circle(4.0);
    }
}
