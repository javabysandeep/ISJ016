package com.itshaala;


import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DeleteHQL {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "delete from Course where id = :id";

        Query query = session.createQuery(hql);
        query.setParameter("id", 2);

        query.executeUpdate();
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Successfully deleted");
    }
}
