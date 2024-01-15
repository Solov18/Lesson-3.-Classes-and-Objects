
// Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
// представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.

package org.example.Employee;
import java.util.Comparator;

public class Employee {
    private int year;
    private int month;
    private int day;

    // Конструктор

    public Employee(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    // Геттеры и сеттеры

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // Метод, сравнивающий две даты
    public static Comparator<Employee> dateComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee o1, Employee o2) {
            int result = Integer.compare(o1.year, o2.year);
            if (result != 0) {
                return result;
            }
            result = Integer.compare(o1.month,o2.month);
            if (result !=0){
                return result;
            }
            return Integer.compare(o1.day,o2.day);

        }
    };
}




