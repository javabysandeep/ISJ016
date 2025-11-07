package com.itshaala;

import com.itshaala.configuration.SpringConfig;
import com.itshaala.controller.StudentController;
import com.itshaala.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentController studentController = context.getBean(StudentController.class);
        Student student = new Student(2, "Vaishnavi k", "vaishnavi@gmail.com", "123455");
        System.out.println(studentController.getStudent(1));

    }
}
