package five;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class OneToOneExample {

    public static void main(String[] args) {

        //insert();
        delete();

    }

    private static void insert(){
        // Hibernate preparation....
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // my records that I will insert into my tables
        PostDetails postDetails = new PostDetails("Feride");
        Post post = new Post("Time Travels In Space", postDetails);

        postDetails.setPost(post);
        post.setDetails(postDetails);

        System.out.println(post);
        System.out.println(postDetails);

        session.save(post);
        session.save(postDetails);

        transaction.commit();

        System.out.println(post);
        System.out.println(postDetails);
    }

    private static void delete(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Post post = session.get(Post.class, 124);

        session.delete(post);
        session.delete(post.getDetails());

        transaction.commit();
    }
}
