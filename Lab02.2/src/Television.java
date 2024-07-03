/*
 * Application or system class to model the workings of a television.
 * It has properties/attributes, it has business methods, but NO main() method.
 */
class Television {
    // class-level ("static") variables - these live in the "shared area," up "above" the instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;

    // this method is also "up there" in the "shared zone," it does not execute inside a Television object
    public static int getInstanceCount() {
        return instanceCount;
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

    public void setBrand(String brand) {
        if (brand.equalsIgnoreCase("Samsung") ||
                brand.equalsIgnoreCase("LG") ||
                brand.equalsIgnoreCase("Sony")) {
            System.out.println("PASSED");
            this.brand = brand.toUpperCase();
        } else {
            System.out.println("ERROR: Invalid TV Brand. TV Brand must be Samsung, LG, or Sony.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            System.out.println("PASSED");
            this.volume = volume;
            isMuted = false;
        } else {
            System.out.println("ERROR: Invalid volume: " + volume + ". Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME + "." + " Volume will remain: " + getVolume());
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
        return "Television: " +
                "Brand = " + getBrand() +
                ", Volume = " + volumeString +
                ", DisplayType = " + getDisplay();
    }

}