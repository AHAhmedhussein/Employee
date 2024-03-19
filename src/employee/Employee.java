/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author User
 */
public class Employee {
    private final String name;
    private final double hourlyWage;

    public Employee(String name, double hourlyWage) {
        this.name = name;
        this.hourlyWage = hourlyWage;
    }

    public double calculateWeeklySalary(double hoursWorked) {
        return hourlyWage * hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }
}

// Main class to demonstrate usage

/**
 *
 * @author User
 */

