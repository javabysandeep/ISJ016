package _17_collection._6_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo4CustomObjects {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student(101, "Suraj");
        Student student2 = new Student(12, "Rahul");
        Student student3 = new Student(1, "Vishnu");
        Student student4 = new Student(5, "Altaf");
        Student student5 = new Student(7, "Baba");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        System.out.println("before sorting");
        studentList.forEach(System.out::println);


        //step 04 : use sort method
        Collections.sort(studentList);

        System.out.println("After sorting");
        studentList.forEach(System.out::println);


    }
}
