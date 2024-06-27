/*
 * Application or system class to model the workings of a television.
 * It has properties/attributes, it has business methods, but NO main() method.
 */
class Television {
    // properties or attributes - "fields" or "instance variables"
    String brand = "Toshiba";
    int volume = 1;

    // functions or operations - "methods"
    void turnOn() {
        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }

    void turnoff () {
        System.out.println("Shutting down...goodbye");
    }
}