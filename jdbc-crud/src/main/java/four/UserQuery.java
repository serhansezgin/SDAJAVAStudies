package four;

import java.sql.*;

public class UserQuery {

    /**
     *
     * - Let's create a user table for login feature in our web application
     * - A table has 4 column :
     *      - ID
     *      - USERNAME
     *      - PASSWORD
     *      - EMAIL
     *
     * - Let's do a basic select operation for login
     *
     */


    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:tcp://localhost/~/test";

    private static void queryOperation(String username, String password){

        try {
            Class.forName (JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, "sa","");
            Statement stmt = conn.createStatement();
            System.out.println("Querying users...");
            String sql = "SELECT * FROM USER WHERE " +
                    "USERNAME = '" + username + "' AND PASSWORD = '" + password + "' ";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println("Username: " + rs.getString("USERNAME")
                        + " Password: " +
                        rs.getString("PASSWORD"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*public static void main(String[] args) {
        queryOperation("feride","12345");
        queryOperation("hello", "world");
    }*/





    /**
     *
     * So what if I change the query a bit ?
     *
     * Something like ....
     *
     * SELECT * FROM USER WHERE USERNAME='hello' and PASSWORD='world' or '1' = '1'
     *
     */

    /*public static void main(String[] args) {
        System.out.println("query with sql injection....");
        queryOperation("hello", "world' or '1' = '1");
    }*/

    /**
     * SQL INJECTION !!!!!!!!!!!!!!!
     *
     * - It is one of the most web hacking techniques
     * - 1=1 is Always True
     * - It is malicious sql statements inserted into an entry filed for execution.
     * - Btw the previous example was very optimistic
     * - what if I would add something like this ?
     *
     *          DROP TABLE users;
     *
     *
     *
     */

    public static void main(String[] args) {
        System.out.println("query with sql injection....");
        queryOperation("hello", "world';DROP TABLE USER;'");
    }

    /**
     * And no user table found now
     *
     * What's the solution ?
     *
     * Prepared statement!
     *
     */



}
