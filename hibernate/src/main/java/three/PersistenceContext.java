package three;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersistenceContext {

    /**
     * https://docs.jboss.org/hibernate/core/4.0/devguide/en-US/html/ch03.html
     * https://hibernate.org/orm/documentation/5.0/
     *
     * Both
     *      the org.hibernate.Session API
     *      javax.persistence.EntityManager API
     *
     * represent a context for dealing with persistent data.
     * This concept is called a persistence context.
     *
     * What does persistence mean ?
     *      stable, does not change, reliable, durable...
     *
     * Persistent data has some states. Hibernate framework provides the data
     * persistent in the application level and database level.
     *
     * In the application level, our POJO instances are created
     * and changed some states and whenever we close the session
     * or commit the operation, we see exactly the same change in db.
     *
     *      - new, or transient - the entity has just been instantiated
     *      and is not associated with a persistence context.It has no persistent
     *      representation in the database and no identifier value has been assigned.
     *
     *      - managed, or persistent - the entity has an associated identifier
     *      and is associated with a persistence context.
     *
     *      - detached - the entity has an associated identifier,
     *      but is no longer associated with a persistence context
     *      (usually because the persistence context was closed or
     *      the instance was evicted from the context)
     *
     *      - removed - the entity has an associated identifier and
     *      is associated with a persistence context,
     *      however it is scheduled for removal from the database.
     *
     */

    public static void main(String[] args) {
        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();

        // whenever we say new, it is a new state.
        Address address = new Address("test", 100, "test", "test");

        System.out.println("id of new instance will be zero" + address.getId());
        System.out.println("Because the state is new/transient");

        // whenever we associate a POJO with session, we persist the data in the app
        session.save(address);
        System.out.println("Now our state is persistent. We have identifier");
        System.out.println("id: " + address.getId());

        // Obtain an entity with its data initialized
        Address ad = session.get(Address.class, 19);
        System.out.println(ad);


        //Modifying managed/persistent state
        // any changes will be automatically detected
        // and it will be persisted when the persistence context is flushed
        address.setStreet("something else");

        session.flush();

        System.out.println(address);


        // refresh entity state
        session.refresh(ad);

        // Data can become detached in a number of ways
        // if the persistence context is closed
        // if persistence context is cleared
        // Detached data can still be manipulated
        // however the persistence context will
        // no longer automatically know about these modification

        // checking the persistent state

        assert session.contains( address );


        // deleting the entity
        //session.delete(address);

        transaction.commit();

    }

}
