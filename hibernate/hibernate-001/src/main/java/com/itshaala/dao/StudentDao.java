package com.itshaala.dao;

import com.itshaala.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao {

    /*
     *  use hibernate at dao layer instead of jdbc
     *
     *   *************** jdbc drawbacks *************************
     *   01. create and close the connection
     *   02. create statement object
     *   03. create the query
     *   04. setting the values inside the parameterized query
     *   05. executing the query
     *   06. exception handling
     *   07. Object to row and row to object mapping
     *
     *
     * */

    public void createStudent(Student student) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();
        session.close();
        System.out.println("Student record saved successfully.");
    }

    public void updateStudent(Student student) {
    }

    public void deleteStudent(Student student) {
    }

    public Student getStudentById(int id) {
        return null;
    }
}
