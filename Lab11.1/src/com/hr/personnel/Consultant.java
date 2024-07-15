package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class Consultant extends HourlyEmployee implements TaxPayer {

    @Override
    public void work() {
        System.out.println(getName() + " is working hard");
    }

    public Consultant() {
    }

    public Consultant(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Consultant(String name, LocalDate hireDate, double rate) {
        super(name, hireDate, rate);
    }

    public Consultant(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate, rate, hours);
    }


}