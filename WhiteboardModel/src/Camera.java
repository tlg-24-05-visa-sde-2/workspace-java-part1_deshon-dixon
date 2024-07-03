class Camera {
    // static fields
    public static final int MIN_ISO = 160;
    public static final int MAX_ISO = 5000;

    private static int cameraCount = 0;

    // static accessor methods
    public static int getCameraCount() {
        return cameraCount;
    }

    // properties or attributes
    private String brand = "Canon EOS Rebel T7i";
    private String resolution = "1080p";
    private int iso = 160;
    private int shutterSpeed = 50;
    private double frameRate = 30.0;
    private WhiteBalance whiteBalance = WhiteBalance.AUTO;

    // constructors
    public Camera() {
        cameraCount++;
    }

    public Camera(String brand) {
        this();
        setBrand(brand);
    }

    public Camera(String brand, String resolution) {
        this(brand);
        setResolution(resolution);
    }

    public Camera(String brand, String resolution, int iso, int shutterSpeed, double frameRate, WhiteBalance whiteBalance) {
        this(brand);
        setResolution(resolution);
        setIso(iso);
        setShutterSpeed(shutterSpeed);
        setFrameRate(frameRate);
        setWhiteBalance(whiteBalance);
    }

    // functions
    public void cameraAction() {
        start();
        cameraOn();
        recordOn();
        recordOff();
        save();
        cameraOff();
    }
    private void start() {
        System.out.println();
        System.out.println("Your " + getBrand() + " is starting... ");
        System.out.println();
    }

    private void cameraOn() {
        System.out.println("Your " + getBrand() + " has turned on: " + "\n" + "Resolution: " + getResolution() + "\n" + "ISO: " + getIso() + "\n" + "Shutter Speed: " + "1/" + getShutterSpeed() + "th" + "\n" + "FrameRate: " + getFrameRate() + "fps" + "\n" + "White Balance: " + getWhiteBalance());
        System.out.println();
    }

    private void recordOn() {
        System.out.println("Camera is recording... ");
        System.out.println();
    }

    private void recordOff() {
        System.out.println("Recording has stopped. ");
        System.out.println();
    }

    private void save() {
        System.out.println("Your footage has been saved. ");
        System.out.println();
    }

    public void cameraOff() {
        System.out.println("Your " + getBrand() + " has been turned off. ");
        System.out.println();
    }

    // accessor methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        if (resolution.equalsIgnoreCase("720p") ||
                resolution.equalsIgnoreCase("1080p") ||
                resolution.equalsIgnoreCase("4K") ||
                resolution.equalsIgnoreCase("5.9K")) {
            this.resolution = resolution;
        } else {
            System.out.println("ERROR: Resolution provided is invalid. " +
                    "Resolution will default to: " + getResolution() + ". " +
                    "Must be 720p, 1080p, 4K, or 5.9K.");
        }
    }

    public int getIso() {
        return iso;
    }

    public void setIso(int iso) {

        if (iso >= MIN_ISO && iso <= MAX_ISO) {
            this.iso = iso;
        } else {
            System.out.println("ERROR: " + "ISO provided " + getIso() + " is invalid. " + "ISO will remain: " + getIso() + ". " + "Must be between " + MIN_ISO + " and " + MAX_ISO + ".");
        }
    }

    public int getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(int shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public double getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(double frameRate) {
        this.frameRate = frameRate;
    }

    public static void setCameraCount(int cameraCount) {
        Camera.cameraCount = cameraCount;
    }

    public WhiteBalance getWhiteBalance() {
        return whiteBalance;
    }

    public void setWhiteBalance(WhiteBalance whiteBalance) {
        this.whiteBalance = whiteBalance;
    }

    public String toString() {
        return "Camera: " +
                "Brand = " + getBrand() +
                ", Resolution = " + getResolution() +
                ", ISO = " + getIso() +
                ", Shutter Speed = " + getShutterSpeed() +
                ", Frame Rate = " + getFrameRate() +
                ", White Balance = " + getWhiteBalance() ;
    }
}