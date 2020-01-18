package eight.after;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ReservationTest {

    @Test
    public void goldCustomerCancellingMoreThan24HoursShouldCancel()
    {
        // Arrange
        Customer customer = createGoldCustomer();
        Date date = getDate(25);
        Reservation reservation = new Reservation(customer, date);

        // Act
        reservation.cancel();

        // Assert
        Assert.assertTrue(reservation.isCanceled);
    }

    @Test(expected = IllegalStateException.class)
    public void goldCustomerCancellingLessThan24HoursBeforeShouldThrowException()
    {
        Customer customer = createGoldCustomer();
        Date date = getDate(23);
        Reservation reservation = new Reservation(customer, date);

        reservation.cancel();
    }


    @Test(expected = IllegalStateException.class)
    public void goldCustomerCancellingAfterStartDateShouldThrowException()
    {
        Customer customer = createGoldCustomer();
        Date date = getDate(-1);
        Reservation reservation = new Reservation(customer, date);

        reservation.cancel();
    }

    @Test
    public void regularCustomerCancellingMoreThan48HoursBeforeShouldCancel()
    {
        Customer customer = createRegularCustomer();
        Date date = getDate(49);
        Reservation reservation = new Reservation(customer, date);

        reservation.cancel();

        // Assert
        Assert.assertTrue(reservation.isCanceled);
    }

    @Test(expected = IllegalStateException.class)
    public void RegularCustomer_CancellingLessThan48Hours_ShouldThrowException()
    {
        Customer customer = createRegularCustomer();
        Date date = getDate(47);
        Reservation reservation = new Reservation(customer, date);

        reservation.cancel();
    }

    @Test(expected = IllegalStateException.class)
    public void RegularCustomer_CancellingAfterStartDate_ShouldThrowException()
    {
        Customer customer = createRegularCustomer();
        Date date = getDate(-1);
        Reservation reservation = new Reservation(customer, date);

        reservation.cancel();
    }

    private Date getDate(int i) {
        LocalDate localDate = LocalDate.now().plusDays(i);
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    private static Customer createGoldCustomer()
    {
        Customer customer = new Customer();
        customer.loyaltyPoints = 200;
        return customer;
    }

    private static Customer createRegularCustomer()
    {
        return new Customer();
    }

}