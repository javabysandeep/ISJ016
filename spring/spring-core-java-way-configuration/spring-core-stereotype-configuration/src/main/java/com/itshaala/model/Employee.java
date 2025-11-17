package com.itshaala.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
@Scope("prototype")
@PropertySource("classpath*:application.properties")
public class Employee {
    //@Value("100")
    @Value("${employee.id}")
    private int id;

    //@Value("Rahul")
    @Value("${employee.name}")
    private String name;

    //@Value("200000")
    @Value("${employee.salary}")
    private double salary;
}
