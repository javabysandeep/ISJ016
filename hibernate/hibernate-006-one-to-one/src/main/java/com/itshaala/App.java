package com.itshaala;


import com.itshaala.model.Address;
import com.itshaala.model.Employee;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Address address = new Address();
        address.setStreet("pashan road");
        address.setCity("Pune");
        address.setState("MH");
        address.setCountry("India");
        address.setPincode("411005");

        Employee employee = new Employee();
        employee.setName("Rahul");
        employee.setSalary(10000);
        employee.setAddress(address);

        session.persist(address);
        session.persist(employee);

        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Employee saved successfully");
    }
}
