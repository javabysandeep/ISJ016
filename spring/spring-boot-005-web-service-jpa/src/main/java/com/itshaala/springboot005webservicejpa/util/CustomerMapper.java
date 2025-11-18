package com.itshaala.springboot005webservicejpa.util;

import com.itshaala.springboot005webservicejpa.dto.CreateCustomerRequestDto;
import com.itshaala.springboot005webservicejpa.dto.CustomerDto;
import com.itshaala.springboot005webservicejpa.model.Customer;

public class CustomerMapper {

    public static Customer getCustomer(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        return customer;
    }

    public static Customer getCustomer(CreateCustomerRequestDto dto) {
        Customer customer = new Customer();
        customer.setName(dto.getName());
        customer.setEmail(dto.getEmail());
        customer.setPhone(dto.getPhone());
        return customer;
    }

    public static CustomerDto getCustomerDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        return customerDto;
    }
}
