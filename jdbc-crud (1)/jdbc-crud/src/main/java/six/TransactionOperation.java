package six;

import java.sql.*;

public class TransactionOperation {


    /**
     * How to do transaction operation?
     *
     * 1. connection.setAutoCommit(false);
     *    it is true by default
     *
     * 2. If any action fails on the way,
     *    connection.rollback();
     *
     * 3. If all succeed
     *    connection.commit();
     *
     *
     *
     */

    private Connection conn = null;
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String SELECT = "SELECT * FROM ADDRESS WHERE id = ?";
    private static final String INSERT = "INSERT INTO Address (ID,STREET,HOUSE_NUMBER,CITY,PC) VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE ADDRESS SET STREET = ?, HOUSE_NUMBER = ?, CITY = ? , PC = ? WHERE ID = ?";


    public TransactionOperation(){
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

    private void setAutoCommit(boolean isAutoCommit){
        if(conn != null){
            try {
                conn.setAutoCommit(isAutoCommit);
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    private void commit(){
        if(conn != null){
            try {
                conn.commit();
                System.out.println("COMMIT");
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    private void rollback(){
        if(conn != null){
            try {
                conn.rollback();
                System.out.println("ROLLBACK");
            } catch (SQLException ex){
                ex.printStackTrace();
            }
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
                    String pk = rs.getString("PC");
                    System.out.println(id + ", " + street + ", " + houseNumber + ", " + city + ", " + pk);
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

    private boolean insertOperation(int id, String street, int houseNumber, String city, String pc){
        try{
            if(conn != null) {
                PreparedStatement pstmt = conn.prepareStatement(INSERT);
                pstmt.setInt(1, id);
                pstmt.setString(2, street);
                pstmt.setInt(3, houseNumber);
                pstmt.setString(4, city);
                pstmt.setString(5, pc);
                int result = pstmt.executeUpdate();
                System.out.println("Insert return: " + (result == 1 ? "OK" : "ERROR"));
                return result == 1;
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        throw new RuntimeException("ups something went wrong");
    }

    private boolean updateOperation(int id, String street, int houseNumber, String city, String pc){
        try{
            if(conn != null) {
                PreparedStatement pstmt = conn.prepareStatement(UPDATE);
                pstmt.setString(1, street);
                pstmt.setInt(2, houseNumber);
                pstmt.setString(3, city);
                pstmt.setString(4, pc);
                pstmt.setInt(5, id);
                int result = pstmt.executeUpdate();
                System.out.println("Update return: " + (result == 1 ? "OK" : "ERROR"));
                return result == 1;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        throw new RuntimeException("ups something went wrong");
    }


    private static final String DELETE = "DELETE FROM ADDRESS WHERE id = ?";
    private boolean deleteOperation(int id){
        try{
            if(conn != null) {
                PreparedStatement pstmt = conn.prepareStatement(DELETE);
                pstmt.setInt(1, id);
                int result = pstmt.executeUpdate();
                System.out.println("Delete return: " + (result == 1 ? "OK" : "ERROR"));
                return result == 1;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        throw new RuntimeException("ups something went wrong");
    }

    public static void transactionOperation() throws RuntimeException {
        TransactionOperation command = new TransactionOperation();
        command.setAutoCommit(false);
        boolean status = command.insertOperation
                (8,"test", 25, "Tallinn", "10000");

        if(status) {
            command.selectOperation(8);

            status = command.updateOperation
                    (8,"hello", 4, "test", "dvbh");
            command.selectOperation(8);
        }

        /*if(status) {
            int id = command.selectOperation(6);
            status = command.deleteOperation(id);
            command.selectOperation(6);
        }*/
        /*if(status){
            command.commit();
        }else{
            command.rollback();
        }*/
        command.rollback();
        command.commit();
        command.selectOperation(8);
        //command.setAutoCommit(true);

    }


    public static void main(String[] args) {
        transactionOperation();
    }

}
