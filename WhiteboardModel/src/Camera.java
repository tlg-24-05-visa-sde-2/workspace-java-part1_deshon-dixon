class Camera {
    // properties or attributes (please limit this to 5 or 6, max)
    private String brand;
    private String resolution;
    private int iso;
    private int shutterSpeed;
    private double frameRate;
    private String whiteBalance;

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
        System.out.println("Your " + getBrand() + " is starting... ");
        System.out.println();
    }

    private void cameraOn() {
        System.out.println("Your " + getBrand() + " has turned on: " + "\n" + "Resolution: " + getResolution() + "\n" + "ISO: " + getResolution() + "\n" + "Shutter Speed: " + "1/" + getShutterSpeed() + "th" + "\n" + "FrameRate: " + getFrameRate() + "fps" + "\n" + "White Balance: " + getWhiteBalance());
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

    public String toString() {
        return "Camera: " +
                "Brand = '" + getBrand() + '\'' +
                ", Resolution = '" + getResolution() + '\'' +
                ", ISO = " + getIso() +
                ", Shutter Speed = " + getShutterSpeed() +
                ", Frame Rate = " + getFrameRate() +
                ", White Balance = " + getWhiteBalance() + '\'';
    }
}