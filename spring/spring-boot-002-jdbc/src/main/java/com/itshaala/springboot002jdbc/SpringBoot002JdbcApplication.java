package com.itshaala.springboot002jdbc;

import com.itshaala.springboot002jdbc.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot002JdbcApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot002JdbcApplication.class, args);
        StudentController controller = context.getBean(StudentController.class);
        System.out.println(controller.getStudent(1));
    }

}
