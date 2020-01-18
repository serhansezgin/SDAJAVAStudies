package homework.answer;

public class Three {

    /**
     * So we extracted variables here. Why?
     * Because there are a few calculations happening that we have no idea what they mean?
     * This approach is opposite to inline.
     *
     */


    public double calculatePrice(Order order) {
        double basePrice = order.quantity * order.itemPrice;
        double quantityDiscount = Math.max(0, order.quantity - 500) * order.itemPrice * 0.05;
        double shipping = Math.min(basePrice * 0.1, 100);
        return basePrice - quantityDiscount + shipping;
    }


    /**
     * inline
     */

    public boolean isBasePrice(Order order){
        double basePrice = order.basePrice;
        return (basePrice > 1000);
    }

    /**
     * after inline
     */
    public boolean isBasePriceInlined(Order order){
        return order.basePrice > 1000;
    }
}
class Order {
    public int quantity;
    public double itemPrice;
    public double basePrice;
}
