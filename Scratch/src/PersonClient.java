import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Fred", LocalDate.of(2000, 1, 1));

        System.out.println(p1);
    }

}