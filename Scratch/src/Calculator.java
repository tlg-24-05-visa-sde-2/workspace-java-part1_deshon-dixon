/*
 * This is an "all-static" class, i.e., it has nothing but static methods.
 */
class Calculator {

    public static double add(double a, double b) {
        return (a + b);
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns the average of the supplied integers.
     * WATCH OUT: the client caller can pass zero or more ints for this 'values'
     */
    public static double avg(int first, int... rest) {    // first: 3, rest: 4, 9, 2, 3
        // 'rest' is automatically an array of int[] inside here
        double sum = first;

        for (int value : rest) {
            sum = sum + value;  // sum += value
        }
        return sum / (rest.length + 1);
    }

    /*
     * Returns a random integer between 'min' and 'max' (inclusive).
     * TODO: implement this algorithm
     */
    public static int randomInt(int min, int max) {         // min: 5 and max: 16
        int result = 0;

        double random = Math.random();                      // 0.0000 to 0.9999
        double scaled = (random * (max - min + 1));         // 0.0000 to 11.9999
        double lifted = scaled + min;                       // 5.0000 to 16.9999
        result = (int) lifted;                              // Downcast now its 5 to 16

        return result;
    }

    /*
     * Returns a random integer between 1 and 'max' (inclusive)
     */

    public static int randomInt(int max) {
        return randomInt(1, max);  // delegate to "min-max" version, passing 1 and 'max'
    }

    /*
     * Returns a random integer between 1 and 11 (inclusive).
     *
     * HINT: see a class called Math (in package java.lang), look for a helpful method here.
     * NOTE: these methods are all "static," which means you call them as follows:
     *    Math.methodName()
     */
    public static int randomInt() {
        return randomInt(1, 11);
    }
}