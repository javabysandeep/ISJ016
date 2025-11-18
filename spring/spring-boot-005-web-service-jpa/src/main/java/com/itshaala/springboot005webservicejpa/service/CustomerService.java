package com.itshaala.springboot005webservicejpa.service;

import com.itshaala.springboot005webservicejpa.dto.CreateCustomerRequestDto;
import com.itshaala.springboot005webservicejpa.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    CustomerDto create(CreateCustomerRequestDto requestDto);
    CustomerDto update(int id, CreateCustomerRequestDto requestDto);
    void delete(int id);
    CustomerDto findById(int id);
    List<CustomerDto> findAll();
}
