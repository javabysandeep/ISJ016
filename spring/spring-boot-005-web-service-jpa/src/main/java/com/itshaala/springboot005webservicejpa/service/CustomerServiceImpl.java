package com.itshaala.springboot005webservicejpa.service;

import com.itshaala.springboot005webservicejpa.dao.CustomerRepository;
import com.itshaala.springboot005webservicejpa.dto.CreateCustomerRequestDto;
import com.itshaala.springboot005webservicejpa.dto.CustomerDto;
import com.itshaala.springboot005webservicejpa.model.Customer;
import com.itshaala.springboot005webservicejpa.util.CustomerMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDto create(CreateCustomerRequestDto requestDto) {
        Customer savedCustomerObject = customerRepository.save(CustomerMapper.getCustomer(requestDto));
        return CustomerMapper.getCustomerDto(savedCustomerObject);
    }

    @Override
    public CustomerDto update(int id, CreateCustomerRequestDto requestDto) {
        Customer savedCustomerObject = customerRepository.findById(id).get();

        savedCustomerObject.setName(requestDto.getName());
        savedCustomerObject.setEmail(requestDto.getEmail());
        savedCustomerObject.setPhone(requestDto.getPhone());

        Customer updatedCustomerObject = customerRepository.save(savedCustomerObject);
        return CustomerMapper.getCustomerDto(updatedCustomerObject);
    }

    @Override
    public void delete(int id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
        }
    }

    @Override
    public CustomerDto findById(int id) {
        Customer customer = customerRepository.findById(id).get();
        return CustomerMapper.getCustomerDto(customer);
    }

    @Override
    public List<CustomerDto> findAll() {
        List<Customer> customerList = customerRepository.findAll();
        List<CustomerDto> customerDtoList = new ArrayList<>();
        for (Customer customer : customerList) {
            customerDtoList.add(CustomerMapper.getCustomerDto(customer));
        }
        return customerDtoList;
    }
}
