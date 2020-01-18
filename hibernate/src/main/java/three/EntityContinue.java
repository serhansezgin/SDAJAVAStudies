package three;

public class EntityContinue {

    /**
     *
     * An entity class is essentially an object wrapper for a database table.
     *
     * For entity, we have two specifications : JPA, Hibernate
     *
     * JPA specification :
     *
     * - It must have no arg constructor
     * - The entity class must not be final.
     * - An enum or interface may not be designated as an entity.
     *
     *
     * Hibernate:
     * - The entity class must have a no-argument constructor
     * - Technically Hibernate can persist final classes
     *  or classes with final persistent state accessor
     *  - A class that acts as an identifier must
     *  implement equals/hashCode based on the id value(s)
     *  - ....
     *
     *  A specification is an explicit set of rules that define how to implement a use case
     *  A framework facilitates and structures the actual implementation of a use case
     *
     */
}
