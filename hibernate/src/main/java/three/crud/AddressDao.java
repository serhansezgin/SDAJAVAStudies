package three.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;
import three.Address;
import three.HibernateUtil;

import java.util.List;

public class AddressDao {

    /**
     * Transaction
     *    - Allows the application to define units of work
     *    - A transaction is associated with a Session
     *    - A single session might contain multiple transactions
     *
     *
     * Session
     *    - Conversation between the application and the db
     *    - The main runtime interface between a Java application and Hibernate.
     *    - The lifecycle of a Session is bounded by the beginning and end of a logical transaction.
     *
     * SessionFactory
     *    - a thread-safe (and immutable)
     *    - It can have more than one session.
     *    - It is expensive to create
     *
     *
     */

    public void insertAddress(Address address) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // save the address object
            session.save(address);
            // commit transaction
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void updateAddress(Address address){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // update the address object
            session.update(address);
            // commit transaction
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void deleteAddress(Address address){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // delete the address object
            session.delete(address);
            // commit transaction
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public Address getAddress(int id){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Address address = session.find(Address.class, id);
            return address;
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    public List<Address> getAddresses() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            List<Address> addresses = session.createQuery("from Address", Address.class).list();
            return addresses;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }




}
