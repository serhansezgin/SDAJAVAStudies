package seven;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class ManyToManyExample {

    /**
     *
     * Employee and Project has bidirectional association.
     *
     */

    public static void main(String[] args) {
        create();
    }


    private static void create() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // creating objects
        Set<Project> projects = new HashSet<>();
        projects.add(new Project("IT Project"));
        projects.add(new Project("Networking Project"));
        projects.add(new Project("Hr Project"));


        Employee emp1 = new Employee("Max", projects);
        Employee emp2 = new Employee("Allan", projects);

        // saving
        session.save(emp1);
        session.save(emp2);
        transaction.commit();
    }
}
