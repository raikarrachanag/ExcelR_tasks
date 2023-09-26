package com.excelr.assignment.java;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double salary;

    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeID + "\n" +
               "Name: " + name + "\n" +
               "Department: " + department + "\n" +
               "Salary: $" + salary;
    }
}

public class Assignment6 {
    private static Map<Integer, Employee> employees = new HashMap<>();
    private static int nextEmployeeID = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add new employee");
            System.out.println("2. Update employee details");
            System.out.println("3. Delete an employee");
            System.out.println("4. Display all employees");
            System.out.println("5. Search for an employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    updateEmployee(scanner);
                    break;
                case 3:
                    deleteEmployee(scanner);
                    break;
                case 4:
                    displayAllEmployees();
                    break;
                case 5:
                    searchEmployee(scanner);
                    break;
                case 6:
                    System.out.println("Exiting the Employee Management System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Employee employee = new Employee(nextEmployeeID, name, department, salary);
        employees.put(nextEmployeeID, employee);
        nextEmployeeID++;

        System.out.println("Employee added successfully. Employee ID: " + (nextEmployeeID - 1));
    }

    private static void updateEmployee(Scanner scanner) {
        System.out.print("Enter employee ID to update: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (employees.containsKey(employeeID)) {
            Employee employee = employees.get(employeeID);

            System.out.println("Current Employee Details:");
            System.out.println(employee);

            System.out.print("Enter new name (press Enter to keep current name): ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) {
                employee.setName(newName);
            }

            System.out.print("Enter new department (press Enter to keep current department): ");
            String newDepartment = scanner.nextLine();
            if (!newDepartment.isEmpty()) {
                employee.setDepartment(newDepartment);
            }

            System.out.print("Enter new salary (press Enter to keep current salary): ");
            String newSalaryStr = scanner.nextLine();
            if (!newSalaryStr.isEmpty()) {
                try {
                    double newSalary = Double.parseDouble(newSalaryStr);
                    employee.setSalary(newSalary);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid salary format. Salary not updated.");
                }
            }

            System.out.println("Employee details updated successfully.");
        } else {
            System.out.println("Employee not found with ID: " + employeeID);
        }
    }

    private static void deleteEmployee(Scanner scanner) {
        System.out.print("Enter employee ID to delete: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (employees.containsKey(employeeID)) {
            employees.remove(employeeID);
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found with ID: " + employeeID);
        }
    }

    private static void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("All Employees:");
            for (Employee employee : employees.values()) {
                System.out.println(employee);
                System.out.println("----------------------");
            }
        }
    }

    private static void searchEmployee(Scanner scanner) {
        System.out.print("Enter employee ID to search: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (employees.containsKey(employeeID)) {
            Employee employee = employees.get(employeeID);
            System.out.println("Employee Details:");
            System.out.println(employee);
        } else {
            System.out.println("Employee not found with ID: " + employeeID);
        }
    }
}
