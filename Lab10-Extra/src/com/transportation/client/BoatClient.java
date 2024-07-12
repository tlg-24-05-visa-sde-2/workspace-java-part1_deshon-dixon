package com.transportation.client;

import com.transportation.Boat;

class BoatClient {

    public static void main(String[] args) {

        Boat boat = new Boat("FreeBird");
        boat.moveTo("West Seattle");
    }
}