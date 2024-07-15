package edu.geometry;

public class Rectangle implements Shape {
    // PROPERTIES
    private final int length;
    private final int width;

    // CONSTRUCTOR
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // ACCESSOR METHODS
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": length=" + getLength() + ", width=" + getWidth();
    }
}