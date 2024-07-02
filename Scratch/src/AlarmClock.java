/*
 * Application class to model the workings of an AlarmClock.
 * This class will NOT have a main() method, most such classes do not.
 */

class AlarmClock {
    // properties or attributes - these are called "instance variables" or "fields" in Java
    private int snoozeInterval = 5; // default value when client doesn't specify one (instead of 0)

    // constructors
    public AlarmClock() {
        // no-op
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);
    }

    // functions or operations - these are called "methods" in Java
    public void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    // accessor methods - provide "controlled access" to the object's fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // TODO: implement constraint - must be between 1 and 20 (inclusive)
    // if incoming value is "valid," we take it, i.e., assign to the private field
    // otherwise, we reject it with an error message
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= 1 && snoozeInterval <= 20) {
            this.snoozeInterval = snoozeInterval;
        } else {
            System.out.println("Invalid snooze interval: " + snoozeInterval + ". " + "Must be between 1 and 20. (inclusive).");
        }
    }

    /*
     * Purpose: return a string (sentence) describing this object.
     */

    public String toString() {
        return "AlarmClock: " +
                "snoozeInterval=" + getSnoozeInterval();
    }
}