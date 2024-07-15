package com.digitalcamera.test;

import com.digitalcamera.Camera;
import com.digitalcamera.Resolution;

/**
 * JR: not thorough enough, and enum-value testing is unnecessary.
 * To do proper BVT (Boundary Value Testing) for range of [160-5000], we need to test
 *  159,160  and  5000,5001
 *
 * And bug in setIso() could have been detected with more careful examination of the output.
 *  Test 2
 *  ------
 *  ERROR: ISO provided 500 is invalid. ISO will remain: 500. Must be between 160 and 5000.
 */
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
        System.out.println(cam);  // JR: unnecessary, given the output right above this
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

        /*
         * JR: none of these are necessary, since an enum type was used.
         * There is no way a client can set it to an invalid value, that's why we use enums.
         */

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