package com.itshaala;


import com.itshaala.model.Course;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class SelectHql {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        List<Course> list = session.createQuery("from Course").list();
        list.forEach(System.out::println);

        session.close();
        sessionFactory.close();
    }
}
