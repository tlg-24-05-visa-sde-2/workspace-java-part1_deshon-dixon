package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {
    public static final double DEFAULT_STANDARD_DEDUCTION = 500_000;

    // METHODS
    @Override
    public void work() {
        System.out.println(getName() + " is enjoying a nice round of golf.");
    }

    @Override  // interface Taxpayer (default method)
    public void fileReturn() {
        System.out.println("Return filed electronically.");
    }

    @Override
    public double getStandardDeduction() {
        return DEFAULT_STANDARD_DEDUCTION;
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