import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 29;
        ages[1] = 25;
        ages[2] = 30;
        ages[3] = 40;
        System.out.println(Arrays.toString(ages));
        System.out.println();

        double[] temps = { 82.3, 97.2, 130.2, 95.0, 86.0 };
        System.out.println(Arrays.toString(temps));

        for (double temp : temps) {
            System.out.println("The temperature is: " + temp);
        }
        System.out.println();

        String[] cities = { "Seattle", "Washington DC", "Austin", "Atlanta" };
        System.out.println("There are " + cities.length + " cities in the array.");
        System.out.println(Arrays.toString(cities));

        for (String city : cities) {
            System.out.println("I live in " + city);
        }
        System.out.println();

        for (int i = 0; i < cities.length; i++) {
            System.out.println("I live in " + cities[i]);
        }

    }
}