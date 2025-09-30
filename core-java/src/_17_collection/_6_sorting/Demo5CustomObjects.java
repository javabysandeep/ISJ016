package _17_collection._6_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo5CustomObjects {
    public static void main(String[] args) {

        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
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
        // Comparator<Student> studentIdComparator =  (Student s1, Student s2)->s1.id-s2.id;
        Comparator<Student> studentNameComparator = (Student s1, Student s2) -> s1.name.compareTo(s2.name);
        Collections.sort(studentList, studentNameComparator);

        System.out.println("After sorting");
        studentList.forEach(System.out::println);


    }
}
