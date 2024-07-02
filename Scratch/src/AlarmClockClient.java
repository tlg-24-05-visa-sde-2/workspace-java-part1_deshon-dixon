/*
 * Client-side "main-class" i.e., the class definition with main().
 * That's the ONLY thing in here.
 * We will create a few AlarmClock objects and give them a basic test-drive.
 */
class AlarmClockClient {

    // starting point or "entry" point for every standalone application
    public static void main(String[] args) {
        // create an instance (or object) of AlarmClock and set its snoozeInterval
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);  // this will be disallowed next week


        // create a 2nd AlarmClock object via its snoozeInterval ctor (do it in one shot)
        AlarmClock clock2 = new AlarmClock(10);

        // create a 3rd AlarmClock object, but this time DON'T give it a snoozeInterval
        AlarmClock clock3 = new AlarmClock();

        // make them snooze()
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);

    }
}