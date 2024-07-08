package com.digitalcamera;

public class Camera {
    // STATIC FIELDS
    public static final int MIN_ISO = 160;
    public static final int MAX_ISO = 5000;

    // PROPERTIES/ ATTRIBUTES
    private String cameraName = "Canon EOS Rebel T7i";
    private Resolution resolution = Resolution.HD;
    private int iso = 160;
    private int shutterSpeed = 50;
    private double frameRate = 30.0;
    private WhiteBalance whiteBalance = WhiteBalance.AUTO;

    // CONSTRUCTORS
    public Camera() {
    }

    public Camera(String cameraName) {
        this();
        setCameraName(cameraName);
    }

    public Camera(String cameraName, Resolution resolution) {
        this(cameraName);
        setResolution(resolution);
    }

    public Camera(String cameraName, Resolution resolution, double frameRate, WhiteBalance whiteBalance) {
        this(cameraName, resolution);
        setFrameRate(frameRate);
        setWhiteBalance(whiteBalance);
    }

    public Camera(String cameraName, Resolution resolution, int iso, int shutterSpeed, double frameRate, WhiteBalance whiteBalance) {
        this(cameraName, resolution);
        setIso(iso);
        setShutterSpeed(shutterSpeed);
        setFrameRate(frameRate);
        setWhiteBalance(whiteBalance);
    }

    // FUNCTIONS
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
        System.out.println("Your " + getCameraName() + " is starting... ");
        System.out.println();
    }

    private void cameraOn() {
        System.out.println("Your " + getCameraName() + " has turned on: " + "\n" + "Resolution: " + getResolution() + "\n" + "ISO: " + getIso() + "\n" + "ShutterSpeed: " + "1/" + getShutterSpeed() + "th" + "\n" + "FrameRate: " + getFrameRate() + "fps" + "\n" + "WhiteBalance: " + getWhiteBalance());
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
        System.out.println("Your " + getCameraName() + " has been turned off. ");
        System.out.println();
    }

    // ACCESSOR METHODS
    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
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

    public WhiteBalance getWhiteBalance() {
        return whiteBalance;
    }

    public void setWhiteBalance(WhiteBalance whiteBalance) {
        this.whiteBalance = whiteBalance;
    }

    public String toString() {
        return "Camera: " +
                "CameraName= " + getCameraName() + '\'' +
                ", Resolution= " + getResolution() +
                ", ISO= " + getIso() +
                ", ShutterSpeed= " + getShutterSpeed() +
                ", FrameRate= " + getFrameRate() +
                ", WhiteBalance= " + getWhiteBalance();
    }
}