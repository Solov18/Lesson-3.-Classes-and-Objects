package org.example;


import org.example.Employee_task2.Employee2;
import org.example.Employee_task2.Manager;

public class Main {
    public static void main(String[] args) {
        Employee2 e1 = new Manager("Евгений", 5000);
        Employee2 e2 = new Employee2("Александр", 3000);
        Employee2 e3 = new Employee2("Роман", 4000);

        Employee2[] employees = {e1, e2, e3};

        Manager.increaseSalary(employees, 10);

        for (Employee2 employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }


}

