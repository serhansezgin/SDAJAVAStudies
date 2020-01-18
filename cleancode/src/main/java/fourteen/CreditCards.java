package fourteen;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class CreditCards {
    /*
    implement factory design pattern for different kind of credit cards
    money back credit card
    titanium credit card
    platinum credit card
     */
}


//Product
abstract class CreditCard{

}

//Concrete Product
class MoneyBackCreditCard extends CreditCard{
    public MoneyBackCreditCard(){

    }
}

class TitaniumCreditCard extends CreditCard{
    public TitaniumCreditCard(){

    }
}

class PlatinumCreditCard extends CreditCard{
    public PlatinumCreditCard() {
    }
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
            return new PlatinumCreditCard();

        throw new NotImplementedException();

    }

}



class CreditCardTest {

    private static CreditCardFactory creditCardFactory = new CreditCardFactoryImpl() {

        public static void main(String[] args) {

            CreditCard titanium = creditCardFactory.getCreditCard("Titanium");

            CreditCard platinum = creditCardFactory.getCreditCard("Platinum");

            CreditCard moneyback = creditCardFactory.getCreditCard("MoneyBack")

        }

    }
}


