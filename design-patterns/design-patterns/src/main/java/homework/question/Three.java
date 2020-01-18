package homework.question;

public class Three {

    /**
     *  we have a method calculates order price
     *  but it needs improvement!
     */

    public double calculatePrice(Order order){
        return order.quantity * order.itemPrice -
                Math.max(0, order.quantity - 500) * order.itemPrice * 0.05 +
                Math.min(order.quantity * order.itemPrice * 0.1, 100);
    }

}
class Order {
    public int quantity;
    public double itemPrice;
}