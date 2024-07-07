import java.util.Arrays;

class CameraClientArgs {

    public static void main(String[] args) {
        if (args.length < 4) {
            String usage = "Usage: java CameraClientArgs <cameraName> <resolution> <frameRate> <whiteBalance>";
            String example = "Example: java CameraClientArgs Blackmagic HD 60 AUTO";
            String note = "Note: supported resolutions are " + Arrays.toString(Resolution.values());
            String note2 = "Note: supported white balances are " + Arrays.toString(WhiteBalance.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            System.out.println(note2);
            return;
        }

        String cameraName = args[0];
        Resolution resolution = Resolution.valueOf(args[1].toUpperCase());
        double frameRate = Double.parseDouble(args[2]);
        WhiteBalance whiteBalance = WhiteBalance.valueOf(args[3].toUpperCase());

        Camera cam = new Camera(cameraName, resolution, frameRate, whiteBalance);

        cam.cameraAction();
        System.out.println(cam);

    }
}