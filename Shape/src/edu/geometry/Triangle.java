package edu.geometry;

public class Triangle implements Shape {
    // PROPERTIES
    private final double side1;
    private final double side2;
    private final double angle;

    // CONSTRUCTOR
    public Triangle(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    // ACCESSOR METHODS
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getAngle() {
        return angle;
    }

    @Override
    public double getArea() {
        //formula: Area = (1/2) * a * b * sin(C)
        return 0.5 // (1/2)
                * getSide1() * getSide2()  // a * b
                * Math.sin(Math.toRadians(getAngle()));       // area formula for triangles - toRadians converts degrees to Radians
    }

    @Override
    public double getPerimeter() {
        // formula: c² = a² + b² - 2ab * cos(C)
        double side3 = Math.sqrt( // square root of the result to get the length of the third side
                side1 * side1 // a²
                        + side2 * side2 // b²
                        - 2 * side1 * side2 // 2ab
                        * Math.cos(Math.toRadians(getAngle()))); // cos(C)
        return side1 + side2 + side3; //sum of all three sides.
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": side1=" + getSide1() + ", side2=" + getSide2() + ", angle=" + getAngle() + " degrees";
    }
}
