class CalculatorClient {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double sum = calc.add(1,3); // passing ints where doubles are expected (implicit upcast)
        System.out.println("\n" + "sum is: " + sum);

        System.out.println("difference is: " + calc.subtract(1.1,3.1)); // here we pass doubles

        System.out.println("2 is even? " + calc.isEven(2));
        System.out.println();

        System.out.println("Random number one: " + calc.randomNum1() + "\n" + "Random number two: " + calc.randomNum2());
    }
}