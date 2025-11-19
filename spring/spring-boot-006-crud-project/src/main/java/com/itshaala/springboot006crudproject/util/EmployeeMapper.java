package com.itshaala.springboot006crudproject.util;

import com.itshaala.springboot006crudproject.dto.EmployeeDto;
import com.itshaala.springboot006crudproject.entity.Employee;

public class EmployeeMapper {

    public static Employee getEmployee(EmployeeDto employeeDto) {
        return Employee.builder().id(employeeDto.getId()).name(employeeDto.getName()).salary(employeeDto.getSalary()).address(employeeDto.getAddress()).email(employeeDto.getEmail()).phone(employeeDto.getPhone()).build();
    }

    public static EmployeeDto getEmployeeDto(Employee employee) {
        return EmployeeDto.builder().id(employee.getId()).name(employee.getName()).address(employee.getAddress()).email(employee.getEmail()).phone(employee.getPhone()).salary(employee.getSalary()).build();
    }
}
