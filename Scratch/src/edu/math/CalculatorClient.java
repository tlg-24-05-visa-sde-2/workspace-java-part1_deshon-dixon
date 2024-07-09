package edu.math;


import static edu.math.Calculator.*;

class CalculatorClient {

    public static void main(String[] args) {
        double sum = Calculator.add(1,3); // passing ints where doubles are expected (implicit upcast)
        System.out.println("\n" + "sum is: " + sum);

        System.out.println("difference is: " + subtract(1.1,3.1)); // here we pass doubles

        System.out.println("2 is even? " + isEven(2));

        System.out.println();

        System.out.println("default version: " + Calculator.randomInt() + "\n" + "min-max version: " + randomInt(5,16) + "\n" + "one to max version: " + randomInt(20));

        System.out.println();

        System.out.println("Average is: " + avg(3,4,9,2,3));
        System.out.println("Average of 12 is: " + avg(12));
    }
}