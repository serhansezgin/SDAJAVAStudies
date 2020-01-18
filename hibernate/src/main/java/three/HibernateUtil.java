package three;

import four.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {

    /**
     * This is other way to connect to the db via Hibernate
     *
     * Our main classes are Configuration and Properties
     *
     * The common thing in both method is SessionFactory
     *
     * We use SessionFactory object to operate our queries on tables
     *
     */

    private static SessionFactory factory;

    public static SessionFactory getSessionFactory() {
        try {
            Configuration configuration = new Configuration();

            // Hibernate settings equivalent to hibernate.cfg.xml's properties
            Properties settings = new Properties();
            settings.put(Environment.DRIVER, "org.h2.Driver");
            settings.put(Environment.URL, "jdbc:h2:tcp://localhost/~/test");
            settings.put(Environment.USER, "sa");
            settings.put(Environment.PASS, "");
            settings.put(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");
            settings.put(Environment.SHOW_SQL, "true");
            settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            //settings.put(Environment.HBM2DDL_AUTO, "create-drop");
            configuration.setProperties(settings);
            configuration.addAnnotatedClass(Address.class);
            configuration.addAnnotatedClass(Customer.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            factory = configuration.buildSessionFactory(serviceRegistry);

        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        return factory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }

}
