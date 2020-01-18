package eight.before;

import java.util.Date;

public class NestedConditional {

    /**
     *   Problem:
     *   Implement a cancel operation in reservation system.
     *
     *   If a customer has more than 100 loyalty points, customer is a gold customer
     *
     *   Gold customer can cancel reservation up to 24 hours before
     *
     *   Regular customer can cancel reservation up to 48 hours before
     */
}

class Customer{
    public int loyaltyPoints;
}

class Reservation {
    public Date from;
    public Customer customer;
    public boolean isCanceled;

    public Reservation(Customer customer, Date date)
    {
        this.from = date;
        this.customer = customer;
    }
    public void cancel()
    {
        if (customer.loyaltyPoints > 100)
        {
            // Gold customers can cancel up to 24 hours before
            Date now = new Date();
            // If reservation already started throw exception
            if (now.after(from)) {
                throw new IllegalStateException("It's too late to cancel.");
            }
            //milliseconds
            long different = now.getTime() - from.getTime();
            long hoursInMilli = 60 * 60 * 1000 * 24;
            long elapsedHours = different / hoursInMilli;

            if (elapsedHours < 24) {
                throw new IllegalStateException("It's too late to cancel.");
            }

            isCanceled = true;
        }
        else
        {
            // Regular customers can cancel up to 48 hours before
            Date now = new Date();
            // If reservation already started throw exception
            if (now.after(from)) {
                throw new IllegalStateException("It's too late to cancel.");
            }
            //milliseconds
            long different = now.getTime() - from.getTime();
            long hoursInMilli = 60 * 60 * 1000 * 24;
            long elapsedHours = different / hoursInMilli;


            if (elapsedHours < 48) {
                throw new IllegalStateException("It's too late to cancel.");
            }

            isCanceled = true;
        }

    }
}