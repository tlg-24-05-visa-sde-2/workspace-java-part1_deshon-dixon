package com.digitalcamera.test;

import com.digitalcamera.Camera;
import com.digitalcamera.Resolution;

class CameraValidationTest {

    public static void main(String[] args) {
        Camera cam = new Camera();

        //    ---------- ISO VALIDATION TESTS -----------

        // ISO VALIDATION: 1
        System.out.println();
        System.out.println("Test 1");
        System.out.println("------");
        cam.setIso(500);
        System.out.println();
        System.out.println("[" + "ISO set to: " + cam.getIso() + "]");
        System.out.println();
        System.out.println(cam);
        System.out.println();

        // ISO VALIDATION: 2
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

        // ISO VALIDATION: 3
        System.out.println();
        System.out.println("Test 3");
        System.out.println("------");
        cam.setIso(5000);
        System.out.println();
        System.out.println("[" + "ISO set to: " + cam.getIso() + "]");
        System.out.println();
        System.out.println(cam);
        System.out.println();

        //    ---------- RESOLUTION VALIDATION TESTS -----------

        // RESOLUTION VALIDATION: 1
        System.out.println();
        System.out.println("Test 4");
        System.out.println("------");
        System.out.println();
        cam.setResolution(Resolution.FULL_ULTRA_HD);
        System.out.println();
        System.out.println("[" + "Resolution set to: " + cam.getResolution() + "]");
        System.out.println();
        System.out.println(cam);
        System.out.println();

        // RESOLUTION VALIDATION: 2
        System.out.println();
        System.out.println("Test 5");
        System.out.println("------");
        cam.setResolution(Resolution.HD);
        System.out.println();
        System.out.println("[" + "com.camera.Resolution set to: " + cam.getResolution() + "]");
        System.out.println();
        System.out.println(cam);
        System.out.println();

        // RESOLUTION VALIDATION: 3
        System.out.println();
        System.out.println("Test 6");
        System.out.println("------");
        cam.setResolution(Resolution.ULTRA_HD);
        System.out.println();
        System.out.println("[" + "com.camera.Resolution set to: " + cam.getResolution() + "]");
        System.out.println();
        System.out.println(cam);
        System.out.println();

    }
}