/*
 * Application main-class.
 * In the main() method, we will create a few Television objects and give them a basic test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
        // create an instance of Television and set its properties
        Television tv1 = new Television();
        tv1.brand = "Samsung";
        tv1.volume = 32;

        // create a second instance of Television and set its properties, also
        Television tv2 = new Television();
        tv2.brand = "Sony";
        tv2.volume = 50;

        // create a third instance of Television but DON'T set its properties
        Television tv3 = new Television();

        // turn them all on
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();

        // turn them all off
        tv1.turnoff();
        tv2.turnoff();
        tv3.turnoff();
    }
}