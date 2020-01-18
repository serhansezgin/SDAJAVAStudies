package five;

import java.sql.*;

public class PreparedStatementOperation {

    private Connection conn = null;
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String SELECT = "SELECT * FROM ADDRESS WHERE id = ?";
    private static final String INSERT = "INSERT INTO Address (ID,STREET,HOUSE_NUMBER,CITY,PC) VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE ADDRESS SET STREET = ?, HOUSE_NUMBER = ?, CITY = ? , PC = ? WHERE ID = ?";


    public PreparedStatementOperation(){

        String url = "jdbc:h2:tcp://localhost/~/test";
        String user = "sa";
        String pass = "";

        try {
            Class.forName (JDBC_DRIVER);
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private int selectOperation(int id){
        try{
            if(conn != null) {
                PreparedStatement pstmt = conn.prepareStatement(SELECT);
                pstmt.setInt(1, id);
                ResultSet rs = pstmt.executeQuery();
                boolean next = rs.next();
                if(next) {
                    String street = rs.getString("STREET");
                    int houseNumber = rs.getInt("HOUSE_NUMBER");
                    String city = rs.getString("CITY");
                    String pc = rs.getString("PC");
                    System.out.println(id + ", " + street + ", " + houseNumber + ", " + city + ", " + pc);
                    return id;
                }else{
                    return -1;
                }
            }else{
                throw new RuntimeException("There is no connection");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    private void insertOperation(int id, String street, int houseNumber, String city, String pc){
        try{
            if(conn != null) {
                PreparedStatement pstmt = conn.prepareStatement(INSERT);
                pstmt.setInt(1, id);
                pstmt.setString(2, street);
                pstmt.setInt(3, houseNumber);
                pstmt.setString(4, city);
                pstmt.setString(5, pc);
                int ret = pstmt.executeUpdate();
                System.out.println("Insert return: " + (ret == 1 ? "OK" : "ERROR"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    private void updateOperation(int id, String street, int houseNumber, String city, String pc){
        try{
            if(conn != null) {
                PreparedStatement pstmt = conn.prepareStatement(UPDATE);
                pstmt.setString(1, street);
                pstmt.setInt(2, houseNumber);
                pstmt.setString(3, city);
                pstmt.setString(4, pc);
                pstmt.setInt(5, id);
                int ret = pstmt.executeUpdate();
                System.out.println("Update return: " + (ret == 1 ? "OK" : "ERROR"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PreparedStatementOperation operation = new PreparedStatementOperation();
        int address = operation.selectOperation(5);
        System.out.println(address != -1 ? "Found" : "Not found");
        operation.insertOperation(5,"Suur Amerika", 25, "Tallinn", "10000");

        operation.updateOperation(1,"xxx", 4, "Narva", "dvbh");
        operation.selectOperation(1);
    }



    /**
     * Let's implement delete operation.
     *
     */





    private static final String DELETE = "DELETE FROM ADDRESS WHERE id = ?";

    private void deleteOperation(int id){
        try{
            if(conn != null) {
                PreparedStatement pstmt = conn.prepareStatement(DELETE);
                pstmt.setInt(1, id);
                int ret = pstmt.executeUpdate();
                System.out.println("Delete return: " + (ret == 1 ? "OK" : "ERROR"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }


    /**
     * So we use PreparedStatement over Statement
     * 1. The first reason is sql injection
     * 2. PreparedStatement allows us to execute dynamic queries with parameter inputs
     * 3. PreparedStatement is faster than Statement
     *      - why is it fast ?
     *      - because prepared statement compiled once
     *      - it will be faster for repeated execution of dynamic sql - where the params change
     * 4. PreparedStatement helps us in writing object Oriented code with setter methods
     * whereas with Statement we have to use String Concatenation to create the query.
     *
     * 5. It can be reusable with new parameter values.
     *
     */

}
