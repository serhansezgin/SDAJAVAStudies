package three.one.after;

public class HowToUse {

    public static void main(String[] args) {
        Customer customerWithIdFirstName = new Customer.CustomerBuilder(1L)
                .firstName("Feride").build();

        Customer customerWithAll = new Customer.CustomerBuilder(1L).firstName("Feride")
                .lastName("Celik").email("fferide.celik@gmail.com").build();
    }


}
