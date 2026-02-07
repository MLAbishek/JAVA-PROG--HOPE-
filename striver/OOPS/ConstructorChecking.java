package striver.OOPS;

import java.util.*;

class Employee {
    public String employeeName; // To store the name of the employee
    public int salary; // To store the salary of the employee

    // Parameterized constructor
    public Employee(String name, int salary) {
        this.employeeName = name;
        this.salary = salary;
    }
}

// Main Class
public class ConstructorChecking {
    public static void main(String[] args) {
        /*
         * Creating an object of Employee class and passing
         * values for the parameterized constructor
         */
        Employee obj = new Employee("abi", 10000);

        // Output
        System.out.println("The salary of employee named " +
                obj.employeeName + " is " + obj.salary);
    }
}
