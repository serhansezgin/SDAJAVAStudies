package eight;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class HQLJPQL {
    /**
     *
     * The HibernateQuery Language and Java PersistenceQuery Language
     * are both object model focused query languages similar in nature to SQL.
     *
     * A JPQL query is always a valid HQL query,
     *                the reverse is not true however.
     *
     *
     *
     */

    public static void main(String[] args) {

        create();
        getPeople();
        getPersonByMobile();
        getPersonByLandLine();
    }

    public static void create(){

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();


        Person person1 = new Person("Henry", "Jack", "henry.jack@dayrep.com", "United States");
        Phone phone11 = new Phone("111-222-333", PhoneType.MOBILE, person1);
        Phone phone12 = new Phone("23-332-222-33", PhoneType.LAND_LINE, person1);


        Person person2 = new Person("Nicoletta", "Jean", "nicoletta.jean@dayrep.com", "United States");
        Phone phone21 = new Phone("222-333-444", PhoneType.MOBILE, person2);
        Phone phone22 = new Phone("32-422-421-64", PhoneType.LAND_LINE, person2);

        Person person3 = new Person("Toya", "Juarez", "toya.juarez@dayrep.com", "United States");
        Phone phone3 = new Phone("333-444-555", PhoneType.MOBILE, person3);

        Person person4 = new Person("Damian", "Leitch", "damian.leitch@dayrep.com", "United States");

        session.save(person1);
        session.save(phone11);
        session.save(phone12);

        session.save(person2);
        session.save(phone21);
        session.save(phone22);

        session.save(person3);
        session.save(phone3);
        session.save(person4);


        transaction.commit();
    }

    public  static void getPeople(){
        System.out.println("Listing people");
        System.out.println("-----------------------------------");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query1 = session.createQuery("from Person", Person.class);
        List<Person> personList1 = query1.list();
        for(Person person : personList1){
            System.out.println(person.toString());
        }
        System.out.println("-----------------------------------");


        Query query2 = session.createNamedQuery("get_person_by_name", Person.class);
        query2 = query2.setParameter("name", "J%");
        List<Person> personList2 = query2.list();
        for(Person person : personList2){
            System.out.println(person.toString());
        }
        System.out.println("-----------------------------------");


    }

    private static void getPersonByMobile(){
        System.out.println("Get Person By Mobile");
        System.out.println("-----------------------------------");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query3 = session.createNamedQuery("get_person_by_mobile", Person.class);
        query3 = query3.setParameter("phoneType", PhoneType.MOBILE);
        List<Person> personList3 = query3.list();
        for(Person person : personList3){
            System.out.println(person.toString());
        }
        System.out.println("-----------------------------------");


    }

    private static void getPersonByLandLine(){
        System.out.println("Get Person By Land Line");
        System.out.println("-----------------------------------");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query4 = session.createNamedQuery("get_person_by_land_line", Person.class);
        query4 = query4.setParameter("phoneType", PhoneType.LAND_LINE);
        List<Person> personList4 = query4.list();
        for(Person person : personList4){
            System.out.println(person.toString());
        }
        System.out.println("-----------------------------------");

    }



}
