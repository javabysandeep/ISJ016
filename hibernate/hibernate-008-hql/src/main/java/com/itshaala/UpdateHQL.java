package com.itshaala;


import com.itshaala.model.Course;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class UpdateHQL {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update Course c set c.name = :name, c.duration =:duration, c.price =:price where c.id = :id";

        Query query = session.createQuery(hql);

        query.setParameter("name", "FSJ");
        query.setParameter("duration", "10 months");
        query.setParameter("price", "10000");
        query.setParameter("id", 1);

        query.executeUpdate();
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Successfully updated");
    }
}
