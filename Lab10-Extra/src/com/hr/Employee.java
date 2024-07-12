package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
//    /*
//     * OPTION 1: try-catch and handle
//     * NOTE: it is critical that stop() gets called no matter what
//     */
//    public void goToWork() {
//        Car car = new Car("ABC123", "Ford", "Focus");
//        try {
//            car.start();
//            car.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            System.out.println("ERROR: " + e);
//        } finally {
//            car.stop();
//        }
//    }

//    /*
//     * OPTION 2: "punt" i.e., ignore the exception, we are not dealing with it
//     * NOTE: it is still critical that stop() gets called no matter what
//     */
//    public void goToWork() throws DestinationUnreachableException {
//        Car car = new Car("ABC123", "Ford", "Focus");
//        try {
//            car.start();
//            car.moveTo("West Seattle");
//        } finally {
//            car.stop();
//        }
//    }

//    /*
//     * OPTION 3: try-catch "react" / respond in someway then re-throw the exception back to my client.
//     * NOTE: it is still critical that stop() gets called no matter what
//     */
//    public void goToWork() throws DestinationUnreachableException {
//        Car car = new Car("ABC123", "Ford", "Focus");
//        try {
//            car.start();
//            car.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            // use the Java Mail API to send an email the Mayor.
//            throw e;
//        } finally {
//            car.stop();
//        }
//    }

    /*
     * OPTION 4: try-catch and throw a different one back at my client
     * NOTE: it is still critical that stop() gets called no matter what
     */
    public void goToWork() throws WorkException {
        Car car = new Car("ABC123", "Ford", "Focus");
        try {
            car.start();
            car.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            // use the Java Mail API to send an email the Mayor.
            throw new WorkException("Unable to get to work" + e);
        } finally {
            car.stop();
        }
    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}