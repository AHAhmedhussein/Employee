/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Create an employee object
        Employee employee = new Employee("John Doe", 15.50);

        // Calculate weekly salary for different hours worked
        double hoursWorked1 = 40;
         double hoursWorked2 = 50;

        // Print the output to the console
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Hourly Wage: $" + employee.getHourlyWage());
        System.out.println("Weekly Salary for 40 hours: $" + employee.calculateWeeklySalary(hoursWorked1));
        System.out.println("Weekly Salary for 50 hours: $" + employee.calculateWeeklySalary(hoursWorked2));
    }
}
