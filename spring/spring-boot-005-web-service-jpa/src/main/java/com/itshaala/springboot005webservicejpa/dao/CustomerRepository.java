package com.itshaala.springboot005webservicejpa.dao;

import com.itshaala.springboot005webservicejpa.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
