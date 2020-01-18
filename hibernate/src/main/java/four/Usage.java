package four;

import java.sql.Timestamp;
import java.util.Date;

public class Usage {

    public static void main(String[] args) throws InterruptedException {

        CustomerDao customerDao = new CustomerDao();
        Customer customer = new Customer("Feride", new Timestamp(System.currentTimeMillis()));
        customerDao.createAddress(customer);

        Thread.sleep(20000L);

        customer.setName("Test");
        customerDao.updateCustomer(customer);

    }
}
