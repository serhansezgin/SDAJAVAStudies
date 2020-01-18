package thirteen.single.responsibility.principle.after;


public class SRPExample {

    /**
     * Problem:
     * Check if customer info's are relevant
     *    If not please throw Exception
     *    else please add customer entity to database
     *
     */
}

class Customer {
    public int id;
    public String name;
    public String surname;

    DatabaseContext databaseContext = new DatabaseContext();

    public int create(Customer customer)
    {
        if(customer.name==null || customer.name.isEmpty())
            throw new IllegalArgumentException
                    ("Customer name cannot be empty");

        if(customer.surname==null || customer.surname.isEmpty()){
            throw new IllegalArgumentException
                    ("Customer surname cannot be empty");
        }

        databaseContext.add(customer);
        databaseContext.saveChanges();
        return customer.id;
    }

}

//First Refactoring
class CustomerRepository
{
    DatabaseContext databaseContext = new DatabaseContext();

    public int create(Customer customer)
    {
        if(customer.name==null || customer.name.isEmpty())
            throw new IllegalArgumentException
                    ("Customer name cannot be empty");

        if(customer.surname==null || customer.surname.isEmpty())
            throw new IllegalArgumentException
                    ("Customer surname cannot be empty");


        databaseContext.add(customer);
        databaseContext.saveChanges();
        return customer.id;
    }
}

//Second Refactoring
class CustomerRepositoryRefactored{

    DatabaseContext databaseContext = new DatabaseContext();

    private static void validate(Customer customer)
    {
        if(customer.name==null || customer.name.isEmpty())
            throw new IllegalArgumentException("Customer name cannot be empty");

        if(customer.surname==null || customer.surname.isEmpty())
            throw new IllegalArgumentException("Customer surname cannot be empty");
    }
    private int create(Customer customer)
    {
        databaseContext.add(customer);
        databaseContext.saveChanges();
        return customer.id;
    }
    public int validateAndCreate(Customer customer)
    {
        validate(customer);
        return create(customer);
    }
}

class DatabaseContext{

    public void add(Customer customer) {
    }

    public void saveChanges() {
    }
}