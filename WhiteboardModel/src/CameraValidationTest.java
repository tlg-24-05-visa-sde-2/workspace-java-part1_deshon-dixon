class CameraValidationTest {

    public static void main(String[] args) {
        Camera cam = new Camera();

        // ISO validation: 1
        System.out.println();
        System.out.println("Test 1");
        System.out.println("------");
        System.out.println();
        cam.setIso(500);
        System.out.println();
        System.out.println("[" + "ISO set to: " + cam.getIso() + "]");
        System.out.println();
        System.out.println(cam);
        System.out.println();

        // ISO validation: 2
        System.out.println();
        System.out.println("Test 2");
        System.out.println("------");
        System.out.println();
        cam.setIso(8000);
        System.out.println();
        System.out.println("[" + "ISO set to: " + cam.getIso() + "]");
        System.out.println();
        System.out.println(cam);
        System.out.println();

        // ISO validation: 3
        System.out.println();
        System.out.println("Test 3");
        System.out.println("------");
        System.out.println();
        cam.setIso(5000);
        System.out.println();
        System.out.println("[" + "ISO set to: " + cam.getIso() + "]");
        System.out.println();
        System.out.println(cam);
        System.out.println();

        // Resolution validation: 1
        System.out.println();
        System.out.println("Test 4");
        System.out.println("------");
        System.out.println();
        cam.setResolution("360p");
        System.out.println();
        System.out.println("[" + "Resolution set to: " + cam.getResolution() + "]");
        System.out.println();
        System.out.println(cam);
        System.out.println();

        // Resolution validation: 2
        System.out.println();
        System.out.println("Test 5");
        System.out.println("------");
        System.out.println();
        cam.setResolution("720p");
        System.out.println();
        System.out.println("[" + "Resolution set to: " + cam.getResolution() + "]");
        System.out.println();
        System.out.println(cam);
        System.out.println();

        // Resolution validation: 3
        System.out.println();
        System.out.println("Test 6");
        System.out.println("------");
        System.out.println();
        cam.setResolution("5.9K");
        System.out.println();
        System.out.println("[" + "Resolution set to: " + cam.getResolution() + "]");
        System.out.println();
        System.out.println(cam);
        System.out.println();

    }
}