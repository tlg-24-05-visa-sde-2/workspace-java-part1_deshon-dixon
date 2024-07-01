class CameraClient {

    public static void main(String[] args) {
        // Creating instances of camera one.
        Camera cam1 = new Camera();
        cam1.setBrand("Lumix S5 IIX");
        cam1.setIso(640);
        cam1.setShutterSpeed(50);
        cam1.setResolution("[5.9K] 5888x3312");
        cam1.setFrameRate(23.98);
        cam1.setWhiteBalance("Auto");

        // Creating instances of camera two.
        Camera cam2 = new Camera();
        cam2.setBrand("FujiFilm XH2S");
        cam2.setIso(500);
        cam2.setShutterSpeed(240);
        cam2.setResolution("[4K] 3840 x 2160");
        cam2.setFrameRate(120);
        cam2.setWhiteBalance("Tungsten");

        System.out.println();
        cam1.cameraAction();
        System.out.println();
        System.out.println(cam1);
        System.out.println("-------------------\n");
        cam2.cameraAction();
        System.out.println(cam2);
        System.out.println();
        System.out.println("-------------------");
        
    }
}