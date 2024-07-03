class CameraClient {

    public static void main(String[] args) {

        System.out.println();
        System.out.println(Camera.getCameraCount() + " Cameras available");

        Camera cam1 = new Camera("Lumix S5 IIX", "5.9K", 640, 50, 23.98, WhiteBalance.AUTO);

        Camera cam2 = new Camera("FujiFilm XH2S", "4K", 500, 240, 120, WhiteBalance.TUNGSTEN);

        cam1.cameraAction();
        System.out.println(cam1 + "\n" + "---------------------------------");
        cam2.cameraAction();
        System.out.println(cam2 + "\n" + "---------------------------------");

        System.out.println();
        System.out.println(Camera.getCameraCount() + " Cameras available");
    }
}