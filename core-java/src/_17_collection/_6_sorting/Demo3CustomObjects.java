package _17_collection._6_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo3CustomObjects {
    public static void main(String[] args) {
        //Step 01 : create list
        List<Employee> employeeList = new ArrayList<>();


        Employee employee1 = new Employee(101, "Suraj", 10000);
        Employee employee2 = new Employee(12, "Rahul", 12000);
        Employee employee3 = new Employee(23, "Komal", 9000);
        Employee employee4 = new Employee(45, "Shital", 15000);
        Employee employee5 = new Employee(47, "Rutuja", 1200);
        Employee employee6 = new Employee(102, "Vaishnawi", 9000);

        //step 02 : make the objects of type Comparable
        //step 03: add objects to list
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

        System.out.println("before sorting");
        employeeList.forEach(System.out::println);


        //step 04 : use sort method
        Collections.sort(employeeList);//list of elements of type Comparable

        System.out.println("After sorting");
        employeeList.forEach(System.out::println);


    }
}
