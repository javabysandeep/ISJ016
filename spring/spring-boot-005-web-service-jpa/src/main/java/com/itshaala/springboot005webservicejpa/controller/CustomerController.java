package com.itshaala.springboot005webservicejpa.controller;

import com.itshaala.springboot005webservicejpa.dto.CreateCustomerRequestDto;
import com.itshaala.springboot005webservicejpa.dto.CustomerDto;
import com.itshaala.springboot005webservicejpa.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @PostMapping
    ResponseEntity<CustomerDto> create(@RequestBody CreateCustomerRequestDto dto) {
        CustomerDto customerDto = customerService.create(dto);
        return ResponseEntity.ok(customerDto);
    }

    @PutMapping("/{id}")
    ResponseEntity<CustomerDto> update(@PathVariable("id") int id,
                                       @RequestBody CreateCustomerRequestDto dto) {
        CustomerDto customerDto = customerService.update(id, dto);
        return ResponseEntity.ok(customerDto);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") int id) {
        customerService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    CustomerDto findById(@PathVariable("id") int id) {
        return customerService.findById(id);
    }

    @GetMapping
    List<CustomerDto> getAll() {
        return customerService.findAll();
    }


}
