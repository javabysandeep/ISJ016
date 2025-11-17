package com.itshaala.springboot001jdbc;

import com.itshaala.springboot001jdbc.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot001JdbcApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot001JdbcApplication.class, args);
        StudentController studentController = context.getBean(StudentController.class);
        System.out.println(studentController.getStudent(1));
    }

}
