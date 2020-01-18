package eight.after;

import java.util.Date;

public class NestedConditional {

    /**
     * We just don't do refactor right away!
     *
     * It is very dangerous!
     *
     * We write tests then we refactor
     *
     */
}

class Customer {
    public int loyaltyPoints;
}

class Reservation {
    public Date from;
    public Customer customer;
    public boolean isCanceled;

    public Reservation(Customer customer, Date date) {
        this.from = date;
        this.customer = customer;
    }

    public void cancel() {

        Date now = new Date();
        // If reservation already started throw exception
        if (now.after(from)) {
            throw new IllegalStateException("It's too late to cancel.");
        }
        long elapsedHours = getElapsedHours(now);

        // Gold customers can cancel up to 24 hours before
        if (isGoldCustomer()) {
            //cancellation period is over for gold customers

            if (isLessThan(elapsedHours, 24)) {
                throw new IllegalStateException("It's too late to cancel.");
            }
        } else {
            //cancellation period is over for regular customers

            if (isLessThan(elapsedHours, 48)) {
                throw new IllegalStateException("It's too late to cancel.");
            }
        }
        isCanceled = true;
    }

    private boolean isLessThan(long elapsedHours, int maxHours) {
        return elapsedHours < maxHours;
    }

    private long getElapsedHours(Date now) {
        //calculate elapsed hours
        long different = from.getTime() - now.getTime();
        long hoursInMilli = 60 * 60 * 1000 * 24;
        return different / hoursInMilli;
    }

    private boolean isGoldCustomer() {
        return customer.loyaltyPoints > 100;
    }
}