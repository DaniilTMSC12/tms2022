package com.tms.report;

public class EmployeeReport implements Report {
    @Override
    public void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("| %-20s|%15.2f|%n", employee.getFullname(), employee.getSalary());
        }
    }
}
