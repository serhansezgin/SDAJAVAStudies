package three.one.before;

import java.util.Date;

public class HowToUse {

    public static void main(String[] args) {
        Customer customer = new Customer(1L);

        Customer customerWithSome = new Customer(1L,"Feride","","Celik");
        Customer customerWithAll = new Customer(1L,"Feride","","Celik",
                new Date(),"fferide.celik@gmail.com","");

        Customer another = new Customer(1L,"Feride","","Celik", new Date());
    }
}
