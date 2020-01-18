package thirteen.liskov.substitution.principle;

import java.math.BigDecimal;

public class LiskovSubstitutionPrinciple {

    /**
     * if S is a subtype of T, then objects of type T may be replaced with objects of type S
     * (i.e. an object of type T may be substituted with any object of a subtype S)
     * without altering any of the desirable properties of the program (correctness, task performed, etc.)
     */


    /**
     * Problem :
     *
     * There are different types of saving accounts:
     * Salary, Regular, Deposit, Fund, ...
     *
     *
     */
}

class AccountService{

    public void doOperations(){
        AccountManager accountManager = new AccountManager();
        //works ok
        accountManager.withdrawFromAccount(new RegularAccount(), BigDecimal.TEN);
        accountManager.withdrawFromAccount(new SalaryAccount(), BigDecimal.TEN);
        accountManager.withdrawFromAccount(new DepositAccount(), BigDecimal.TEN);
    }
}

class AccountManager {

    boolean withdrawFromAccount(SavingAccount account, BigDecimal amount) {
        return account.withdraw(amount);
    }
}

abstract class SavingAccount{

    abstract BigDecimal checkBalance();

    abstract BigDecimal transferAmount();

    abstract BigDecimal checkAccountStatement();

    abstract boolean withdraw(BigDecimal amount);

}

class RegularAccount extends SavingAccount{

    @Override
    BigDecimal checkBalance() {
        return null;
    }

    @Override
    BigDecimal transferAmount() {
        return null;
    }

    @Override
    BigDecimal checkAccountStatement() {
        return null;
    }

    @Override
    boolean withdraw(BigDecimal amount) {
        return true;
    }
}

class SalaryAccount extends SavingAccount{

    @Override
    BigDecimal checkBalance() {
        return null;
    }

    @Override
    BigDecimal transferAmount() {
        return null;
    }

    @Override
    BigDecimal checkAccountStatement() {
        return null;
    }

    @Override
    boolean withdraw(BigDecimal amount) {
        return true;
    }
}

class DepositAccount extends SavingAccount{

    @Override
    BigDecimal checkBalance() {
        return null;
    }

    @Override
    BigDecimal transferAmount() {
        return null;
    }

    @Override
    BigDecimal checkAccountStatement() {
        return null;
    }

    @Override
    boolean withdraw(BigDecimal amount)  {

        throw new  UnsupportedOperationException();
    }
}