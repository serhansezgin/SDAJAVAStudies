package homework;

import java.sql.*;

public class MoneyTransfer {

    private Connection conn = null;
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String SELECT = "SELECT * FROM ACCOUNT WHERE id = ?";
    private static final String UPDATE = "UPDATE ACCOUNT SET AMOUNT = ? WHERE ID = ?";


    public MoneyTransfer(){
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

    private Double selectOperation(int id){
        try{
            if(conn != null) {
                PreparedStatement pstmt = conn.prepareStatement(SELECT);
                pstmt.setInt(1, id);
                ResultSet rs = pstmt.executeQuery();
                boolean next = rs.next();
                if(next) {
                    String iban = rs.getString("IBAN");
                    String customerName = rs.getString("CUSTOMER_NAME");
                    Double amount = rs.getDouble("AMOUNT");
                    System.out.println(id + ", " + iban + ", " + customerName + ", " + amount );
                    return amount;
                }
            }else{
                throw new RuntimeException("There is no connection");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        throw new RuntimeException("Upps something went wrong...");
    }

    private boolean updateOperation(int id, Double amount){
        try{
            if(conn != null) {
                PreparedStatement pstmt = conn.prepareStatement(UPDATE);
                pstmt.setDouble(1, amount);
                pstmt.setInt(2,id);
                int result = pstmt.executeUpdate();
                System.out.println("Update return: " + (result == 1 ? "OK" : "ERROR"));
                return result == 1;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        throw new RuntimeException("ups something went wrong");
    }


    public static void main(String[] args) {
        MoneyTransfer transfer = new MoneyTransfer();
        System.out.println("Let's transfer some money from one account to another");
        System.out.println("As our auto commit is true, I think I can lose out some money.Let's try:)");

        Double aIbanAmount = transfer.selectOperation(1);
        Double bIbanAmount = transfer.selectOperation(2);

       /* System.out.println("I want to transfer some money from B_IBAN to A_IBAN");

        System.out.println("Reducing 100 euro from A IBAN ");
        transfer.updateOperation(1, aIbanAmount-100);

        // What if something happen on the way ?
        // In IT it's pretty common case
        // We never assume everything goes well.
        // It is just a demo
        String x = null;
        x.substring(1);

        // we just got null pointer exception.
        // the rest of code did not run.

        System.out.println("Increasing 100 euro from B IBAN ");
        transfer.updateOperation(2, bIbanAmount+100);


        aIbanAmount = transfer.selectOperation(1);
        bIbanAmount = transfer.selectOperation(2);


        System.out.println("Solution is using auto commit and rollbacks in the right place");
*/

        try {
            transfer.setAutoCommit(false);
            aIbanAmount = transfer.selectOperation(1);
            bIbanAmount = transfer.selectOperation(2);

            System.out.println("I want to transfer some money from B_IBAN to A_IBAN");

            System.out.println("Reducing 100 euro from B IBAN ");
            transfer.updateOperation(2, bIbanAmount-100);

            String x = null;
            x.substring(1);

            System.out.println("Increasing 100 euro from B IBAN ");
            transfer.updateOperation(1, aIbanAmount+100);

            transfer.commit();

        }catch (Exception ex){
            transfer.rollback();
            transfer.commit();
            ex.printStackTrace();

        }


    }

}
