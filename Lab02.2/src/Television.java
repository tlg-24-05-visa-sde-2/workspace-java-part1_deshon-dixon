/*
 * Application or system class to model the workings of a television.
 * It has properties/attributes, it has business methods, but NO main() method.
 */
class Television {
    // properties or attributes - "fields" or "instance variables"
    private String brand = "Toshiba";
    private int volume = 1;

    // functions or operations - "methods"
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " television and setting volume to " + getVolume());
        System.out.println(isConnected);
    }

    public void turnoff () {
        System.out.println("Shutting down...goodbye");
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    // accessor methods - "getters, setters, toString"
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString() {
        return "Television: " +
                "Brand = " + getBrand() +
                ", Volume = " + getVolume();
    }

}