package org.example.abstractionInterface;

public class Main {
    public static void main(String[] args) {
        // for area of a square
        ShapeArea geometry = new ShapeArea();
        geometry.Square();

        // for area of rectangle
        geometry.Rectangle();

        // for area of circle
        ShapeArea geometry1 = new ShapeArea();
        geometry1.Circle();

        // for area of Oval
        ShapeArea geometry2 = new ShapeArea();
        geometry2.Oval();
    }
}
