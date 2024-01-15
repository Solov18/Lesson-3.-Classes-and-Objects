package org.example.Employee_task2;

public class Manager extends Employee2 {

    public Manager(String name, float salary) {
        super(name, salary);
    }
    public static void increaseSalary(Employee2[] employees, float percentage) {
        for (Employee2 employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(percentage);
            }
        }
    }
}

