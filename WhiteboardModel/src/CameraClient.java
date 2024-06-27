class CameraClient {

    public static void main(String[] args) {
        // Creating instances of camera1.
        Camera cam1 = new Camera();
        cam1.brand = "Lumix S5 IIX";
        cam1.iso = 640;
        cam1.shutterSpeed = 50;
        cam1.resolution = "[5.9K] 5888x3312";
        cam1.frameRate = 23.98;
        cam1.whiteBalance = "Auto";

        System.out.println();
        cam1.start();
        System.out.println();
        cam1.cameraOn();
        System.out.println();
        cam1.recordOn();
        cam1.recordOff();
        System.out.println();
        cam1.save();
        cam1.cameraOff();
        System.out.println();
        System.out.println("-------------------");
        System.out.println();


        // Creating instances of camera2.
        Camera cam2 = new Camera();
        cam2.brand = "FujiFilm XH2S";
        cam2.iso = 500;
        cam2.shutterSpeed = 240;
        cam2.resolution = "[4K] 3840 x 2160";
        cam2.frameRate = 120;
        cam2.whiteBalance = "Tungsten";

        cam2.start();
        System.out.println();
        cam2.cameraOn();
        System.out.println();
        cam2.recordOn();
        cam2.recordOff();
        System.out.println();
        cam2.save();
        cam2.cameraOff();
        System.out.println();
        System.out.println("-------------------");
        System.out.println();
    }
}