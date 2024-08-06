package org.example.abstractionInterface;

import java.util.Scanner;

public class ShapeArea implements Area{
    @Override
    public void Square() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Sides of the Square: ");
        double s = kb.nextDouble();
        double areaOfSquare = s * s;
        System.out.println("\nThe Area of the Square: " +areaOfSquare);
    }

    @Override
    public void Rectangle() {
        Scanner rec = new Scanner(System.in);
        System.out.println("\nEnter the Length of the rectangle: ");
        double l = rec.nextDouble();
        System.out.println("\nEnter the Width if the rectangle: ");
        double w = rec.nextDouble();
        double areaOfRectangle = l * w;
        System.out.println("\nThe Area of the rectangle: " +areaOfRectangle);

    }

    @Override
    public void Circle() {
        Scanner cir = new Scanner(System.in);
        System.out.println("\nEnter the radius of a Circle:");
        double r = cir.nextDouble();
        double areaOfCircle = r * r * Math.PI;
        System.out.println("\nThe Area of the Circle: " +areaOfCircle);

    }

    @Override
    public void Oval() {
        Scanner ov = new Scanner(System.in);
        System.out.println("\nEnter the Length of the 2 points: ");
        double a = ov.nextDouble();
        double b = ov.nextDouble();
        double areaOfOval = a * b * Math.PI;
        System.out.println("\nThe Area of the Oval: " +areaOfOval);
    }
}
