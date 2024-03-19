/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

import static java.time.Clock.system;
import static java.time.InstantSource.system;

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

private void HelloWorld() {
  system.out,printIn("HelloWorld")
}


// Main class to demonstrate usage

/**
 *
 * @author User
 */

