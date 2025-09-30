package _17_collection._1_arrayListDemos;

import java.util.ArrayList;
import java.util.List;

public class Demo9CustomObjects {
    public static void main(String[] args) {
        //using generic we have specified to have the list of only employee objects
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee(101, "Suraj", 10000);
        Employee employee2 = new Employee(12, "Rahul", 12000);
        Employee employee3 = new Employee(23, "Komal", 9000);
        Employee employee4 = new Employee(45, "Shital", 15000);
        Employee employee5 = new Employee(47, "Rutuja", 1200);
        Employee employee6 = new Employee(102, "Vaishnawi", 9000);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

        employeeList.forEach(System.out::println);


    }
}
