package com.itshaala.springboot006crudproject.service;

import com.itshaala.springboot006crudproject.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto create(EmployeeDto employeeDto);

    EmployeeDto update(EmployeeDto employeeDto);

    void delete(int id);

    EmployeeDto getById(int id);

    List<EmployeeDto> getAll();
}
