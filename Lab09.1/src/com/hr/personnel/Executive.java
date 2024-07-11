package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    // METHODS
    @Override
    public void work() {
        System.out.println(getName() + " is enjoying a nice round of golf.");
    }

    // CONSTRUCTORS
    public Executive() {
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }
}