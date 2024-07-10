package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // PROPERTIES
    private double rate;
    private double hours;

    // CONSTRUCTORS
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate) {
        this(name, hireDate);
        setRate(rate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate, rate);
        setHours(hours);
    }

    // ACCESSOR METHODS
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String toString() {
        return "HourlyEmployee: " + "name=" + getName() + ", hireDate=" + getHireDate() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}