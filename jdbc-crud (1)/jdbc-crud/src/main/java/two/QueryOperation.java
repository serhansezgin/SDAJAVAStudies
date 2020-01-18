package two;

import java.sql.*;

public class QueryOperation {

    /**
     *
     * Problem :
     *
     * Let's reach out the data we already have in our db.
     *
     */


    /**
     *  Solution
     *      * - Wait...Do we have a db ?
     *      * - Let's do first database operation via our application code.
     *      * - Remember the flow
     *      * - Let's create a table
     *      * - Do basic select operation
     *
     */
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:tcp://localhost/~/test";

    public static void queryOperation(){
        int counter = 0;
        try {
            Class.forName (JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, "sa","");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ADDRESS");

            System.out.println("Displaying the table records....");

            while(rs.next()){
                counter++;
                int id = rs.getInt("ID");
                String street = rs.getString("STREET");
                int houseNumber = rs.getInt("HOUSE_NUMBER");
                String city = rs.getString("CITY");
                String postalCode = rs.getString("PC");

                System.out.println(id + ", " + street + ", "
                        + houseNumber + ", " + city + ", " + postalCode);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("record number is " + counter);
    }
}
