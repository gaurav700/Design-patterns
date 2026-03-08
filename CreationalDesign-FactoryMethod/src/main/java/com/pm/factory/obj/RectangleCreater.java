package com.pm.factory.obj;

import com.pm.factory.Shape;
import com.pm.factory.ShapeCreater;
import com.pm.factory.products.Rectangle;

public class RectangleCreater extends ShapeCreater {

    @Override
    public Shape createShape() {
        return new Rectangle(4.0, 4.0);
    }
}
