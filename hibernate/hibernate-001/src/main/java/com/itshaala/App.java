package com.itshaala;

import com.itshaala.controller.StudentController;
import com.itshaala.model.Student;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("rahul");
        student.setEmail("rahul@gmail.com");
        student.setPhone("1234567890");

        StudentController studentController = new StudentController();
        studentController.createStudent(student);

    }
}
