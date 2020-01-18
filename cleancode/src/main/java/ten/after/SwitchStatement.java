package ten.after;

public class SwitchStatement {
    public static void main(String[] args) {
    }
}

abstract class Customer{
    public CustomerType type;
    public abstract MonthlyStatement generateStatement(MonthlyUsage usage);
}

enum CustomerType
{
    PayAsYouGo,
    Unlimited
}

class PayAsYouGoCustomer extends Customer{

    public CustomerType type;
    public PayAsYouGoCustomer() {
        this.type = CustomerType.PayAsYouGo;
    }

    @Override
    public MonthlyStatement generateStatement(MonthlyUsage usage) {
        MonthlyStatement statement = new MonthlyStatement();
        statement.callCost = 0.12 * usage.callMinutes;
        statement.smsCost = 0.12 * usage.smsCount;
        statement.totalCost = statement.callCost + statement.smsCost;
        return statement;
    }
}

class UnlimitedCustomer extends Customer{

    public CustomerType type;

    public UnlimitedCustomer() {
        this.type = CustomerType.Unlimited;
    }

    @Override
    public MonthlyStatement generateStatement(MonthlyUsage usage) {
        MonthlyStatement statement = new MonthlyStatement();
        statement.totalCost = 54.90;
        return statement;
    }
}

class MonthlyStatement {

    public double callCost;
    public double smsCost;
    public double totalCost;

    public MonthlyStatement generate(MonthlyUsage usage)
    {
        Customer customer;
        switch (usage.customer.type){
            case Unlimited:
                customer = new UnlimitedCustomer();
                return customer.generateStatement(usage);
            case PayAsYouGo:
                customer = new PayAsYouGoCustomer();
                return customer.generateStatement(usage);
            default:
                throw new UnsupportedOperationException(
                        "The current customer type is not supported");
        }
    }
}

class MonthlyUsage
{
    public Customer customer;
    public int callMinutes;
    public int smsCount;

}