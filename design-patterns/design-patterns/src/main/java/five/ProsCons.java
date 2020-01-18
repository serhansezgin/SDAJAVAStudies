package five;

public class ProsCons {

    /**
     * PROS :
     *  - It separates product construction code from the code
     *  that actually uses the product.
     *
     *  - So it’s easier to extend the product construction
     *  code independently from the rest of the code.
     *
     *  - If we need to add another type, we can add a new class
     *  extends abstract class or imp interface
     *    and start using it. It is open for extension,
     *    closed for modification. Open-Closed Principle
     *
     *  - You can move the product creation code into
     *  one place in the program. Single Responsibility Principle
     *
     *  - You avoid tight coupling between the creator and
     *  the concrete products. Provides loose coupling
     *
     * CONS:
     *  - The code may become more complicated since you need to introduce
     *  a lot of new subclasses to implement the pattern.
     *
     *  - Remember the switch example from clean code.
     *  Everything in one class but here we have at least 4 classes
     *
     */
}
