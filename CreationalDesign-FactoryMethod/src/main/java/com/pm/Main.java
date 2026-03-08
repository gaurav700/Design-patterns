package com.pm;

import com.pm.factory.ShapeCreater;
import com.pm.factory.obj.CircleCreater;
import com.pm.factory.obj.RectangleCreater;
import com.pm.factory.obj.TraingleCreater;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         ShapeCreater creator;

         creator = new CircleCreater();
         creator.describe();

         creator = new RectangleCreater();
         creator.describe();

         creator = new TraingleCreater();
         creator.describe();
    }
}