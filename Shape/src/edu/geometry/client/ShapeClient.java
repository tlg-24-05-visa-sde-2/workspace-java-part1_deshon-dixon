package edu.geometry.client;

import edu.geometry.*;

public class ShapeClient {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(12);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Triangle(12, 10, 17);

        double total = 0;

        for (Shape shape : shapes) {
            System.out.println();
            System.out.println(shape + "\n" + "area=" + shape.getArea());
            total += shape.getArea();
        }

        System.out.println();
        System.out.println("Total area of all shapes: " + total);
    }
}
