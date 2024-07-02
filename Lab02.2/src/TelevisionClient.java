/*
 * Application main-class.
 * In the main() method, we will create a few Television objects and give them a basic test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
        // get number off current instances should be 0
        System.out.println();
        System.out.println(Television.getInstanceCount() + " instances");
        System.out.println();

        // create instances of Television and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);

        Television tv2 = new Television("Sony", Television.MIN_VOLUME);

        Television tv3 = new Television("LG");

        tv1.turnOn();
        tv1.turnoff();
        System.out.println(tv1);
        System.out.println();

        tv2.turnOn();
        tv2.turnoff();
        System.out.println(tv2);
        System.out.println();

        tv3.turnOn();
        tv3.turnoff();
        System.out.println(tv3);
        System.out.println();

        // number off current instances should now be 3
        System.out.println(Television.getInstanceCount() + " instances");
    }
}