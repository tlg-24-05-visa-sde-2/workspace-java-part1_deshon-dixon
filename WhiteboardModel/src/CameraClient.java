class CameraClient {

    public static void main(String[] args) {

        System.out.println();

        Camera cam1 = new Camera("Lumix S5 IIX", Resolution.FULL_ULTRA_HD, 640, 50, 23.98, WhiteBalance.CLOUDY);

        Camera cam2 = new Camera("FujiFilm XH2S", Resolution.ULTRA_HD, 500, 240, 120, WhiteBalance.TUNGSTEN);

        cam1.cameraAction();
        System.out.println(cam1 + "\n" + "---------------------------------");
        cam2.cameraAction();
        System.out.println(cam2 + "\n" + "---------------------------------");
    }
}