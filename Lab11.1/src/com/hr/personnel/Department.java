/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 * <p>
 * Properties:
 * String name
 * String location
 * Employee[] employees the Employees in this department.
 * Int currentIndex internal counter for number of employees in the department.
 * <p>
 * Methods (excluding get/set methods):
 * void listEmployees() print info on all employees in the department.
 * Void workEmployees() make all employees in the department work.
 * String toString() self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    // this a 1-to-Many relationships
    private final Collection<Employee> employees = new ArrayList<>();

    // constructors
    public Department() {
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void workEmployees() {
        for (Employee employee : employees) {
            employee.work();
        }
    }

    public void payEmployees() {
        for (Employee employee : employees) {
            employee.pay();
        }
    }

    public void holidayBreak() {
        for (Employee employee : employees) {
            if (employee instanceof SalariedEmployee salariedEmployee) {
                salariedEmployee.takeVacation();
            }
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName() + ", location=" + getLocation();
    }
}