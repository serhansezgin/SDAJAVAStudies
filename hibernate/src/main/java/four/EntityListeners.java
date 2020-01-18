package four;

public class EntityListeners {

    /**
     * Entity listeners and Callback methods
     *
     * @PrePersist Executed before the entity manager persist operation is actually executed
     * @PreRemove Executed before the entity manager remove operation is actually executed
     * @PostPersist Executed after the entity manager persist operation is actually executed.
     * This call is invoked after the database INSERT is executed.
     * @PostRemove Executed after the entity manager remove operation is actually executed
     * @PreUpdate Executed before the database UPDATE operation.
     * @PostUpdate Executed after the database UPDATE operation.
     * @PostLoad Executed after an entity has been loaded into the current persistence context or an entity has been refreshed.
     *
     */


    /**
     * Callback methods are useful when we need to do some operations before/after
     * db interactions.
     *
     * For ex, we have customer table.
     * Customer information is sensitive data. We would like to know who is updated
     * when is updated/ created.
     *
     */

}
