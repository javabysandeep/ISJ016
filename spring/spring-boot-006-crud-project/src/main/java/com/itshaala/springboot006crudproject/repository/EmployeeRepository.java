package com.itshaala.springboot006crudproject.repository;

import com.itshaala.springboot006crudproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
