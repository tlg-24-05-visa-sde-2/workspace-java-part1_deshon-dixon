/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

/**
 * The Department class manages employees.
 * <p>
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees the Employees in this department.
 *   Int currentIndex internal counter for number of employees in the department.
 * <p>
 * Methods (excluding get/set methods):
 *   void listEmployees() print info on all employees in the department.
 *   Void workEmployees() make all employees in the department work.
 *   String toString() self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;

    // this a 1-to-Many relationships
    private final Employee[] employees = new Employee[100]; // 100 null slots because nothing has been added to array yet
    private int currentIndex = 0;  // for dealing with the array

    // constructors
    public Department() {
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?Null!
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(employees[i]);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].work();
        }
    }

    public void payEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].pay();
        }
    }
    
    public void holidayBreak() {
        for (int i = 0; i < currentIndex; i++) {
            if (employees[i] instanceof SalariedEmployee salariedEmployee) {
                salariedEmployee.takeVacation();
            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees[currentIndex++] = emp;
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