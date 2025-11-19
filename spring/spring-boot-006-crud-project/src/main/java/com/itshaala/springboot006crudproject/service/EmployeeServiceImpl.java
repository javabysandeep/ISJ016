package com.itshaala.springboot006crudproject.service;

import com.itshaala.springboot006crudproject.dto.EmployeeDto;
import com.itshaala.springboot006crudproject.entity.Employee;
import com.itshaala.springboot006crudproject.exception.ResourceNotFoundException;
import com.itshaala.springboot006crudproject.repository.EmployeeRepository;
import com.itshaala.springboot006crudproject.util.EmployeeMapper;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto create(EmployeeDto employeeDto) {
        Employee entity = EmployeeMapper.getEmployee(employeeDto);
        Employee savedEntity = employeeRepository.save(entity);
        EmployeeDto savedEmployeeDto = EmployeeMapper.getEmployeeDto(savedEntity);
        return savedEmployeeDto;
    }

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {
        if (!employeeRepository.existsById(employeeDto.getId())) {
            throw new ResourceNotFoundException("Employee does not exist");
        }
        Employee updatedEmployeeEntity = employeeRepository.save(EmployeeMapper.getEmployee(employeeDto));
        return EmployeeMapper.getEmployeeDto(updatedEmployeeEntity);
    }

    @Override
    public void delete(int id) {
        if (!employeeRepository.existsById(id)) {
            throw new ResourceNotFoundException("Employee does not exist");
        }
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeDto getById(int id) {
        Employee employeeEntity = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee does not exist"));
        return EmployeeMapper.getEmployeeDto(employeeEntity);
    }

    @Override
    public List<EmployeeDto> getAll() {
        List<Employee> employeeEntityList = employeeRepository.findAll();
        return employeeEntityList.stream()
                .map(EmployeeMapper::getEmployeeDto).collect(Collectors.toList());

    }
}
