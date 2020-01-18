package two;

public class IntroductionToEntity {

    /**
     *
     * Let's create one table / or use existing one
     * - Define the entity of this table
     * - Map the fields
     * - Define their types 
     *
     * But before we start, we need to figure out how to connect
     * to the database via hibernate framework!
     *
     *
     * There are two ways to connect to db via hibernate
     *      - via hibernate.cfg.xml
     *      - via Configuration class
     *
     * Let's see what happens if we pick hibernate.cfg.xml
     *
     *       - hibernate.cfg.xml
     *       - table.hbm.xml
     *       - POJO(Plain old java object) class
     *       - we need to do additional mapping between POJO and hbm.xml
     *
     * CREATE TABLE
     *     ADDRESS(
     *          ID INT PRIMARY KEY,
     *          STREET VARCHAR(255),
     *          HOUSE_NUMBER INT,
     *          CITY VARCHAR(255),
     *          PC VARCHAR(255));
     *
     */
}
