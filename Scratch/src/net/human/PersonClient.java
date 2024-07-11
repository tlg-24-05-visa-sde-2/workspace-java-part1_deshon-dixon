package net.human;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Fred", LocalDate.of(2000, 1, 1));
        PersonRecord p2 = new PersonRecord("Jane", LocalDate.of(1999, 8, 12));

        // print the following: <name> is <age> years old
        System.out.printf("%s is %s years old\n", p1.name(), p1.age());
        System.out.printf("%s is %s years old\n", p2.name(), p2.age());

        System.out.println(p1);
        System.out.println(p2);
    }

}