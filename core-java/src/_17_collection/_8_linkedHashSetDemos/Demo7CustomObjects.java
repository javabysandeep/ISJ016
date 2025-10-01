package _17_collection._8_linkedHashSetDemos;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo7CustomObjects {
    public static void main(String[] args) {
        //using generic we have specified to have the list of only employee objects
        Set<Employee> employeeSet = new LinkedHashSet<>();

        Employee employee1 = new Employee(101, "Suraj", 10000);
        Employee employee2 = new Employee(12, "Rahul", 12000);
        Employee employee3 = new Employee(23, "Komal", 9000);
        Employee employee4 = new Employee(45, "Shital", 15000);
        Employee employee5 = new Employee(47, "Rutuja", 1200);
        Employee employee6 = new Employee(102, "Vaishnawi", 9000);

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        employeeSet.add(employee6);

        employeeSet.forEach(System.out::println);


    }
}
