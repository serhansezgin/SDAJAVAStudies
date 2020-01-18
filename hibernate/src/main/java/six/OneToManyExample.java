package six;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class OneToManyExample {

    public static void main(String[] args) {
        //create();
        delete();
    }

    private static void create(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // create objects to insert into tables
        Item item1 = new Item("WSNMD67", 10.00, 2);
        Item item2 = new Item("XX7890", 45.00, 1);

        List<Item> items = new ArrayList();
        items.add(item1);
        items.add(item2);
        Double total = calculateBasket(items);

        Cart cart = new Cart("Feride's cart", total);

        // Bind the associations
        item1.setCart(cart);
        item2.setCart(cart);
        cart.setItems(items);

        session.save(cart);
        session.save(item1);
        session.save(item2);
        transaction.commit();

        System.out.println(cart);
        System.out.println(item1);
        System.out.println(item2);
    }

    private static Double calculateBasket(List<Item> items) {
        return items.stream().mapToDouble(item ->
                item.getPrice()* item.getQuantity()).sum();
    }

    private static void delete(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Cart cart = session.get(Cart.class, 126);
        for(Item item : cart.getItems()){
            session.delete(item);
        }
        session.delete(cart);

        transaction.commit();
    }


}
