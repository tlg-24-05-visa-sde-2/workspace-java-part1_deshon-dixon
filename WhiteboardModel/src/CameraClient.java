class CameraClient {

    public static void main(String[] args) {

        Camera cam1 = new Camera("Lumix S5 IIX", "[5.9K] 5888x3312", 160, 50, 23.98, "Auto");

        Camera cam2 = new Camera("FujiFilm XH2S", "[4K] 3840 x 2160", 500, 240, 120, "Tungsten");

        cam1.cameraAction();
        System.out.println(cam1 + "\n" + "---------------------------------");
        cam2.cameraAction();
        System.out.println(cam2 + "\n" + "---------------------------------");
        
    }
}