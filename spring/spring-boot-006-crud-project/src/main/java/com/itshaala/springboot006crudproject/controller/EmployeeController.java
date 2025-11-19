package com.itshaala.springboot006crudproject.controller;

import com.itshaala.springboot006crudproject.dto.EmployeeDto;
import com.itshaala.springboot006crudproject.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping
    ResponseEntity<EmployeeDto> create(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployeeDto = employeeService.create(employeeDto);
        //01. status code
        //02. response body
        //03. location of created resource
        return ResponseEntity.created(URI.create("/api/employees/" + savedEmployeeDto.getId())).body(savedEmployeeDto);
    }

    @PutMapping
    ResponseEntity<EmployeeDto> update(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto updatedEmployeeDto = employeeService.update(employeeDto);
        return ResponseEntity.ok(updatedEmployeeDto);
    }

    @GetMapping("/{id}")
    ResponseEntity<EmployeeDto> getById(@PathVariable("id") int id) {
        EmployeeDto employeeDto = employeeService.getById(id);
        return ResponseEntity.ok(employeeDto);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteById(@PathVariable("id") int id) {
        employeeService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    ResponseEntity<List<EmployeeDto>> getAll() {
        List<EmployeeDto> employees = employeeService.getAll();
        return ResponseEntity.ok(employees);
    }
}
