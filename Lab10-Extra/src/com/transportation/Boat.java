package com.transportation;

public class Boat extends Vehicle{

    public Boat(String vin) {
        super(vin);
    }

    @Override
    public void moveTo(String location) {
        System.out.println("Boat is moving to " + location);
    }
}