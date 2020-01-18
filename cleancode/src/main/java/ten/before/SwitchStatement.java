package ten.before;

public class SwitchStatement {
    /**
     * Problem:
     * we have different types of customer : PayAsYouGo, Unlimited,...
     *
     * Calculate customer's total cost of monthly usage
     * it gets an argument
     *
     */
}

class MonthlyStatement{

    public double callCost;
    public double smsCost;
    public double totalCost;

    public void generate(MonthlyUsage usage)
    {
        switch (usage.customer.type)
        {
            case PayAsYouGo:
                callCost = 0.12 * usage.callMinutes;
                smsCost = 0.12 * usage.smsCount;
                totalCost = callCost + smsCost;
                break;

            case Unlimited:
                totalCost = 54.90;
                break;

            default:
                throw new UnsupportedOperationException(
                        "The current customer type is not supported");
        }
    }
}

class Customer
{
    public CustomerType type;
}

enum CustomerType
{
    PayAsYouGo,
    Unlimited
}

class MonthlyUsage
{
    public Customer customer;
    public int callMinutes;
    public int smsCount;


}