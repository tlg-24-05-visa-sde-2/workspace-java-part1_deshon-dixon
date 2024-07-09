package com.entertainment;

import java.util.Arrays;

/*
 * Application or system class to model the workings of a television.
 * It has properties/attributes, it has business methods, but NO main() method.
 */
public class Television {
    // class-level ("static") variables - these live in the "shared area," up "above" the instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    // disclaimer: the proper way would be to use a Brand enum
    // we will do it this way for the labs, just for more practice with arrays and loops
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    private static int instanceCount = 0;

    // this method is also "up there" in the "shared zone," it does not execute inside a Television object
    public static int getInstanceCount() {
        return instanceCount;
    }

    // Recall: all static methods are called as Television.methodName()
    // in this case, that means Television.isValidBrand()
    public static boolean isValidBrand(String brand) {
        boolean valid = false;

        for (String currentBrand : VALID_BRANDS) {
            if (currentBrand.equals(brand)) {    // we have a match
                valid = true;
                break;                           // no need to keep looking
            }
        }
        return valid;
    }

    // -------------------------------------

    // properties or attributes - "fields" or "instance variables"
    private String brand = "Toshiba";
    private int volume = 1;
    private boolean isMuted;
    private int oldVolume;
    private DisplayType display = DisplayType.LED;

    // constructors - these get called when the client says "new"
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();                       // delegate to no-arg constructor above for the increment
        setBrand(brand);              // delegate to setter for any validation/conversion it might be doing
    }

    public Television (String brand, int volume) {
        this(brand);
        setVolume(volume);
        setDisplay(display);
    }
    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);        // delegate to neighboring constructor above me for 'brand'
        setDisplay(display);
    }


    // functions or operations - "methods"
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " television and setting volume to " + getVolume());
    }

    public void turnoff () {
        System.out.println("Shutting down...goodbye");
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    public void mute() {
        if (!isMuted()) {
            oldVolume = volume;
            volume = 0;
            isMuted = true;
        } else {
            volume = oldVolume;
            isMuted = false;
        }
    }

    // accessor methods
    public String getBrand() {
        return brand;
    }

    // VALID_BRANDS contains ["Samsung", "LG", "Sony", "Toshiba"]
    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.println("ERROR: Invalid brand: " + brand + "\n" + "Valid brands are: " + Arrays.toString(VALID_BRANDS));
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        } else {
            System.out.printf(" ERROR: Invalid volume %s. Volume must be between %s and %s. Volume will remain: %s. \n", volume, MIN_VOLUME, MAX_VOLUME, getVolume());
        }
    }

    public boolean isMuted() {
        return isMuted;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public String toString() {
        String volumeString = isMuted ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand=%s volume=%s displayType=%s", getBrand(), volumeString, getDisplay());

    }

}