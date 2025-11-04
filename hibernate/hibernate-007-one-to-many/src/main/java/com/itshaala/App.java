package com.itshaala;


import com.itshaala.model.Address;
import com.itshaala.model.Employee;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Address address1 = new Address();
        address1.setStreet("pashan road");
        address1.setCity("Pune");
        address1.setState("MH");
        address1.setCountry("India");
        address1.setPincode("411005");

        Address address2 = new Address();
        address2.setStreet("Baner road");
        address2.setCity("Pune");
        address2.setState("MH");
        address2.setCountry("India");
        address2.setPincode("411005");


        Employee employee = new Employee();
        employee.setName("Rahul");
        employee.setSalary(10000);
        employee.getAddresses().add(address1);
        employee.getAddresses().add(address2);

        session.persist(address1);
        session.persist(address2);
        session.persist(employee);

        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Employee saved successfully");
    }
}
