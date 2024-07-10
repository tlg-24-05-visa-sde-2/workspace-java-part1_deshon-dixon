package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // PROPERTIES
    private double salary;

    // CONSTRUCTORS
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    // ACCESSOR METHODS
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "SalariedEmployee: " + "name=" + getName() + ", hireDate=" + getHireDate() + ", salary=" + getSalary();
    }
}