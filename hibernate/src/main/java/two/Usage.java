package two;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

public class Usage {

    private static SessionFactory factory;

    public static SessionFactory getSessionFactory() {
        try {
            factory =  new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        return factory;
    }

    public static void listAddresses( ){
        Session session = getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            List addresses = session.createQuery("FROM Address").list();
            for (Iterator iterator = addresses.iterator(); iterator.hasNext();){
                Address address = (Address) iterator.next();
                System.out.println(address);
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void main(String[] args) {
        listAddresses();

    }
}
