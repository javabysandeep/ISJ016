package com.itshaala;

import com.itshaala.model.ContractEmployee;
import com.itshaala.model.Employee;
import com.itshaala.model.FullTimeEmployee;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Rahul");

        FullTimeEmployee fte = new FullTimeEmployee();
        fte.setName("Nikita");
        fte.setSalary(5000);

        ContractEmployee c2h = new ContractEmployee();
        c2h.setName("Vaishnavi");
        c2h.setInvoiceAmount(25000);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(emp);
        session.persist(fte);
        session.persist(c2h);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Saved all three employees");
    }
}
