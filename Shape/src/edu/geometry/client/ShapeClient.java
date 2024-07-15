package edu.geometry.client;

import edu.geometry.*;

import java.util.ArrayList;
import java.util.Collection;

public class ShapeClient {
    public static void main(String[] args) {
        Collection<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(12));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Triangle(12, 10, 17));

        double total = 0;

        for (Shape shape : shapes) {
            System.out.println();
            System.out.println(shape + "\n" + "area=" + shape.getArea() + ", perimeter=" + shape.getPerimeter());
            total += shape.getArea();
        }

        System.out.println();
        System.out.println("Total area of all shapes: " + total);
    }
}
