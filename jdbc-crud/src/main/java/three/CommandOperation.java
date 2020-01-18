package three;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CommandOperation {

    /**
     * Problem :
     *
     * What if we need to add a new record to db ?
     * or modify our existing record...
     * or delete our existing record ?
     *
     */
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:tcp://localhost/~/test";

    public void insertOperation(int id, String street, int houseNumber, String city, String pc){
        try{
            Class.forName (JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, "sa","");
            Statement stmt = conn.createStatement();
            if(stmt != null) {
                System.out.println("Insert operation starting...");
                int result = stmt.executeUpdate("INSERT INTO ADDRESS(ID,STREET,HOUSE_NUMBER,CITY,PC) " +
                        "VALUES " +
                        "(" + id + ", '" + street + "', " + houseNumber + ", '" + city + "', " +
                        "'" + pc + "')");
                System.out.println("Insert result: " + (result == 1 ? "OK" : "ERROR"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void updateOperation(int id, String street, int houseNumber, String city, String pc){
        try{
            Class.forName (JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, "sa","");
            Statement stmt = conn.createStatement();

            if(stmt != null) {
                System.out.println("Update operation starting...");
                int result = stmt.executeUpdate("UPDATE ADDRESS SET STREET='"+ street+"', " +
                        "HOUSE_NUMBER="+houseNumber+", CITY='"+city+"', PC='"+pc+"' " +
                        "WHERE id = "+ id +"");

                System.out.println("Update result: " + (result == 1 ? "OK" : "ERROR"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * So the next task is implementing delete operation.
     *
     *
     */

    public void deleteOperation(int id){
        try{
            Class.forName (JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, "sa","");
            Statement stmt = conn.createStatement();

            if(stmt != null) {
                System.out.println("Delete operation starting...");
                int result = stmt.executeUpdate("DELETE FROM ADDRESS " +
                        "WHERE id = "+ id +"");

                System.out.println("Delete result: " + (result == 1 ? "OK" : "ERROR"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    /**
     *  All good ?
     *  A question : just recapping our previous topics,
     *  what would you change in this class ?
     *
     */
}
