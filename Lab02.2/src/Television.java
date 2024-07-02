/*
 * Application or system class to model the workings of a television.
 * It has properties/attributes, it has business methods, but NO main() method.
 */
class Television {
    // class-level ("static") variables - these live in the "shared area," up "above"
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    // properties or attributes - "fields" or "instance variables"
    private String brand = "Toshiba";
    private int volume = 1;

    // constructors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
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

    public static int getInstanceCount() {
        return instanceCount;
    }

    public String toString() {
        return "Television: " +
                "Brand = " + getBrand() +
                ", Volume = " + getVolume();
    }

}