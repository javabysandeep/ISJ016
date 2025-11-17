package com.itshaala;

import com.itshaala.configuration.SpringConfiguration;
import com.itshaala.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowirdeDemo {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
       StudentController studentController = context.getBean(StudentController.class);
       studentController.addStudent();
    }
}
