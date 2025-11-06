package com.itshaala.configuration;

import com.itshaala.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringConfiguration {

    @Bean(name = "employee")
    public Employee getEmployee() {
        return new Employee(1, "Rahul", 10000);
    }

}

