package six;

public class Transaction {

    /**
     *
     *
     * What is transaction ?
     *
     * Transaction is a set of actions to be carried out as a single, atomic action
     *
     * Ex :
     *      - Transferring money from one account to another account
     *             - request to send X amount of money from A to B
     *             - reduce X amount of money from A account
     *             - increase X amount of money in B account
     *
     *      - Movie ticket booking
     *              - Choose the seats.
     *              - Reserve the seats.
     *              - Payment.
     *              - Issue the movie tickets.
     *
     *  The ACID RULE
     *
     *  Atomicity: Atomicity of a transaction is defined as either all the operations can be done
     *  or all the operation can be undone, but some operations are done and some operation is undone
     *  should not occur.
     *
     * Consistency: Consistency means, after a transaction is completed successfully,
     * the data in the datastore should be a reliable data and this reliable data is also called
     * as consistent data.
     *
     * Isolation: Isolation means any transaction is independent of another,
     * and your result doesn’t depends of any other.
     *
     * Durability: Durability means after a transaction is completed the data in the datastore
     * will be permanent until another transaction is going to be performed on that data.
     *
     *
     *
     */


}
