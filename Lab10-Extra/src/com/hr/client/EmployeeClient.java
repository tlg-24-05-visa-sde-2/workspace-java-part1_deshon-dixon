package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient {

    public static void main(String[] args) {

        Employee employee = new Employee("DeShon");
        try {
            employee.goToWork();
        } catch (WorkException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}