package five.one;

import java.util.ArrayList;
import java.util.List;

public class Factory {
}

enum AccountType {
    BASIC,
    INTEREST,
    DEPOSIT,
    RETIREMENT,
    STUDENT
}

// Product
abstract class SavingAccount{

}

//Concrete product
class BasicSavingAccount extends SavingAccount{
    public BasicSavingAccount() {
        System.out.println("Basic account is creating...");
    }
}

//Concrete product
class InterestSavingAccount extends SavingAccount {

    public InterestSavingAccount() {
        System.out.println("Interest account is creating...");
    }
}

// Concrete product
class DepositSavingAccount extends SavingAccount {
    public DepositSavingAccount() {
        System.out.println("Deposit saving account is creating...");
    }
}

//Creator
interface AccountFactory{
    SavingAccount getSavingAccount(AccountType type);
}

// Concrete Creators
class  AccountFactoryImpl implements AccountFactory{

    public SavingAccount getSavingAccount(AccountType type) {
        switch (type){
            case BASIC: return new BasicSavingAccount();
            case INTEREST: return new InterestSavingAccount();
            case DEPOSIT:return new DepositSavingAccount();
            default: throw new RuntimeException("No account type found.");
        }
    }
}

class TestAccountFactoryImpl{
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactoryImpl();

        SavingAccount basic = accountFactory.getSavingAccount(AccountType.BASIC);
        SavingAccount interest = accountFactory.getSavingAccount(AccountType.INTEREST);
        SavingAccount deposit = accountFactory.getSavingAccount(AccountType.DEPOSIT);

        List<String> x = new ArrayList<String>();
    }
}
