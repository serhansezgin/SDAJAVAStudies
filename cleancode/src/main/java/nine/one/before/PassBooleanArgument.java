package nine.one.before;

public class PassBooleanArgument {

    // Flag Argument

    /** Problem :
        make a reservation for customer
        There are after ways of reservation :
        Superior and Regular
     **/

}

class Restaurant{

    public Reservation reserve (Customer customer, boolean isSuperior) {
        Reservation reservation = new Reservation();
        if (isSuperior) {
            // add superior feature
        } else { // Regular reservation
            // make a regular reservation
        }
        return reservation;
    }

}

class Reservation{}

class Customer{
    String id;
}