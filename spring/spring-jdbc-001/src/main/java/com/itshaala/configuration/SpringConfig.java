package com.itshaala.configuration;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
@PropertySource("classpath*:application.properties")
@AllArgsConstructor
public class SpringConfig {

    Environment environment;

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("mysql.db.driver"));
        dataSource.setUrl(environment.getProperty("mysql.db.url"));
        dataSource.setUsername(environment.getProperty("mysql.db.username"));
        dataSource.setPassword(environment.getProperty("mysql.db.password"));
        return dataSource;
    }

}
