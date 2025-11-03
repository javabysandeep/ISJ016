package com.itshaala.dao;

import com.itshaala.model.Course;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CourseDao {
    public void addCourse(Course course) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();//---for dml queries
        session.persist(course);
        tx.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Course added successfully");
    }

    public void updateCourse(Course course) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.merge(course);
        tx.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Course updated successfully");
    }

    public void deleteCourse(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Course course = session.find(Course.class, id);
        session.remove(course);
        tx.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Course deleted successfully");
    }

    public Course getCourse(int id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Course course = session.find(Course.class, id);
        session.close();
        sf.close();
        return course;
    }
}
