import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Fred", LocalDate.of(2000, 1, 1));

        // print the following: <name> is <age> years old

        System.out.println(p1.name() + " is " + p1.age() + " years old");

        System.out.println(p1);
    }

}