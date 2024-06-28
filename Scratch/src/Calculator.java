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
    int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    /*
     * Returns a random integer between 1 and 11 (inclusive).
     *
     * HINT: see a class called Math (in package java.lang), look for a helpful method here.
     * NOTE: these methods are all "static," which means you call them as follows:
     *    Math.methodName()
     */

    int randomInt() {
        int result = 0;
        double random = Math.random();
        double scaled = (int) (random * 11) + 1;
        result = (int) scaled;   // explicit downcast from double to int
        return result;
    }


}