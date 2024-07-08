package com.digitalcamera.client;

import com.digitalcamera.Camera;
import com.digitalcamera.Resolution;
import com.digitalcamera.WhiteBalance;

import java.util.Arrays;

class CameraClientArgs {

    public static void main(String[] args) {
        if (args.length < 4) {
            String usage = "Usage: java CameraClientArgs <cameraName> <resolution> <frameRate> <whiteBalance>";
            String example = "Example: java CameraClientArgs BlackMagic FULL_HD 60 AUTO";
            String note = "Note: Supported resolutions: HD (" + Resolution.HD + "), FULL_HD (" + Resolution.FULL_HD + "), ULTRA_HD (" + Resolution.ULTRA_HD + "), and FULL_ULTRA_HD (" + Resolution.FULL_ULTRA_HD + ")";
            String note2 = "Note: Supported white balances are " + Arrays.toString(WhiteBalance.values());
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