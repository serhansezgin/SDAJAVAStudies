package five.two;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Example {

    /**
     *
     * Implement Factory Design Pattern for different kind of credit cards
     *
     * MoneyBackCreditCard
     * TitaniumCreditCard
     * PlatinumCreditCard
     *
     *
     */
}

// Product
abstract class CreditCard{

}
// Concrete product
class MoneyBackCreditCard extends CreditCard{

}

class TitaniumCreditCard extends CreditCard{

}

class PlatiniumCreditCard extends CreditCard{

}

interface CreditCardFactory{

    CreditCard getCreditCard(String cardType);
}

class CreditCardFactoryImpl implements CreditCardFactory{

    public CreditCard getCreditCard(String cardType) {
        if(cardType.equals("MoneyBack"))
            return new MoneyBackCreditCard();
        else if(cardType.equals("Titanium"))
            return new TitaniumCreditCard();
        else if(cardType.equals("Platinium"))
            return new PlatiniumCreditCard();

        throw new NotImplementedException();
    }
}


class CreditCardTest{

    private static CreditCardFactory creditCardFactory = new CreditCardFactoryImpl();

    public static void main(String[] args) {

        CreditCard titanium = creditCardFactory.getCreditCard("Titanium");

    }
}