/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp;

import gov.irs.TaxPayer;
import org.w3c.dom.ls.LSOutput;

/**
 * Corporate entity - also pays taxes.
 */
public class Corporation implements TaxPayer {
    public static final double DEFAULT_STANDARD_DEDUCTION = 1_000_000;

    private String name;

    public Corporation(String name) {
        setName(name);
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        System.out.println(getName() + " paid no taxes - we lobbied hard and it worked");
    }

    // I "opt-in" to provide a custom implementation of this contract method.
    @Override
    public void fileReturn() {
        System.out.println(getName() + " filed no return - we sent our lawyers instead.");
    }

    @Override
    public double getStandardDeduction() {
        return DEFAULT_STANDARD_DEDUCTION;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}