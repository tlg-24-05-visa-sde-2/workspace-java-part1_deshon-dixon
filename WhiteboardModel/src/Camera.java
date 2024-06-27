class Camera {
    // properties or attributes (please limit this to 5 or 6, max)
    String brand;
    String resolution;
    int iso;
    int shutterSpeed;
    double frameRate;
    String whiteBalance;


    void start() {
        System.out.println("Your " + brand + " is starting.... ");
    }

    void cameraOn() {
        System.out.println("Your " + brand + " has turned on: " + "\n" + "Resolution: " + resolution + "\n" + "ISO: " + iso + "\n" + "Shutter Speed: " + "1/" + shutterSpeed + "th" + "\n" + "FrameRate: " + frameRate + "fps" + "\n" + "White Balance: " + whiteBalance);
    }

    void recordOn() {
        System.out.println("Camera is recording... ");
    }

    void recordOff() {
        System.out.println("Recording has stopped. ");
    }

    void save() {
        System.out.println("Your footage has been saved. ");
    }

    void cameraOff() {
        System.out.println("Your " + brand + " has been turned off. ");
    }

}