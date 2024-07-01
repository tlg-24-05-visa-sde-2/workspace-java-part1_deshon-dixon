class Camera {
    // properties or attributes (please limit this to 5 or 6, max)
    private String brand;
    private String resolution;
    private int iso;
    private int shutterSpeed;
    private double frameRate;
    private String whiteBalance;

    // functions
    public void start() {
        System.out.println("Your " + brand + " is starting... ");
    }

    public void cameraOn() {
        System.out.println("Your " + brand + " has turned on: " + "\n" + "Resolution: " + resolution + "\n" + "ISO: " + iso + "\n" + "Shutter Speed: " + "1/" + shutterSpeed + "th" + "\n" + "FrameRate: " + frameRate + "fps" + "\n" + "White Balance: " + whiteBalance);
    }

    public void recordOn() {
        System.out.println("Camera is recording... ");
    }

    public void recordOff() {
        System.out.println("Recording has stopped. ");
    }

    public void save() {
        System.out.println("Your footage has been saved. ");
    }

    public void cameraOff() {
        System.out.println("Your " + brand + " has been turned off. ");
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
        this.resolution = resolution;
    }

    public int getIso() {
        return iso;
    }

    public void setIso(int iso) {
        this.iso = iso;
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

    public String getWhiteBalance() {
        return whiteBalance;
    }

    public void setWhiteBalance(String whiteBalance) {
        this.whiteBalance = whiteBalance;
    }

    //constructor
    public Camera() {
    }

    @Override
    public String toString() {
        return "Camera: " +
                "brand='" + brand + '\'' +
                ", resolution='" + resolution + '\'' +
                ", iso=" + iso +
                ", shutterSpeed=" + shutterSpeed +
                ", frameRate=" + frameRate +
                ", whiteBalance='" + whiteBalance + '\'';
    }
}