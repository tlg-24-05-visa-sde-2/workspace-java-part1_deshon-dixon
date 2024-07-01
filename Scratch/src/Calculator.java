class Calculator {

    double add(double a, double b) {
        return (a + b);
    }

    double subtract(double a, double b) {
        return a - b;
    }

    boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns a random integer between 'min' and 'max' (inclusive).
     * TODO: implement this algorithm
     */
    int randomInt(int min, int max) { // Min = 5 and Max = 16
        int result = 0;

        double random = Math.random();                      // 0.0000 to 0.9999
        double scaled = (random * (max - min + 1)) + min;   // 0.0000 to 11.9999
        double lifted = scaled + min;                       // 5.0000 to 16.9999
        result = (int) lifted;                              // Downcast now its 5 to 16

        return result;
    }

    /*
     * Returns a random integer between 1 and 'max' (inclusive)
     */

    int randomInt(int max) {
        return randomInt(1, max);  // delegate to "min-max" version, passing 1 and 'max'
    }

    /*
     * Returns a random integer between 1 and 11 (inclusive).
     *
     * HINT: see a class called Math (in package java.lang), look for a helpful method here.
     * NOTE: these methods are all "static," which means you call them as follows:
     *    Math.methodName()
     */
    int randomInt() {
//        int result = 0;
//
//        double random = Math.random();
//        double scaled = (random * 11) + 1;
//        result = (int) scaled;   // explicit downcast from double to int
//
//        return result;
        return randomInt(1, 11);
    }
}