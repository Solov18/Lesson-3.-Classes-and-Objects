package org.example.Employee_task2;

public class Employee2 {
    private String name;
    private float salary;

    public Employee2(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public void increaseSalary(float percentage) {
        salary += salary * percentage / 100;
    }
}

