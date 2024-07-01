/*
 * Application main-class.
 * In the main() method, we will create a few Television objects and give them a basic test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
        // create instances of Television and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(36);

        Television tv2 = new Television("Sony", 50);

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


    }
}