package edu.math;

class CalculatorClient {

    public static void main(String[] args) {
        double sum = Calculator.add(1,3); // passing ints where doubles are expected (implicit upcast)
        System.out.println("\n" + "sum is: " + sum);

        System.out.println("difference is: " + Calculator.subtract(1.1,3.1)); // here we pass doubles

        System.out.println("2 is even? " + Calculator.isEven(2));

        System.out.println();

        System.out.println("default version: " + Calculator.randomInt() + "\n" + "min-max version: " + Calculator.randomInt(5,16) + "\n" + "one to max version: " + Calculator.randomInt(20));

        System.out.println();

        System.out.println("Average is: " + Calculator.avg(3,4,9,2,3));
        System.out.println("Average of 12 is: " + Calculator.avg(12));
    }
}