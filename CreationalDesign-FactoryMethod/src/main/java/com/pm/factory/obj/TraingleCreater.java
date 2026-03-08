package com.pm.factory.obj;

import com.pm.factory.Shape;
import com.pm.factory.ShapeCreater;
import com.pm.factory.products.Triangle;

public class TraingleCreater extends ShapeCreater {
    @Override
    public Shape createShape() {
        return new Triangle(4.0, 4.0);
    }
}
